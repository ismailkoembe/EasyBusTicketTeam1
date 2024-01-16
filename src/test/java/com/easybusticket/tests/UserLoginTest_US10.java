package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserDashboardPage;
import com.easybusticket.pages.UserLoginPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class UserLoginTest_US10 extends BaseTest {
    @Test
    public void loginTest() {
        // navigate to the login page
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();

       //navigate to the dashboard page
        userLoginPage.login();
    }
}
