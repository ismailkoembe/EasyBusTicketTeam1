package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AllRequestsPage extends BasePage{


    public AllRequestsPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/a")
    public WebElement detailsButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div/div/form/div/div[3]/button")
    public WebElement replyTicket;


    @FindBy(xpath = "//*[@id=\"inputMessage\"]")
    public WebElement yourMessageText;

    @FindBy(xpath = "/html/body/div/div[2]/div")
    public WebElement replyRequests;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div/div/h6/div/div[2]/button")
    public WebElement closeTicketButton;
    @FindBy(xpath = "//*[@id=\"DelModal\"]/div/div/div[3]/form/button[2]")
    public WebElement closeTicketGreenButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div/div/div/div[1]/button")
    public WebElement deleteButton;

    @FindBy(xpath="//*[@id=\"DelMessage\"]/div/div/div[3]/form/button[2]")
    public WebElement deleteRedButton;

    @FindBy(xpath ="//*[@id=\"DelMessage\"]/div/div/div[3]/form/button[2]")
    public WebElement deletePopupMessage;


//============================================================================================================//

    public void allRequests() {

        waitAndClick(detailsButton);
        softAssert.assertTrue(yourMessageText.isDisplayed());
        softAssert.assertAll();
        waitAndClick(yourMessageText);

        String Text = "Reserve";
        yourMessageText.sendKeys(Text);
        waitAndClick(replyTicket);

    }



    public void replyRequests() {

        waitAndClick(detailsButton);
        softAssert.assertTrue(replyRequests.isDisplayed());
        softAssert.assertAll();

        waitAndClick(closeTicketButton);
        waitAndClick(closeTicketGreenButton);

    }
    public void deleteReply() {

        waitAndClick(detailsButton);
        waitAndClick(deleteButton);

        softAssert.assertTrue(deletePopupMessage.isDisplayed());


        waitAndClick(deleteRedButton);

        softAssert.assertAll();
    }

    }




