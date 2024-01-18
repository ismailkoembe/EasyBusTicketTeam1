package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class US03_BodyTest extends BaseTest {

    @Test
    public void homePageBodyTest() {
        HomePage homePage = new HomePage();

        // Accept cookies
        homePage.acceptCookies();

        verifyBodySection(homePage);
        verifyChooseYourTicketSection(homePage);
        verifyButtonsAndTitles(homePage);
        verifyBodyOfferedFacilitiesTitle(homePage);
        verifyBodyOurTestimonialsTitle(homePage);
        verifyRecentBlogPostTitle(homePage);

    }


    private void verifyBodySection(HomePage homePage) {
        softAssert.assertTrue(homePage.bodySection.isDisplayed(), "Body section is not displayed");
        log.info("Body section is displayed for " + env);
    }

    private void verifyChooseYourTicketSection(HomePage homePage) {
        softAssert.assertTrue(homePage.chooseYourTicket.isDisplayed(), "Choose Your Ticket section is not displayed");
        log.info("Choose Your Ticket section is displayed for " + env);
    }

    private void verifyButtonsAndTitles(HomePage homePage) {
        softAssert.assertTrue(homePage.bodyDroppingPointButton.isEnabled(), "Dropping Point button is not enabled");
        softAssert.assertTrue(homePage.bodyPickupPointButton.isEnabled(), "Pickup Point button is not enabled");
        softAssert.assertTrue(homePage.bodyTicketButton.isEnabled(), "Ticket button is not enabled");
    }

    private void verifyBodyOfferedFacilitiesTitle(HomePage homePage) {


        // Verify that the Offered Facilities section is displayed

        softAssert.assertTrue(homePage.bodyOfferedFacilitiesTitle.isDisplayed(), " Offered Facilities section is not displayed");
        log.info("Body Offered Facilities Title: " + homePage.bodyOfferedFacilitiesTitle.getText());


    }

    private void verifyBodyOurTestimonialsTitle(HomePage homePage) {


        // Verify that the Our Testemonials section is displayed

        softAssert.assertTrue(homePage.bodyOurTestemonialsTitle.isDisplayed(), " Our Testimonials section is not displayed");
        log.info("Body Our Testimonials Title: " + homePage.bodyOurTestemonialsTitle.getText());
    }

    private void verifyRecentBlogPostTitle(HomePage homePage) {


        // Verify that the Recent Blog Post section is displayed

        softAssert.assertTrue(homePage.bodyRecentBlogPostTitle.isDisplayed(), " Recent Blog Post section is not displayed");
        log.info("Body Our Testimonials Title: " + homePage.bodyRecentBlogPostTitle.getText());


    }
}