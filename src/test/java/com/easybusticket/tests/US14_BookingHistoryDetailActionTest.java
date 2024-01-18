package com.easybusticket.tests;

import com.easybusticket.pages.BookingHistoryPage;
import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserDashboardPage;
import com.easybusticket.pages.UserLoginPage;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class US14_BookingHistoryDetailActionTest extends BaseTest {
    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void detailActionTest() {

        UserLoginPage userLoginPage = new HomePage().clickToSignIn();
        log.info("Signed in " + env);

        //navigate to the dashboard page
        UserDashboardPage userDashboardPage = userLoginPage.login();
        log.info("Dashboard opened " + env);

        BookingHistoryPage bookingHistoryPage = new UserDashboardPage().clickToBookingHistory();
        log.info("BookingHistoryPage opened " + env);

        softAssert.assertTrue(bookingHistoryPage.detailActionButtonLink.isEnabled());

        log.info("E-Ticket Page opened" + env);

    }


}
