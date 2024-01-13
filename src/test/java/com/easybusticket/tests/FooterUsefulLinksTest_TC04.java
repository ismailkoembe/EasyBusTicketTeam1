package com.easybusticket.tests;

import com.easybusticket.pages.AboutPage;

import com.easybusticket.pages.BlogPage;
import com.easybusticket.pages.HomePage;
import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import static com.easybusticket.pages.BasePage.driver;

@Slf4j
public class FooterUsefulLinksTest_TC04 extends BaseTest {

    @Test
    public void footerUsefulLinksTest() {
        String currentUrl;
        String expectedUrl;
       /* AboutPage aboutPage =new HomePage().clickToFooterAboutLink();

        currentUrl =Driver.get(env).getCurrentUrl();
        expectedUrl ="https://qa.easybusticket.com/about-us";
        softAssert.assertEquals(currentUrl,expectedUrl, "footer About Link is activ");
        softAssert.assertAll();
        Driver.get(env).navigate().back();

        */

        HomePage.FAQPage faqPage = new HomePage().clickToFooterFaqLink();
        currentUrl =Driver.get(env).getCurrentUrl();
        expectedUrl ="https://qa.easybusticket.com/faq";
        softAssert.assertEquals(currentUrl,expectedUrl, "footer FAQ Link is activ");
        softAssert.assertAll();
        Driver.get(env).navigate().back();


        BlogPage blogPage = new HomePage().clickToBlogTitlefromFooter();
        currentUrl =Driver.get(env).getCurrentUrl();
        expectedUrl ="https://qa.easybusticket.com/blog";
        softAssert.assertEquals(currentUrl,expectedUrl, "footer Blog Link is activ");
        softAssert.assertAll();
        Driver.get(env).navigate().back();





    }
}