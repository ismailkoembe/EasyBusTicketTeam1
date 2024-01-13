package com.easybusticket.tests;

import com.easybusticket.pages.*;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class RequestHistoryNewTicket_US16 extends BaseTest {

    @Test
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


    }
}
