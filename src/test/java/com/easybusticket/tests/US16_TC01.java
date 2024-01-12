package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.SupportTicketPage;
import com.easybusticket.pages.UserDashboard;
import com.easybusticket.pages.UserLoginPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class US16_TC01 extends BaseTest{
    @Test
    public void requestCheckTest(){
        // navigate to the login page
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();

        //navigate to the dashboard page
        UserDashboard userDashboard = userLoginPage.login();

        //navigate to the request ticket page
        SupportTicketPage supportTicketPage = new UserDashboard().requestHistory();
        log.info(" Request History Page loaded " + env);

    }

}
