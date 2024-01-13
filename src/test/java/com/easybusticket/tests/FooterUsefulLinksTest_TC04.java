package com.easybusticket.tests;

import com.easybusticket.pages.AboutPage;
import com.easybusticket.pages.BlogPage;
import com.easybusticket.pages.ContactPage;
import com.easybusticket.pages.HomePage;
import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;

@Slf4j
public class FooterUsefulLinksTest_TC04 extends BaseTest {

    @Test
    public void footerUsefulLinksTest() {

        HomePage homePage = new HomePage();


        softAssert.assertTrue(homePage.getFaqsTitleFooter.getAttribute("class").contains("active"));
        AboutPage aboutPage = homePage.clickToAboutButton();
        Driver.get(env).navigate().back();


        Driver.get(env).navigate().back();

     //   BlogPage blogPage =homePage.clickToBlogTitlefromFooter();
       // Driver.get(env).navigate().back();

        //ContactPage contactPage=homePage.clickToFooterContactLink();
        //Driver.get(env).navigate().back();

softAssert.assertAll();

    }
}