package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingHistoryPage extends BasePage {

    public BookingHistoryPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }

@FindBy(xpath = "/html/body/section[2]/div/div/div/table/tbody/tr/td[10]/div/a")
public WebElement detailActionButtonLink;



    public void titleCheckTestBookingHistory() {
        String expectedAboutTitle = "Easy Bus Ticket - Booking History";
        String actualAboutTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualAboutTitle, expectedAboutTitle);
        softAssert.assertAll();

    }

    @Override
    public void waitAndClick(WebElement detailActionButtonLink) {
        super.waitAndClick(detailActionButtonLink);
        softAssert.assertEquals(Driver.get(env).getCurrentUrl(), "https://qa.easybusticket.com/user/booked-ticket/print/388");
        softAssert.assertAll();
    }
}
