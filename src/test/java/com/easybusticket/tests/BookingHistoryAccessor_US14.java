package com.easybusticket.tests;

import com.easybusticket.pages.BookingHistoryPage;
import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserDashboardPage;
import com.easybusticket.pages.UserLoginPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Slf4j
public class BookingHistoryAccessor_US14 extends BaseTest {

    @Test
    public void testBookingHistoryAccessFromMenu() { //I should be able to verify that I can access the booking history page from the booking menu

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
}
