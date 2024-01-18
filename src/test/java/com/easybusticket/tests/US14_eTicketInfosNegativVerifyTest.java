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
public class US14_eTicketInfosNegativVerifyTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("E-Ticket Information must be accurate and complete")
    public void eTicketInfosVerify() {

        UserLoginPage userLoginPage = new HomePage().clickToSignIn();
        log.info("Signed in " + env);

        //navigate to the dashboard page
        UserDashboardPage userDashboardPage = userLoginPage.login();
        log.info("Dashboard opened " + env);

        BookingHistoryPage bookingHistoryPage = new UserDashboardPage().clickToBookingHistory();
        log.info("BookingHistoryPage opened " + env);

        bookingHistoryPage.clickOnDetailActionButtonLink();
        log.info("E-Ticket Page opened" + env);


    }
}
