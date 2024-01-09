package com.easybusticket.tests;

import com.easybusticket.pages.AnaSayfa;
import com.easybusticket.pages.UserLoginPage;
import com.easybusticket.pages.UserPasswordResetPage;
import org.testng.annotations.Test;

public class US10_TC07 extends BaseTest{
    @Test
    public void forgotPasswordTest(){
        // navigate to the login page
        UserLoginPage userLoginPage = new AnaSayfa().clickToSignIn();

        //navigate to the password-reset page
        UserPasswordResetPage userPasswordResetPage = userLoginPage.clickToForgotPassword();
    }
}
