package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.RegisterPage;
import com.easybusticket.pages.UserDashboard;
import com.easybusticket.utilities.Driver;
import com.easybusticket.utilities.PropManager;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

/**
 * @author Ismail Koembe
 */
@Slf4j
public class US09_TC01_TC02 extends BaseTest{


    @Test
    public void signUpTest() {
        //Visitor clicks on the "Sign Up" link in the placeholder in the header section of the home page to register
        RegisterPage register = new HomePage().clickSignUp();
        //Just an example
        UserDashboard userDashboard = register.signUp();
    }
}
