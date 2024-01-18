package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Base64;
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



    public void titleCheckTestBookingHistory() {
        String expectedAboutTitle = "Easy Bus Ticket - Booking History";
        String actualAboutTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualAboutTitle, expectedAboutTitle);
        log.info("verified that page has correct title.");
        softAssert.assertAll();
    }

  @Override
    public void waitAndClick(WebElement detailActionButtonLink) {
        super.waitAndClick(detailActionButtonLink);
        softAssert.assertEquals(Driver.get(env).getCurrentUrl(), "https://qa.easybusticket.com/user/booked-ticket/print/388");
        log.info("URL verified.");
        softAssert.assertAll();
    }

    public void isAnyInfoOnTheTable (List<WebElement> tableCells ){
        //if the user has never booked a ticket
        //softAssert.assertTrue(tableCells.isEmpty());
        //if the user has  booked a ticket
        softAssert.assertFalse(tableCells.isEmpty());
        log.info("verified that there is no Ticket on the Table");
        softAssert.assertAll();

    }
    public void isTheHeaderListAsExpected (List<WebElement> tableHeaderList ) {
       //here the ticket information is checked for completeness on the table.

        List<String> expectedHeaderDataList = List.of("PNR Number", "Starting Point", "Dropping Point" , "Journey Date", "Pickup Time" , "Booked Seats","Fare");
        String headerDataStr;
        List<String>currentlyTableHeaderListStr = new ArrayList<>();

        for (int i = 0; i <tableHeaderList.size() ; i++) {

               headerDataStr= tableHeaderList.get(i).getText();
               currentlyTableHeaderListStr.add(headerDataStr);
        }

        softAssert.assertTrue(Objects.requireNonNull(currentlyTableHeaderListStr).containsAll(expectedHeaderDataList));
        log.info("The table included Ticket Informations as expected.");
        softAssert.assertAll();
        }
    }





