package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserDashboardPage;
import com.easybusticket.pages.UserLoginPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;
@Slf4j

public class US11_UserDashboardHomePageItemsTest extends BaseTest{
    @Test
    @Severity(value = SeverityLevel.BLOCKER)
    @Description("The registered user clicks on the logo on the dashboard, accesses the homepage and verifies that all elements are functional.")
    public void userDashboardHomePageItemsTest(){
        //Navigate to the login page
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();
        UserDashboardPage userDashboardPage = userLoginPage.login();

        //The registered user reaches the home page from the logo.
        userDashboardPage.logoEasybusticket.click();
        userDashboardPage.cookies.click();

        //The user views all elements of the homepage and verifies the active ones.

        //Header section
        softAssert.assertTrue(userDashboardPage.iconPhone.isEnabled());
        softAssert.assertTrue(userDashboardPage.linkEmail.isEnabled());
        softAssert.assertTrue(userDashboardPage.dashboardButton.isEnabled());
        softAssert.assertTrue(userDashboardPage.buyTicketsButton.isEnabled());
        softAssert.assertTrue(userDashboardPage.homeTitle.isEnabled());
        softAssert.assertTrue(userDashboardPage.aboutTitle.isEnabled());
        softAssert.assertTrue(userDashboardPage.faqsTitle.isEnabled());
        softAssert.assertTrue(userDashboardPage.blogTitle.isEnabled());
        softAssert.assertTrue(userDashboardPage.contactTitle.isEnabled());
        softAssert.assertTrue(userDashboardPage.contactTitle.isEnabled());

        //Choose your Ticket section
        softAssert.assertTrue(userDashboardPage.pickUpPointButton.isEnabled());
        softAssert.assertTrue(userDashboardPage.droppingPointButton.isEnabled());
        softAssert.assertTrue(userDashboardPage.findTicketsButton.isEnabled());

        //Get Ticket Now button section
        softAssert.assertTrue(userDashboardPage.getTicketNowButton.isEnabled());

        //In Just 3 Simple Steps, Get Your Bus Ticket section
        softAssert.assertTrue(userDashboardPage.bodyFirstTitle.isDisplayed());
        softAssert.assertTrue(userDashboardPage.lookingForaBusTitle.isDisplayed());
        softAssert.assertTrue(userDashboardPage.selectYourTicketTitle.isDisplayed());
        softAssert.assertTrue(userDashboardPage.payYourBillTitle.isDisplayed());

        //Offered Facilities section
        softAssert.assertTrue(userDashboardPage.offeredFacilitiesTitle.isDisplayed());
        softAssert.assertTrue(userDashboardPage.facilitiesItems.isDisplayed());

        //Our Tertimonials section
        softAssert.assertTrue(userDashboardPage.ourTestimonialsTitle.isDisplayed());
        softAssert.assertTrue(userDashboardPage.customerComments.isDisplayed());

        //Recent Blog Post section
        softAssert.assertTrue(userDashboardPage.recentBlogPostTitle.isDisplayed());
        softAssert.assertTrue(userDashboardPage.travelTrendsBlogTitle.isEnabled());
        softAssert.assertTrue(userDashboardPage.travelTechnologyBlogTitle.isEnabled());
        softAssert.assertTrue(userDashboardPage.safetyMeasuresBlogTitle.isEnabled());

        //Footer section
        softAssert.assertTrue(userDashboardPage.getTwitterIconFooter.isDisplayed());
        softAssert.assertTrue(userDashboardPage.getFacebookIconFooter.isEnabled());
        softAssert.assertTrue(userDashboardPage.getYoutubeIconFooter.isEnabled());
        softAssert.assertTrue(userDashboardPage.getInstagramIconFooter.isEnabled());
        softAssert.assertTrue(userDashboardPage.getAboutTitleFooter.isEnabled());
        softAssert.assertTrue(userDashboardPage.getFaqsTitleFooter.isEnabled());
        softAssert.assertTrue(userDashboardPage.getBlogTitleFooter.isEnabled());
        softAssert.assertTrue(userDashboardPage.footerContactUsefulLinks.isEnabled());
        softAssert.assertTrue(userDashboardPage.getPrivacyPolicyTitleFooter.isEnabled());
        softAssert.assertTrue(userDashboardPage.getTermsAndConditionsTitleFooter.isEnabled());
        softAssert.assertTrue(userDashboardPage.getTicketPoliciesFooter.isEnabled());
        softAssert.assertTrue(userDashboardPage.footerContactInfoAdrese.isEnabled());
        softAssert.assertTrue(userDashboardPage.footerPhoneLink.isEnabled());
        softAssert.assertTrue(userDashboardPage.footerEmailAdreseLink.isEnabled());
        softAssert.assertAll();
    }
}
