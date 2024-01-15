package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Slf4j
public class PendingPaymentPage extends BasePage {

    public PendingPaymentPage(){
        PageFactory.initElements(Driver.get("stage"),this);
    }

    @FindBy (xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div/table/tbody/tr/td")
    public WebElement tablePendingPayment;

    @FindBy (xpath = "/html/body/div[1]/div[2]/div/div[1]/div[2]/form[2]/div/input[1]")
    public WebElement dateSearchBox;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div[2]/form[1]/div/input")
    public WebElement trxNumberUsernameSearchBox;

    public void titlePendingPaymentPage(){

        String expectedTitle = "Easy Bus Ticket - Pending Payment";
        String actualTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualTitle,expectedTitle);
        softAssert.assertAll();

    }

    //userin havale ile satin aldigi bir biletin Admin tarafindan kontrolunde kullanabiliriz.
    public WebElement getDatasPendingPayment() {
        return tablePendingPayment;
    }

    public WebElement getTrxNumberUsernameSearchBox() {
        return trxNumberUsernameSearchBox;
    }

    public WebElement getDateSearchBox() {
        return dateSearchBox;
    }

    public void setTrxNumberUsernameSearchBox(WebElement trxNumberUsernameSearchBox) {
        this.trxNumberUsernameSearchBox = trxNumberUsernameSearchBox;
    }

    public void setTablePendingPayment(WebElement tablePendingPayment) {
        this.tablePendingPayment = tablePendingPayment;
    }
}
