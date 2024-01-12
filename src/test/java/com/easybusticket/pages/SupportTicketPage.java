package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import com.easybusticket.utilities.PropManager;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

@Slf4j
public class SupportTicketPage extends BasePage{
    public SupportTicketPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }

    @FindBy(xpath = "//*[text()='Subject']")
    public WebElement columnSubject;

    @FindBy(xpath = "//*[text()='Status']")
    public WebElement columnStatus;

    @FindBy(xpath = "//*[text()='Priority']")
    public WebElement columnPriority;

    @FindBy(xpath = "//*[text()='Last Reply']")
    public WebElement columnLastReply;

    @FindBy(xpath = "//*[text()='Action']")
    public WebElement columnAction;

    @FindBy(xpath = "//a[@class='btn btn--base btn-sm']")
    public WebElement newTicketButton;

    //The request in the first place
    @FindBy(xpath = "//a[@class='font-weight-bold']")
    public WebElement rowFirstRequest;

    //detail button for the first request
    @FindBy(xpath = "//*[@class='fa fa-desktop']")
    public WebElement actionButton;

    @FindBy(xpath = "//*[@class='card-title m-0 text-white']")
    public WebElement labelOpenedRequestTitle;
    @FindBy(xpath = "//*[@id='inputAttachments']")
    public WebElement selectFileButton;

    @FindBy(xpath = "//*[@class='btn btn--base mt-md-4 mt-2 h-40']")
    public WebElement replyButton;

    @FindBy(xpath = "//*[@class='form-control form--control shadow-none']")
    public WebElement yourReplyBox;

    @FindBy(xpath = "//*[@class='col-md-9 ps-2']")
    public WebElement labelLastRequestMessage;

    @FindBy(xpath = "//a[text()='Support Request']")
    public WebElement dropDownSupportRequest;

    @FindBy(xpath = "//a[text()='Requests']")
    public WebElement requestsOption;

    @FindBy(xpath = "//a[@class='btn btn-sm bg-white float-right support-ticket']")
    public WebElement mySupportTicketButton;

    @FindBy(xpath = "//*[@name='name']")
    public WebElement textBoxOfNameButton;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement textBoxOfEmailButton;

    @FindBy(xpath = "//input[@name='subject']")
    public WebElement textBoxOfSubject;

    @FindBy(xpath = "//*[@name='priority']")
    public WebElement dropDownPriority;

    @FindBy(xpath = "//*[@id='inputMessage']")
    public WebElement textBoxOfMessage;

    @FindBy(xpath = "//*[@class='fas fa-plus']")
    public WebElement extraFileButton;

    @FindBy(xpath = "//*[@class='btn btn--base h-40']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[text()='High']")
    public WebElement optionPriorityHigh;




    public void requestHistoryPageVerifyTest(){
        //columnSubject.isDisplayed();
        softAssert.assertTrue(columnSubject.isDisplayed());
        softAssert.assertTrue(columnStatus.isDisplayed());
        softAssert.assertTrue(columnPriority.isDisplayed());
        softAssert.assertTrue(columnLastReply.isDisplayed());
        softAssert.assertTrue(columnAction.isDisplayed());
        softAssert.assertTrue(newTicketButton.isDisplayed());
        softAssert.assertTrue(rowFirstRequest.isDisplayed());
        softAssert.assertTrue(actionButton.isDisplayed());

        waitAndClick(actionButton);
        log.info("Request Detail Page loaded");
        softAssert.assertTrue(labelOpenedRequestTitle.isDisplayed());
        softAssert.assertTrue(selectFileButton.isDisplayed());
        softAssert.assertTrue(replyButton.isDisplayed());
        softAssert.assertTrue(yourReplyBox.isDisplayed());
        softAssert.assertTrue(labelLastRequestMessage.isDisplayed());
        waitAndClick(dropDownSupportRequest);
        waitAndClick(requestsOption);
        softAssert.assertAll();


    }

    public void requestHistoryNewTicketTest(){
        waitAndClick(newTicketButton);
        softAssert.assertTrue(mySupportTicketButton.isDisplayed());
        softAssert.assertTrue(textBoxOfNameButton.isDisplayed());
        softAssert.assertTrue(textBoxOfEmailButton.isDisplayed());
        waitAndClick(textBoxOfSubject);
        textBoxOfSubject.sendKeys(PropManager.getProperties(env, "us16Subject"));
        waitAndClick(dropDownPriority);
        actions.click(dropDownPriority).sendKeys(Keys.DOWN).click();
        softAssert.assertTrue(textBoxOfMessage.isDisplayed());
        textBoxOfMessage.sendKeys(PropManager.getProperties(env, "us16Message"));
        softAssert.assertTrue(selectFileButton.isDisplayed());
        softAssert.assertTrue(extraFileButton.isDisplayed());
        waitAndClick(submitButton);

        String expectedRequestHistoryPageUrl="https://qa.easybusticket.com/ticket";
        String actualRequestHistoryPageUrl=Driver.get(env).getCurrentUrl();
        softAssert.assertEquals(actualRequestHistoryPageUrl,expectedRequestHistoryPageUrl);
        softAssert.assertAll();
        softAssert.assertEquals("Lost Suitcase",rowFirstRequest.getText());

    }
}
