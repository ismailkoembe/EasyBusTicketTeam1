package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
@Slf4j
public class BookingHistoryPage extends BasePage {

    public BookingHistoryPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }

    // print ticket button
    @FindBy(xpath = "//i[@class='las la-print']")
    public WebElement printButton;

    // download ticket button
    @FindBy(xpath = "//button[@type='button']")
    public WebElement downloadButton;

    @FindBy(xpath = "(//h5[@class='value'])[1]")
    public WebElement actualPnrNumberOnTicket;

    // actual name on ticket
    @FindBy(xpath = "(//h5[@class='value'])[2]")
    public WebElement actualNameOnTicket;

    @FindBy(xpath = "(//*[@class='ticket-no'])[1]")
    public WebElement expectedPnrNumber;
    public void titleCheckTestBookingHistory() {
        String expectedAboutTitle = "Easy Bus Ticket - Booking History";
        String actualAboutTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualAboutTitle, expectedAboutTitle);
        softAssert.assertAll();

    }
    public void printTicket() {
        //String actualPnrNumber = actualPnrNumberOnTicket.getText();
        waitAndClick(printButton);

        softAssert.assertTrue(downloadButton.isDisplayed());
        log.info("ticket is ready to download");
        //softAssert.assertEquals(actualPnrNumber, expectedPnrNumber);
        softAssert.assertEquals(actualNameOnTicket, "Asli ekm");
        log.info("ticket informations are true");

    }

}
