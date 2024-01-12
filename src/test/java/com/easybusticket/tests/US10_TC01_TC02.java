package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserDashboard;
import com.easybusticket.pages.UserLoginPage;
import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;

@Slf4j
public class US10_TC01_TC02 extends BaseTest {
    @Test
    public void loginTest() {
        // navigate to the login page
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();

       //navigate to the dashboard page
        UserDashboard userDashboard = userLoginPage.login();
    }
}
