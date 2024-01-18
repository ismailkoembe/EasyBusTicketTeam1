package com.easybusticket.tests;

import com.easybusticket.pages.AboutPage;
import com.easybusticket.pages.HomePage;
import io.qameta.allure.*;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class US05_AboutPageTest extends BaseTest
{
    @Test
    @Severity(value = SeverityLevel.MINOR)
    @Description("As a visitor, Access to the about page and viewed the information")
    public void AboutPageTest(){
        AboutPage aboutPage = new HomePage().clickToAboutButton();
        aboutPage.titleCheckTest();
        log.info(" About page loaded ");
    }
}
