package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.RegisterPage;
import com.easybusticket.pages.UserDashboardPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class US09_NegatifRegister2 extends BaseTest{

    @Test
    @Severity(value = SeverityLevel.CRITICAL)
    @Description("Visitor clicked on the Sign Up link and visitor cannot register ")
    public void negatifSignUpTest2(){
        //Visitor clicks on the "Sign Up" link in the placeholder in the header section of the home page to register
        RegisterPage register = new HomePage().clickSignUp();
        log.info("Visitor clicked on the Sign Up link ");

        //Negatif register test
        UserDashboardPage userDashboardPage = register.withExistingUsernameAndEmailSignUp();
        log.info("Visitor cannot register");
    }
}
