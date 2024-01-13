package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.RegisterPage;
import com.easybusticket.pages.UserDashboardPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

/**
 * @author Ismail Koembe
 */
@Slf4j
public class Register_US09 extends BaseTest{


    @Test
    public void signUpTest() {
        //Visitor clicks on the "Sign Up" link in the placeholder in the header section of the home page to register
        RegisterPage register = new HomePage().clickSignUp();
        //Pozitif register test
        UserDashboardPage userDashboardPage = register.signUp();
    }
}
