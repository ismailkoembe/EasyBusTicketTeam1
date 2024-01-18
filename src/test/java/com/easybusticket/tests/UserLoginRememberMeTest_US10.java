package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserDashboardPage;
import com.easybusticket.pages.UserLoginPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;

@Slf4j
public class UserLoginRememberMeTest_US10 extends BaseTest{
    @Test
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