package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserDashboard;
import com.easybusticket.pages.UserLoginPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;
@Slf4j
public class US19_TC01 extends BaseTest{

    @Test
    public void userLogoutTest(){
        // navigate to the login page
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();

        //navigate to the dashboard page
        UserDashboard userDashboard = userLoginPage.login();

        //navigate to the login page
        UserLoginPage userLogout = new UserDashboard().logout();
        log.info(" logout test " + env);
    }
}
