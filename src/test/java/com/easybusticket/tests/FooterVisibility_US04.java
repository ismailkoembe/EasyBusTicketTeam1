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
        log.info(" Footer section is displayed " + env);

        // verify the visibility of the social media items
        softAssert.assertTrue(homePage.getTwitterIconFooter.isDisplayed());
        softAssert.assertTrue(homePage.getFacebookIconFooter.isDisplayed());
        softAssert.assertTrue(homePage.getYoutubeIconFooter.isDisplayed());
        softAssert.assertTrue(homePage.getInstagramIconFooter.isDisplayed());
        log.info(" Social Media and social media icons are displayed " + env);

        //verify the visibility of Useful Links section
        softAssert.assertTrue(homePage.footerUsefulLinks.isDisplayed());
        softAssert.assertTrue(homePage.getAboutTitleFooter.isDisplayed());
        softAssert.assertTrue(homePage.getFaqsTitleFooter.isDisplayed());
        softAssert.assertTrue(homePage.getBlogTitleFooter.isDisplayed());
        softAssert.assertTrue(homePage.footerContactUsefulLinks.isDisplayed());
        log.info("Useful Links are displayed " + env);

        //verify the visibility of footer policies section
        softAssert.assertTrue(homePage.footerPolicies.isDisplayed());
        softAssert.assertTrue(homePage.getPrivacyPolicyTitleFooter.isDisplayed());
        softAssert.assertTrue(homePage.getTermsAndConditionsTitleFooter.isDisplayed());
        softAssert.assertTrue(homePage.getTicketPoliciesFooter.isDisplayed());
        log.info("Policies Section are displayed " + env);

        //verify the visibility of contact Info section
        softAssert.assertTrue(homePage.footerContactInfo.isDisplayed());
        softAssert.assertTrue(homePage.footerContactInfoAdresse.isDisplayed());
        softAssert.assertTrue(homePage.footerPhoneLink.isDisplayed());
        softAssert.assertTrue(homePage.footerEmailAdresseLink.isDisplayed());
        log.info(" Contact Info are displayed " + env);
        softAssert.assertAll();

    }
}
