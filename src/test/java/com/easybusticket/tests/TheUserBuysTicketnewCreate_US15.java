package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.SupportTicketPage;
import com.easybusticket.pages.UserDashboardPage;
import com.easybusticket.pages.UserLoginPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j

public class TheUserBuysTicketnewCreate_US15 extends BaseTest{
    @Test
    public void requestCheckTest(){
        // navigate to the login page
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();

        //navigate to the dashboard page
        UserDashboardPage userDashboardPage = userLoginPage.login();

        //navigate to the create new ticket page
        SupportTicketPage supportTicketPage = new UserDashboardPage().createNewHistory();
        log.info(" Create new page created ");

        //navigate to the create new detail view and return page
         //supportTicketPage.createNewTicketTest();
//        log.info(" Request Detail Page loaded ");

    }
}
