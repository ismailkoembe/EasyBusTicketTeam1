package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.RegisterPage;
import com.easybusticket.pages.UserDashboard;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

/**
 * @author Ismail Koembe
 */
@Slf4j
public class US09_TC01_TC02_Register extends BaseTest{


    @Test
    public void signUpTest() {
        //Visitor clicks on the "Sign Up" link in the placeholder in the header section of the home page to register
        RegisterPage register = new HomePage().clickSignUp();
        //Pozitif register test
        UserDashboard userDashboard = register.signUp();
    }
}
