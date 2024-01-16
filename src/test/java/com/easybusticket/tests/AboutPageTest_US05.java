package com.easybusticket.tests;

import com.easybusticket.pages.AboutPage;
import com.easybusticket.pages.HomePage;
import io.qameta.allure.*;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class AboutPageTest_US05 extends BaseTest
{
    @Test
    @Severity(value = SeverityLevel.MINOR)
    @Description("I expect to see correct title")
    @Story("1. Some story")
    public void AboutPageTest(){
        AboutPage aboutPage = new HomePage().clickToAboutButton();
        aboutPage.titleCheckTest();
        log.info(" About page sayfası yüklendi ");
    }
}
