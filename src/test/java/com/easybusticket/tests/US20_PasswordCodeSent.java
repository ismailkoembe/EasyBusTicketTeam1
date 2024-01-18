package com.easybusticket.tests;

import com.easybusticket.pages.ForgotPasswordPage;
import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserLoginPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class US20_PasswordCodeSent extends BaseTest{


    @Test
    public void resetPasswordWithSentCode(){
        UserLoginPage loginPage = new HomePage().clickToSignIn();

        loginPage.clickToForgotPassword();

        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

        forgotPasswordPage.passwordCodeTest();

        log.info("Reset code sent successfully: " + env);


    }
}
