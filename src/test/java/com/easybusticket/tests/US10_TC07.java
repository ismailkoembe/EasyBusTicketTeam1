package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserLoginPage;
import com.easybusticket.pages.UserPasswordResetPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class US10_TC07 extends BaseTest{
    @Test
    public void forgotPasswordTest(){
        // navigate to the login page
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();

        //navigate to the password-reset page
        UserPasswordResetPage userPasswordResetPage = userLoginPage.clickToForgotPassword();
    }
}
