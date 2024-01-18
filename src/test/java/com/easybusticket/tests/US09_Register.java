package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.RegisterPage;
import com.easybusticket.pages.UserDashboardPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

/**
 * @author Ismail Koembe
 */
@Slf4j
public class US09_Register extends BaseTest{


    @Test
    @Severity(value = SeverityLevel.CRITICAL)
    @Description("Visitor clicked on the Sign Up link and visitor registered")
    public void signUpTest() {
        //Visitor clicks on the "Sign Up" link in the placeholder in the header section of the home page to register
        RegisterPage register = new HomePage().clickSignUp();
        log.info("Visitor clicked on the Sign Up link ");

        //Pozitif register test
        UserDashboardPage userDashboardPage = register.signUp();
        log.info("Visitor registered");
    }
}
