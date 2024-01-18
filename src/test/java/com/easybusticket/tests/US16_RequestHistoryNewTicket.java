package com.easybusticket.tests;

import com.easybusticket.pages.*;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class US16_RequestHistoryNewTicket extends BaseTest {

    @Test
    @Severity(value = SeverityLevel.NORMAL)
    @Description("A registered user should be able to create a new ticket request from the history request section")
    public void requestHistoryPageNewTicketTest(){

        // navigate to the login page
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();

        //navigate to the dashboard page
        UserDashboardPage userDashboardPage = userLoginPage.login();

        //navigate to the request ticket page
        SupportTicketPage supportTicketPage = new UserDashboardPage().requestHistory();
        log.info(" Request History Page loaded ");

        supportTicketPage.requestHistoryNewTicketTest();
        log.info(" A new ticket was created from the request history page and Returned to request history page ");

        userDashboardPage.logout();
    }
}
