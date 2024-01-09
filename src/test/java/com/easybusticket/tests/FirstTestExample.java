package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.Register;
import com.easybusticket.pages.TermsAndConditions;
import com.easybusticket.utilities.Driver;
import com.easybusticket.utilities.PropManager;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

/**
 * @author Ismail Koembe
 */
@Slf4j
public class FirstTestExample extends BaseTest{


    @Test
    public void signUpTest(){

        //1)The visitor enters the homepage with the URL "https://qa.easybusticket.com/"
        Driver.get(env).get(PropManager.getProperties(env,"url"));
        log.info("Navigating {} environment {}", PropManager.getProperties(env,"url"), env);

        //3)Visitor clicks on the "Sign Up" link in the placeholder in the header section of the home page to register
        Register register = new HomePage().clickSignUp();


        //4)When the visitor enters the Sign Up page, they see the text "Sign Up your Account"

        String expectedText="Sign Up your Account";
        String actualText= register.textOfSignUpyourAccount.getText();
        softAssert.assertEquals(expectedText,actualText);
        softAssert.assertAll();

        //Just an example
        TermsAndConditions termsAndConditions = register.fillTheSignUpForm();
        //Add asertion
    }
}
