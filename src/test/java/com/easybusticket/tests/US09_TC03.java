package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.RegisterPage;
import com.easybusticket.pages.UserDashboardPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;


@Slf4j
public class US09_TC03 extends BaseTest {

    @Test
    public void negatifSignUpTest(){

        //Visitor clicks on the "Sign Up" link in the placeholder in the header section of the home page to register
        RegisterPage register = new HomePage().clickSignUp();
        //Negatif register test
        UserDashboardPage userDashboardPage = register.withoutLastnameAndEmailSignUp();

    }
}
