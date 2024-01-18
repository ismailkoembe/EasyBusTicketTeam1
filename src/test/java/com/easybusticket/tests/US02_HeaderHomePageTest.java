package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.utilities.Driver;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;

@Slf4j
public class US02_HeaderHomePageTest extends BaseTest {

    @Test
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Displays the items in the header section on the user homepage.")
    public void homePageHeaderTest(){

        // navigate to the HomePage page
        HomePage homePage=new HomePage();

        //Phone button click and check
        Assert.assertTrue(homePage.phoneLink.isDisplayed());
        log.info("phone displayed " );

        //Twitter icon click and check
        homePage.twitterIcon.click();
        String expectedTitle ="https://twitter.com/";
        String actualTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualTitle, expectedTitle);
        log.info("twitter displayed ");
        Driver.get(env).navigate().back();

        //Facebook icon click and check
        homePage.facebookIcon.click();
        expectedTitle ="Facebook - Giriş Yap veya Kaydol";
        actualTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualTitle, expectedTitle);
        log.info("facebook displayed  ");
        Driver.get(env).navigate().back();

        //İnstagram icon click and check
        homePage.instagramIcon.click();
        expectedTitle ="https://www.instagram.com/";
        actualTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualTitle, expectedTitle);
        //homePage.instagramCookie.click();
        log.info("instagram displayed  ");
        Driver.get(env).navigate().back();

        //Sign in check
        Assert.assertTrue(homePage.linkSignIn.isDisplayed());
        log.info(" signın displayed ");

        //Sign up check
        Assert.assertTrue(homePage.signUpLink.isDisplayed());
        log.info(" signup displayed " );

        //Home check
        Assert.assertTrue(homePage.homeTitle.isDisplayed());
        log.info(" Home Title displayed " );

        //About check
        Assert.assertTrue(homePage.aboutButton.isDisplayed());
        log.info(" about Title displayed " );

        //FAQs check
        Assert.assertTrue(homePage.faqsTitle.isDisplayed());
        log.info(" faqs title displayed " );

        //Blog check
        Assert.assertTrue(homePage.blogTitle.isDisplayed());
        log.info(" blog title displayed " );

        //Contact check
        Assert.assertTrue(homePage.contactTitle.isDisplayed());
        log.info(" contact title displayed " );

        //Buy Ticket click and check
        Assert.assertTrue(homePage.buyTicketButtonLink.isDisplayed());
        log.info(" Buy Ticket buttonLink displayed " );

        //Youtube icon click and check
        homePage.youtubeIcon.click();
        expectedTitle ="https://www.youtube.com/";
        actualTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualTitle, expectedTitle);
        log.info("youtube displayed  ");
        Driver.get(env).navigate().back();
        softAssert.assertAll();

    }
}

