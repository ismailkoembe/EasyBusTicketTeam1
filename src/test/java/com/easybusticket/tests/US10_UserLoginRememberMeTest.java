package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserDashboardPage;
import com.easybusticket.pages.UserLoginPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;

@Slf4j
public class US10_UserLoginRememberMeTest extends BaseTest{
    @Test
    @Severity(value = SeverityLevel.MINOR)
    @Description("User click Remember Me and log in test")
    public void rememberMeIsWorkingTest(){

        UserLoginPage userLoginPage = new HomePage().clickToSignIn();
        UserDashboardPage userDashboardPage = userLoginPage.loginWithRememberMe();
        userDashboardPage.logout();

        String expectedResult = userLoginPage.username_login.getText();
        log.info("Username is empty" + env);
        Assert.assertFalse(expectedResult.isEmpty());
        Assert.assertTrue(userLoginPage.checkbox_rememberMe.isSelected());




    }
}
