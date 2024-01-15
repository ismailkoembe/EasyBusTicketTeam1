package com.easybusticket.tests;

import com.easybusticket.pages.ForgotPasswordPage;
import com.easybusticket.pages.HomePage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class US20_TC01 extends BaseTest{


    @Test
    public void resetPasswordWithSentCode(){
        ForgotPasswordPage forgotPasswordPage = new HomePage().clickToForgotPasswordButton();

        forgotPasswordPage.passwordCodeTest();

        log.info("FAQ item is exist and env is: " + env);


    }
}
