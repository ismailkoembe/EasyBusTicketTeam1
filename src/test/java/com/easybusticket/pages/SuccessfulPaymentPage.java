package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

@Slf4j
public class SuccessfulPaymentPage extends BasePage{


    public SuccessfulPaymentPage(){
        PageFactory.initElements(Driver.get("stage"),this);
    }
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div/table/tbody/tr/td")
    public WebElement tablePendingPayment;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div[2]/form[2]/div/input[1]")
    public WebElement dateSearchBox;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div[2]/form[1]/div/input")
    public WebElement trxNumberUsernameSearchBox;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div/table/tbody/tr/td[7]/a")
    public WebElement detailActionButtonLink;

    @FindAll({
            @FindBy(xpath = "//thead//tr/th[1]"),
            @FindBy(xpath = "//thead//tr/th[2]"),
            @FindBy(xpath = "//thead//tr/th[3]"),
            @FindBy(xpath = "//thead//tr/th[4]"),
            @FindBy(xpath = "//thead//tr/th[5]"),
            @FindBy(xpath = "//thead//tr/th[6]"),
            @FindBy(xpath = "//thead//tr/th[7]"),

    })
    public List<WebElement> tablePendingPaymentHeaderList;

    @FindBy(xpath = "(//tbody//tr/td)")
    public WebElement dataTableNoTicket;

    @FindBy (xpath = "//td [@data-label='Gateway | Trx\']")
    public WebElement getDataTableWithTicket;


@Step(" search Ticket with PNR Number")
    public void getPNRNumberSearchBoxWithTicket() {
        //Searching mit date without Ticket Scenerio with Ticket
        waitAndClick(trxNumberUsernameSearchBox);
        trxNumberUsernameSearchBox.sendKeys("S54ODNGP7FA1" + Keys.ENTER);
        String actualTextOnTheTable = getDataTableWithTicket.getText();
        String expectedTextOnTheTable = "S54ODNGP7FA1";
        softAssert.assertTrue(actualTextOnTheTable.contains(expectedTextOnTheTable));

        log.info("verified that the text on the table as expected.");


    }
@Step("check the title")
    public void titleSuccessfulPaymentPage(){

        String expectedTitle = "Easy Bus Ticket - Successful Payment";
        String actualTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualTitle,expectedTitle);
        log.info("Title checked.");
        softAssert.assertAll();

    }
    @Step(" search Ticket with Date")
    public void getDateSearchBoxWithTicket() {
        //Searching mit date without Ticket Scenerio with Ticket
        waitAndClick(dateSearchBox);
        dateSearchBox.sendKeys("01/10/2024" + Keys.ENTER);
        String actualDataOnTheTable = getDataTableWithTicket.getText();
        String expectedDataOnTheTable = "K52GYQPKYU3A";
        softAssert.assertTrue(actualDataOnTheTable.contains(expectedDataOnTheTable));

        log.info("verified that the text on the table as expected.");
    }
}
