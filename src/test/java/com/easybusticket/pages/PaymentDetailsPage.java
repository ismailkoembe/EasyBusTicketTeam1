package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Slf4j
public class PaymentDetailsPage extends BasePage {
    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div[2]/div/div/div/div/button[1]")
    public WebElement approveButton;
    @FindBy(xpath = "//*[@id=\"approveModal\"]/div/div/form/div[2]/button[2]")
    public WebElement approveButtonDeposit;
    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div[2]/div/div/div/div/button[2]")
    public WebElement rejectButton;
    @FindBy(xpath = "//*[@id=\"message\"]")
    public WebElement messageBoxRejectedTicket;
    @FindBy(xpath = "//*[@id=\"rejectModal\"]/div/div/form/div[2]/button[2]")
    public WebElement rejectDeposit;

    public PaymentDetailsPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }

    @Step("check the title")
    public void checkPendingPaymentPageURL() {

        String expectedURL = "https://qa.easybusticket.com/admin/payment/details/718";
        String actualURL = Driver.get(env).getCurrentUrl();
        softAssert.assertEquals(actualURL, expectedURL);
        log.info("title checked.");
        softAssert.assertAll();

    }

    @Step("click to approve button on payment details and then approve the deposit on the allert message.")
    public ApprovePaymentPage clickToApprovePendingTicket() {
        waitAndClick(approveButton);
        waitAndClick(approveButtonDeposit);
        log.info("the ticket is approved");
        return new ApprovePaymentPage();
    }

    @Step(" click to reject button on payment details page and write the messeáge on the box then reject the ticket. ")
    public RejectTicketPage clickToRejectPendingTicket() {
        waitAndClick(rejectButton);
        wait.until(ExpectedConditions.elementToBeClickable(messageBoxRejectedTicket));
        waitAndClick(messageBoxRejectedTicket);
        messageBoxRejectedTicket.sendKeys("Unfortunately, we are cancelling your ticket for non-payment.");
        waitAndClick(rejectDeposit);
        return new RejectTicketPage();
    }


}
