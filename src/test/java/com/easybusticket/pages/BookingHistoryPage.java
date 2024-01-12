package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BookingHistoryPage extends BasePage {

    public BookingHistoryPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }


    public void titleCheckTestBookingHistory() {
        String expectedAboutTitle = "Easy Bus Ticket - Booking History";
        String actualAboutTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualAboutTitle, expectedAboutTitle);
        softAssert.assertAll();

    }


}
