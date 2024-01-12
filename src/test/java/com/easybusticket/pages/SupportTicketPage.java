package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
    @FindBy(xpath = "//i[@class='fa fa-desktop']")
    public WebElement actionButton;

    public void requestHistoryPageVerifyTest(){
        columnSubject.isDisplayed();
        columnStatus.isDisplayed();
        columnPriority.isDisplayed();
        columnLastReply.isDisplayed();
        columnAction.isDisplayed();
        newTicketButton.isDisplayed();
        rowFirstRequest.isDisplayed();
        actionButton.isDisplayed();
        waitAndClick(actionButton);


    }

}
