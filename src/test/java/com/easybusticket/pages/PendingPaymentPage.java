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
public class PendingPaymentPage extends BasePage {
    public PendingPaymentPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }


    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div/table/tbody/tr/td")
    public WebElement tablePendingPayment;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div[2]/form[2]/div/input[1]")
    public WebElement dateSearchBox;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div[2]/form[1]/div/input")
    public WebElement trxNumberUsernameSearchBox;

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

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div/table/tbody/tr/td[7]/a")
    public WebElement detailButton;
    @FindBy(xpath = "(//tbody//tr/td)")
    public WebElement dataTableNoTicket;

    @FindBy(xpath = "//td [@data-label=\"User\"]")
    public WebElement getDataTableWithTicket;


    public void searchingTicketNoTicket() {
        //Searching mit date without Ticket Scenerio
        waitAndClick(dateSearchBox);

        //enter a time period in the past when no tickets were received.
        dateSearchBox.sendKeys("12/20/2023 - 01/03/2024" + Keys.ENTER);
        String actualResultText = dataTableNoTicket.getText();
        softAssert.assertEquals(actualResultText, "No Payments Found");
        log.info("verified that the text on the table as expected.");
        softAssert.assertAll();
    }
@Step("Search Ticket with PNR")
    public void getPNRNumberSearchBoxWithTicket() {
        //Searching mit date without Ticket Scenerio with Ticket
        waitAndClick(dateSearchBox);
        dateSearchBox.sendKeys("" + Keys.ENTER);

        String actualResultText = getDataTableWithTicket.getText();
        softAssert.assertNotEquals(actualResultText, "No Payments Found");
        log.info("verified that the text on the table as expected.");
        softAssert.assertAll();
    }

    @Step("verify that the pending payment title is")
    public void titlePendingPaymentPage() {

        String expectedTitle = "Easy Bus Ticket - Pending Payment";
        String actualTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualTitle, expectedTitle);
        log.info("title checked.");
        softAssert.assertAll();

    }

    @Step("click detail button on pending page")
    public PaymentDetailsPage clickToDetailButton() {
        waitAndClick(detailButton);
        log.info("Clicked the detail button to new page asPayment details page");
        return new PaymentDetailsPage();
    }


}
