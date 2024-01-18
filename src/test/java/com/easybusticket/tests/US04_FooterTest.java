package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class US04_FooterTest extends BaseTest {

    @Test
    @Severity(value = SeverityLevel.NORMAL)
    @Description("As a visitor, I should be able to view the footer when I enter the homepage.")
    public void testFooterVisibilityAndEnable() {

        //As a visitor, I should be able to view the footer when I enter the homepage.
        HomePage homePage = new HomePage();

        //accept the cookies.
        homePage.acceptCookies();

        //scroll down to the bottom of the homepage
        homePage.scrollToBottom();

        //verify the visibility and enable of the footer
        homePage.footerTestVisilibityTest();
        log.info(" Footer section is displayed and enabled " + env);

        // verify the visibility of the social media items
        homePage.footerSocialMediaItemsVisibilityAndEnable();
        log.info(" Social Media and social media icons are displayed and enabled " + env);

        //verify the visibility of Useful Links section
        homePage.footerUsefulLinksItemsVisibilityAndEnable();
        log.info("Useful Links are displayed and enabled " + env);

        //verify the visibility of footer policies section
        homePage.footerPoliciesSectionVisibilityAndEnable();
        log.info("Policies Section are displayed and enabled " + env);

        //verify the visibility of contact Info section
        homePage.footerContactInfoSectionVisibilityAndEnable();
        log.info(" Contact Info Informatons are displayed, Phone and Email link are enabled" + env);
    }
}
