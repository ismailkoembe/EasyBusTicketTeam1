package com.easybusticket.tests;

import com.easybusticket.pages.BookingHistoryPage;
import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserDashboardPage;
import com.easybusticket.pages.UserLoginPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class US14_BookingHistoryPageAndTableVerifyTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("User should be able to verify that I can access the booking history page from the booking menu")
    public void testBookingHistoryAccessFromMenu() {

        // navigate to the login page
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();
        log.info("Signed in " + env);

        //navigate to the dashboard page
        UserDashboardPage userDashboardPage = userLoginPage.login();
        log.info("Dashboard opened " + env);

        //Locate and hover over the "Booking" menu option.
        softAssert.assertTrue(userDashboardPage.dropDownBooking.isEnabled());
        log.info("Booking drop menu is enabled " + env);

        //From the drop-down menu, click on the "Booking History" option.
        userDashboardPage.clickToBookingHistory();
        log.info("Booking History Page is enabled " + env);

        //Verify that the Booking History Page is able to access from the Dashboard page.
        BookingHistoryPage bookingHistoryPage = new BookingHistoryPage();
        bookingHistoryPage.titleCheckTestBookingHistory();
        log.info("Booking History Page is displayed " + env);

    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("User should be able to view existing ticket information on the reservation history page")
    public void BookingHistoryInfoTestOnTheTable() {
        //!!! PreContition: There must be a ticket booked already from the page before.

        // navigate to the login page
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();
        log.info("Signed in " + env);

        //navigate to the dashboard page
        UserDashboardPage userDashboardPage = userLoginPage.login();
        log.info("Dashboard opened " + env);

        //Locate and hover over the "Booking" menu option.
        softAssert.assertTrue(userDashboardPage.dropDownBooking.isEnabled());
        log.info("Booking drop menu is enabled " + env);

        //From the drop-down menu, click on the "Booking History" option.
        userDashboardPage.clickToBookingHistory();
        log.info("Booking History Page Click on the Dropdown Menu is enabled " + env);

        //Verify that the Booking History Page is able to access from the Dashboard page.
        BookingHistoryPage bookingHistoryPage = new BookingHistoryPage();
        log.info("Booking History Page opened " + env);

        //Verify that any TicketInformation on the Table
        bookingHistoryPage.isAnyInfoOnTheTable(bookingHistoryPage.tableCellsList);
        log.info("There are Ticket Informations on the Booking History Table. " + env);

        // Verfy that the Ticket Information is each expected critaria included.(Ticket Number,departure and arrival dates, departur/arrival point details,booked seats,Fare  seat information, and booking status
        bookingHistoryPage.isTheHeaderListAsExpected(bookingHistoryPage.tableHeaderList);
        log.info("Booking History List is as expected " + env);
    }
}
