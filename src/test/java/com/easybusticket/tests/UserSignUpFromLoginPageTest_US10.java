package com.easybusticket.tests;

import com.easybusticket.pages.*;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class UserSignUpFromLoginPageTest_US10 extends BaseTest {

    @Test
    public void toSignUpFromLoginPage() {
        // navigate to the login page
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();

        //navigate to the Sign_Up page
        RegisterPage registerPage = userLoginPage.clickToSignUp();
    }
}
