package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
@Slf4j
public class PaymentDetailsPage extends BasePage{
    public PaymentDetailsPage(){
        PageFactory.initElements(Driver.get("stage"),this);
    }

@FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div[2]/div/div/div/div/button[1]")
public WebElement approveButton;

@FindBy(xpath = "//*[@id=\"approveModal\"]/div/div/form/div[2]/button[2]")
public  WebElement approveButtonDeposit;

@FindBy (xpath = "/html/body/div/div[2]/div/div[2]/div[2]/div/div/div/div/button[2]")
public WebElement rejectButton;

@FindBy (xpath = "//*[@id=\"message\"]")
public WebElement messageBoxRejectedTicket;

@FindBy (xpath = "//*[@id=\"rejectModal\"]/div/div/form/div[2]/button[2]")
public WebElement rejectDeposit;

    public void checkPendingPaymentPageURL(){

        String expectedURL = "https://qa.easybusticket.com/admin/payment/details/718";
        String actualURL = Driver.get(env).getCurrentUrl();
        softAssert.assertEquals(actualURL,expectedURL);
        log.info("title checked.");
        softAssert.assertAll();

    }

    public ApprovePaymentPage clickToApprovePendingTicket(){
        waitAndClick(approveButton);

        waitAndClick(approveButtonDeposit);
        return new ApprovePaymentPage();
    }

    public RejectTicketPage clickToRejectPendingTicket(){
        waitAndClick(approveButton);

        waitAndClick(approveButtonDeposit);
        return new RejectTicketPage();
    }


}
