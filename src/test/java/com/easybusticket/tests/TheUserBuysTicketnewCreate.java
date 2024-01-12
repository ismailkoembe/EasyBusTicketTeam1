package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.SupportTicketPage;
import com.easybusticket.pages.UserDashboardPage;
import com.easybusticket.pages.UserLoginPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j

public class TheUserBuysTicketnewCreate extends BaseTest{
    @Test
    public void requestCheckTest(){
        // navigate to the login page
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();

        //navigate to the dashboard page
        UserDashboardPage userDashboardPage = userLoginPage.login();

        //navigate to the request ticket page
        SupportTicketPage supportTicketPage = new UserDashboardPage().requestHistory();
        log.info(" Request History Page loaded ");

        //navigate to the request detail view and return requests page
        supportTicketPage.requestHistoryPageVerifyTest();
        log.info(" Request Detail Page loaded ");

    }
}
