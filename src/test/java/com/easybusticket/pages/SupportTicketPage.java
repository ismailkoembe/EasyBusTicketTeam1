package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import com.easybusticket.utilities.GetAbsolutePath;
import com.easybusticket.utilities.PropManager;
import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


@Slf4j
public class SupportTicketPage extends BasePage {
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

    @FindBy(xpath = "//input[@id='inputAttachments']")
    public WebElement inputAttachmentsForm;

    @FindBy(xpath = "//*[@class='fas fa-plus']")
    public WebElement extraFileButton;

    @FindBy(xpath = "//*[@class='btn btn--base h-40']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[text()='High']")
    public WebElement optionPriorityHigh;

    @FindBy(xpath = "//textarea[@id='inputMessage']")
    public WebElement textareaMessage;

    @FindBy(xpath = "//button/i[@class='fa fa-lg fa-times-circle']")
    public WebElement closeTicketButton;




    /** Ayça Ovali */
    @Step("registered user verified last tickets on the request history section")
    public void requestHistoryPageVerifyTest() {
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
        String expectedRequestHistoryPageTitle = "Easy Bus Ticket - Support Tickets";
        String actualRequestHistoryPageTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualRequestHistoryPageTitle, expectedRequestHistoryPageTitle);
        log.info("returned history page");
        softAssert.assertAll();

    }

    /** Ayca Ovali */
    @Step("registered user clicked the new add ticket from request history")
    public void requestHistoryNewTicketTest() {
        waitAndClick(newTicketButton);
        softAssert.assertTrue(mySupportTicketButton.isDisplayed());
        softAssert.assertTrue(textBoxOfNameButton.isDisplayed());
        softAssert.assertTrue(textBoxOfEmailButton.isDisplayed());
        waitAndClick(textBoxOfSubject);
        textBoxOfSubject.sendKeys(PropManager.getProperties(env, "us16Subject"));
        waitAndClick(dropDownPriority);
        WebElement dropdownElement = driver.findElement(By.xpath("//*[@name='priority']"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByValue("2");
        softAssert.assertTrue(textBoxOfMessage.isDisplayed());
        textBoxOfMessage.sendKeys(PropManager.getProperties(env, "us16Message"));
        String path = GetAbsolutePath.getAbsolutePath(PropManager.getProperties(env, "imgPathLogo"));
        selectFileButton.sendKeys(path);
        softAssert.assertTrue(extraFileButton.isDisplayed());
        waitAndClick(submitButton);
        log.info("The file was uploaded and the submit button was pressed.\n");

        String expectedRequestHistoryPageUrl = "https://qa.easybusticket.com/ticket";
        String actualRequestHistoryPageUrl = Driver.get(env).getCurrentUrl();
        softAssert.assertEquals(actualRequestHistoryPageUrl, expectedRequestHistoryPageUrl);
        softAssert.assertTrue(rowFirstRequest.isDisplayed());
        log.info("new ticket created");
        softAssert.assertAll();

    }

    @Step("User fill the form and submit")
    public void fillTheRestOfForm() {
        textBoxOfSubject.sendKeys("Deneme");
        Select slc = new Select(dropDownPriority);
        slc.getFirstSelectedOption();
        textBoxOfMessage.sendKeys("Deneme Request olusturuldu");

        String path = GetAbsolutePath.getAbsolutePath(PropManager.getProperties(env, "imgPathAttachment"));

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        inputAttachmentsForm.sendKeys(path);
        waitAndClick(submitButton);

    }
    @Step("User click to submit button")
    public void clickToSubmitButton(){
//        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) Driver.get(env);
//        javascriptExecutor.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",mySupportTicketButton);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        waitAndClick(submitButton);
    }
    @Step("User click to My Request button")
    public void clickToMyRequestButton(){
//        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) Driver.get(env);
//        javascriptExecutor.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",mySupportTicketButton);
        //actions.sendKeys(Keys.PAGE_DOWN).perform();
        waitAndClick(mySupportTicketButton);
    }
    @Step("User reply to support ticket")
    public void replyToRequest(){
        textareaMessage.sendKeys("Thanks");
        log.info("Message sent");
        //actions.sendKeys(Keys.PAGE_DOWN).perform();
        //log.info("Page down");
        waitAndClick(replyButton);
    }


}
