package com.easybusticket.tests;

import com.easybusticket.pages.BookingHistoryPage;
import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserDashboardPage;
import com.easybusticket.pages.UserLoginPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class TheBookingHistoryAccessor extends BaseTest {

    @Test
    public void testBookingHistoryAccessFromMenu() { //I should be able to verify that I can access the booking history page from the booking menu

        // navigate to the login page
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();

        //navigate to the dashboard page
        UserDashboardPage userDashboardPage = userLoginPage.login();

        //Locate and hover over the "Booking" menu option.
        userDashboardPage.dropDownBooking.isEnabled();

        //From the drop-down menu, click on the "Booking History" option.
        userDashboardPage.clickToBookingHistory();

        BookingHistoryPage bookingHistoryPage = new BookingHistoryPage();
        bookingHistoryPage.titleCheckTestBookingHistory();


    }
}
