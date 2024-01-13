package com.easybusticket.tests;

import com.easybusticket.pages.BasePage;
import com.easybusticket.pages.HomePage;
import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

@Slf4j
public class FooterVisibility_US04 extends BaseTest {

    @Test
    public void footerVisibityTest() {

        //As a visitor, I should be able to view the footer when I enter the homepage.
        HomePage homePage = new HomePage();

        //accept the cookies.
        homePage.acceptCookies();

        //scroll down to the bottom of the homepage
        homePage.scrollToBottom();
        //verify the visibility of the footer
        softAssert.assertTrue(homePage.footerSection.isDisplayed());
        log.info(" Footer section is displayed and enabled " + env);

        // verify the visibility of the social media items
        softAssert.assertTrue(homePage.getTwitterIconFooter.isEnabled());
        softAssert.assertTrue(homePage.getFacebookIconFooter.isEnabled());
        softAssert.assertTrue(homePage.getYoutubeIconFooter.isEnabled());
        softAssert.assertTrue(homePage.getInstagramIconFooter.isEnabled());
        log.info(" Social Media and social media icons are displayed and enabled " + env);

        //verify the visibility of Useful Links section
        softAssert.assertTrue(homePage.footerUsefulLinks.isDisplayed());
        softAssert.assertTrue(homePage.getAboutTitleFooter.isEnabled());
        softAssert.assertTrue(homePage.getFaqsTitleFooter.isEnabled());
        softAssert.assertTrue(homePage.getBlogTitleFooter.isEnabled());
        softAssert.assertTrue(homePage.footerContactUsefulLinks.isEnabled());
        log.info("Useful Links are displayed and enabled " + env);

        //verify the visibility of footer policies section
        softAssert.assertTrue(homePage.footerPolicies.isEnabled());
        softAssert.assertTrue(homePage.getPrivacyPolicyTitleFooter.isEnabled());
        softAssert.assertTrue(homePage.getTermsAndConditionsTitleFooter.isEnabled());
        softAssert.assertTrue(homePage.getTicketPoliciesFooter.isEnabled());
        log.info("Policies Section are displayed and enabled " + env);

        //verify the visibility of contact Info section
        softAssert.assertTrue(homePage.footerContactInfo.isDisplayed());
        softAssert.assertTrue(homePage.footerContactInfoAdresse.isDisplayed());
        softAssert.assertTrue(homePage.footerPhoneLink.isEnabled());
        softAssert.assertTrue(homePage.footerEmailAdresseLink.isEnabled());
        log.info(" Contact Info Informatons are displayed, Phone and Email link are enabled" + env);
        softAssert.assertAll();

    }
}
