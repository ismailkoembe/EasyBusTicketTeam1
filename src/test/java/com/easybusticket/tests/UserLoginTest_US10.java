package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserDashboardPage;
import com.easybusticket.pages.UserLoginPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class UserLoginTest_US10 extends BaseTest {
    @Test
    @Severity(value = SeverityLevel.CRITICAL)
    @Description("User log in and navigate to the Dashboard test")
    public void loginTest() {
        // navigate to the login page
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();

       //navigate to the dashboard page
        UserDashboardPage userDashboardPage = userLoginPage.login();
    }
}
