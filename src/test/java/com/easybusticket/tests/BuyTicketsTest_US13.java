package com.easybusticket.tests;

import com.easybusticket.pages.BookingHistoryPage;
import com.easybusticket.pages.BuyTicketsPage;
import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserDashboardPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class BuyTicketsTest_US13 extends BaseTest{

    @Test
    public void BuyTicketTest() {

        UserDashboardPage userDashboardPage = new HomePage().clickToSignIn().login();
        BuyTicketsPage buyTicketsPage = userDashboardPage.clickToBuyTicketsButton();
        log.info("Buy tickets button is work");
        buyTicketsPage.fillTheFindTicketsForm();
        log.info("Pickup point, dropping point and date of journey is selected.");
        buyTicketsPage.selectSeat();
        log.info("Seat no is selected");
        buyTicketsPage.selectGender();
        log.info("Gender is selected");
        buyTicketsPage.payNow();
        log.info("Pay now button is work");
        buyTicketsPage.fillTheCardInformations();
        log.info("Card information has been written");

        BookingHistoryPage bookingHistoryPage = new BookingHistoryPage();
        bookingHistoryPage.printTicket();
        log.info("Ticket is purchased");

    }
}
