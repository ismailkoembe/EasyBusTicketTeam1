package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import static com.easybusticket.pages.BasePage.env;

@Slf4j
public class FooterVisilibility_US04 extends BaseTest{

    @Test
    public void testName() {

        //As a visitor, I should be able to view the footer when I enter the homepage.
        HomePage homePage = new HomePage();

        //accept the cookies.
        homePage.acceptCookies();

        //scroll down to the bottom of the homepage
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get(env);
        jse.executeScript("arguments[0].scrollIntoViewIfNeeded(true);", homePage.footerSection);

        //verify the visibility of the footer
        homePage.footerSection.isDisplayed();
        log.info(" Footer section is displayed " + env);

        // verify the visibility of the social media items
        homePage.getTwitterIconFooter.isDisplayed();
        homePage.getFacebookIconFooter.isDisplayed();
        homePage.getYoutubeIconFooter.isDisplayed();
        homePage.getInstagramIconFooter.isDisplayed();
        log.info(" Social Media and social media icons are displayed " + env);

        //verify the visibility of Useful Links section
        homePage.footerUsefulLinks.isDisplayed();
        homePage.getAboutTitleFooter.isDisplayed();
        homePage.getFaqsTitleFooter.isDisplayed();
        homePage.getBlogTitleFooter.isDisplayed();
        homePage.footerContactUsefulLinks.isDisplayed();
        log.info("Useful Links are displayed " + env);

        //verify the visibility of footer policies section
        homePage.footerPolicies.isDisplayed();
        homePage.getPrivacyPolicyTitleFooter.isDisplayed();
        homePage.getTermsAndConditionsTitleFooter.isDisplayed();
        homePage.getTicketPoliciesFooter.isDisplayed();
        log.info("Policies Section are displayed " + env);

        //verify the visibility of contact Info section
        homePage.footerContactUsefulLinks.isDisplayed();
        homePage.footerContactInfoAdresse.isDisplayed();
        homePage.footerPhoneLink.isDisplayed();
        homePage.footerEmailAdresseLink.isDisplayed();
        log.info(" Contact Info are displayed " + env);






    }
}
