package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Slf4j
public class BookingHistoryPage extends BasePage {

    public BookingHistoryPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }


    @FindBy(xpath = "/html/body/section[2]/div/div/div/table/tbody/tr/td[10]/div/a")
    public WebElement detailActionButtonLink;

    @FindAll({
            @FindBy(xpath = "//tbody//tr/td[1]"),
            @FindBy(xpath = "//tbody//tr/td[2]"),
            @FindBy(xpath = "//tbody//tr/td[3]"),
            @FindBy(xpath = "//tbody//tr/td[4]"),
            @FindBy(xpath = "//tbody//tr/td[5]"),
            @FindBy(xpath = "//tbody//tr/td[6]"),
            @FindBy(xpath = "//tbody//tr/td[7]"),
            @FindBy(xpath = "//tbody//tr/td[8]"),
            @FindBy(xpath = "//tbody//tr/td[9]"),
            @FindBy(xpath = "//tbody//tr/td[10]")
    })
    public List<WebElement> tableCellsList;


    @FindAll({
            @FindBy(xpath = "//thead//tr/th[1]"),
            @FindBy(xpath = "//thead//tr/th[2]"),
            @FindBy(xpath = "//thead//tr/th[3]"),
            @FindBy(xpath = "//thead//tr/th[4]"),
            @FindBy(xpath = "//thead//tr/th[5]"),
            @FindBy(xpath = "//thead//tr/th[6]"),
            @FindBy(xpath = "//thead//tr/th[7]"),
            @FindBy(xpath = "//thead//tr/th[8]"),
            @FindBy(xpath = "//thead//tr/th[9]"),
            @FindBy(xpath = "//thead//tr/th[10]")
    })
    public List<WebElement> tableHeaderList;

    @FindBy(xpath = "//tr[1]//td [@data-label='Status']")
    public WebElement statusDataRowOne;

    @FindBy(xpath = "//*[@id=\"infoModal\"]/div/div/div[3]/button")
    public WebElement closeButtonOnTheAllert;

    @FindAll({
            @FindBy(xpath = "(//p[@class='d-flex flex-wrap justify-content-between'])[1]"),
            @FindBy(xpath = "(//p[@class='d-flex flex-wrap justify-content-between'])[2]"),
            @FindBy(xpath = "(//p[@class='d-flex flex-wrap justify-content-between'])[3]"),
            @FindBy(xpath = "(//p[@class='d-flex flex-wrap justify-content-between'])[4]"),
            @FindBy(xpath = "(//p[@class='d-flex flex-wrap justify-content-between'])[5]"),
            @FindBy(xpath = "(//p[@class='d-flex flex-wrap justify-content-between'])[6]")
    })
    public List<WebElement> eTicketInfosList;

    @Step("check the title")
    public void titleCheckTestBookingHistory() {
        String expectedAboutTitle = "Easy Bus Ticket - Booking History";
        String actualAboutTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualAboutTitle, expectedAboutTitle);
        log.info("verified that page has correct title.");
        softAssert.assertAll();
    }


    @Step("click the detail action button on table")
    public void clickOnDetailActionButtonLink() {
        waitAndClick(detailActionButtonLink);
        System.out.println(statusDataRowOne.getText());
        if (statusDataRowOne.getText().equals("Pending")) {
            waitAndClick(closeButtonOnTheAllert);
            List<String> eTicketInfoTitleListStr = List.of("PNR Number", "Journey Date", "Route", "Fare", "Status", "Name", "Departure Hour");
            String eTicketInfoTitleStr;
            List<String> currentlyETicketListStr = new ArrayList<>();

            for (int i = 0; i < eTicketInfosList.size(); i++) {

                eTicketInfoTitleStr = eTicketInfosList.get(i).getText();
                currentlyETicketListStr.add(eTicketInfoTitleStr);
                softAssert.assertTrue(currentlyETicketListStr.containsAll(eTicketInfoTitleListStr), "E ticket Infos False");
            }
        } else {
            softAssert.assertEquals(Driver.get(env).getCurrentUrl(), "https://qa.easybusticket.com/user/booked-ticket/print/388");
            log.info("URL verified.");
        }
        softAssert.assertAll();
    }


    @Step("Verify that there is no ticket on the table ")
    public void isAnyInfoOnTheTable(List<WebElement> tableCells) {
        //if the user has never booked a ticket
        //softAssert.assertTrue(tableCells.isEmpty());
        //if the user has  booked a ticket
        softAssert.assertFalse(tableCells.isEmpty());
        log.info("verified that there is no Ticket on the Table");
        softAssert.assertAll();

    }

    @Step("verify that the table included ticket information as expected such es pnr number, departure arrivel time/punkt, tax")
    public void isTheHeaderListAsExpected(List<WebElement> tableHeaderList) {
        //here the ticket information is checked for completeness on the table.

        List<String> expectedHeaderDataList = List.of("PNR Number", "Starting Point", "Dropping Point", "Journey Date", "Pickup Time", "Booked Seats", "Fare");
        String headerDataStr;
        List<String> currentlyTableHeaderListStr = new ArrayList<>();

        for (int i = 0; i < tableHeaderList.size(); i++) {

            headerDataStr = tableHeaderList.get(i).getText();
            currentlyTableHeaderListStr.add(headerDataStr);
        }

        softAssert.assertTrue(Objects.requireNonNull(currentlyTableHeaderListStr).containsAll(expectedHeaderDataList));
        log.info("The table included Ticket Informations as expected.");
        softAssert.assertAll();
    }
}





