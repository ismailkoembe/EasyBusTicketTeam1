package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;


public class US04_TC01 extends BaseTest {

    @Test
    public void footerVisibilityTest() { //As a visitor, I should be able to view the footer when I enter the homepage.

        HomePage homePage = new HomePage();

        //accept the cookies.
        homePage.acceptCookies();

        //scroll down to the bottom of the homepage
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get(env);
        jse.executeScript("arguments[0].scrollIntoViewIfNeeded(true);", homePage.footerSection);

        //verify the visibility of the footer
        softAssert.assertTrue(homePage.footerSection.isDisplayed());

    }
}
