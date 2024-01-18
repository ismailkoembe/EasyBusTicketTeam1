package com.easybusticket.tests;

import com.easybusticket.pages.*;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class US14_BookingHistoryDetailActionTest extends BaseTest{
    @Test
    public void detailActionTest() {

        UserLoginPage userLoginPage = new HomePage().clickToSignIn();
        log.info("Signed in " + env);

        //navigate to the dashboard page
        UserDashboardPage userDashboardPage = userLoginPage.login();
        log.info("Dashboard opened " + env);

        BookingHistoryPage bookingHistoryPage = new UserDashboardPage().clickToBookingHistory();
        log.info("BookingHistoryPage opened " + env);

        bookingHistoryPage.waitAndClick(bookingHistoryPage.detailActionButtonLink);
        log.info("E-Ticket Page opened" + env);

    }
}
