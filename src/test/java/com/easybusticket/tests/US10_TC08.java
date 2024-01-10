package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserDashboard;
import com.easybusticket.pages.UserLoginPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;

@Slf4j
public class US10_TC08 extends BaseTest{
    @Test
    public void rememberMeIsWorkingTest(){

        UserLoginPage userLoginPage = new HomePage().clickToSignIn();
        UserDashboard userDashboard = userLoginPage.loginWithRememberMe();
        userDashboard.logout();
        Assert.assertTrue(userLoginPage.checkbox_rememberMe.isSelected());
        String expectedResult = userLoginPage.username_login.getText();
//        Assert.assertTrue(expectedResult != "");
        Assert.assertFalse(expectedResult.isEmpty());

    }
}
