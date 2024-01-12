package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserDashboardPage;
import com.easybusticket.pages.UserLoginPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;
@Slf4j
public class UserLogout_US19 extends BaseTest{

    @Test
    public void userLogoutTest(){
        // navigate to the login page
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();

        //navigate to the dashboard page
        UserDashboardPage userDashboardPage = userLoginPage.login();

        //navigate to the login page
        UserLoginPage userLogout = new UserDashboardPage().logout();
        log.info(" logout test " + env);
    }
}
