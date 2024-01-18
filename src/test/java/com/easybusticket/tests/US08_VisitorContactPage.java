package com.easybusticket.tests;

import com.easybusticket.pages.ContactPage;
import com.easybusticket.pages.HomePage;
import com.easybusticket.utilities.Driver;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
@Slf4j
public class US08_VisitorContactPage extends BaseTest {

    @Test
    @Severity(value = SeverityLevel.NORMAL)
    @Description("visitor, you should be able to access the page with" +
            " contact information and contact form and send a message")
    public void ContactPageTest() {
        //Open the home page and Click the Contact Title
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

        //Visitor should be confirm that the Telephone number under "Call Us'' is active
        softAssert.assertTrue(contactPage.linkPhoneNumber.isEnabled());
        log.info("Telephone number enabled ");

        //Visitor should be confirm that the Email Adress under "Email Us'' is active
        softAssert.assertTrue(contactPage.linkEmail.isEnabled());
        log.info("Email address enabled");

        //The visitor should display the contact form under the heading "Have any question?" in the lower left corner of the Contact page
        softAssert.assertTrue(contactPage.labelHaveAnyQuestion.isDisplayed());
        log.info("Have any Question is displayed ");

        // The visitor should enter the necessary information in the "Name, E-mail, Subject and Message"
        // section and click on the "Send Us a Message" button and submit the form
        contactPage.fillTheContactForm();
    }

}



