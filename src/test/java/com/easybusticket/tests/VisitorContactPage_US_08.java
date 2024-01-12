package com.easybusticket.tests;

import com.easybusticket.pages.ContactPage;
import com.easybusticket.pages.HomePage;
import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
@Slf4j
public class VisitorContactPage_US_08 extends BaseTest {
    @Test
    public void ContactPageTest(){
        //Click the Contact Title
        ContactPage contactPage=new HomePage().clickToContactTitle();

        //Contact Us banner display
        contactPage.titleContactTest();
        log.info("Contact Us is displayed");

        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) Driver.get(env);
        javascriptExecutor.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",contactPage.titleOurAdres);
        // Visitor should be able to view 'Our Address' small windows
       softAssert.assertTrue(contactPage.titleOurAdres.isDisplayed());
        log.info("Title of Adresse is displayed ");
        // Visitor should be able to view 'Call Us' small windows
        softAssert.assertTrue(contactPage.titleCallUs.isDisplayed());
        log.info("Title of Call Us is displayed ");
        // Visitor should be able to view 'Email Us' small windows
        softAssert.assertTrue(contactPage.titleEmailUs.isDisplayed());
        log.info("Title of Email Us is displayed ");
        softAssert.assertAll();
        javascriptExecutor= (JavascriptExecutor) Driver.get(env);
        javascriptExecutor.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",contactPage.labelHaveAnyQuestion);
       /* //The visitor should confirm that the links are active by clicking on the number under 'Call Us'
        // and close the page that opens
        contactPage.clickToCallUs();
        log.info("Telefon tiklandi ");
        Driver.get(env).navigate().back();

        //The visitor should confirm that the links are active by clicking on the number under 'Call Us'
        // and close the page that opens
        contactPage.clickToEmailUs();
        log.info("Email tiklandi ");
        Driver.get(env).navigate().back();

        */


        //The visitor should display the contact form under the heading "Have any question?"
        // in the lower left corner of the Contact page
        softAssert.assertTrue(contactPage.labelHaveAnyQuestion.isDisplayed());
        log.info("Have any Question is displayed ");

        // The visitor should enter the necessary information in the "Name, E-mail, Subject and Message"
        // section and click on the "Send Us a Message" button and submit the form

         contactPage.fillTheContactForm();

        //The visitor should scroll down the Contact page and view the map showing the location of the company in the bottom right corner
        Assert.assertTrue(contactPage.labelMapAdres.isDisplayed());
        log.info("The Adress is displayed ");





    }




}



