package com.easybusticket.tests;

import com.easybusticket.pages.AboutPage;
import com.easybusticket.pages.HomePage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class AboutPageTest_US05 extends BaseTest
{
    @Test
    @Severity(value = SeverityLevel.MINOR)
    @Description("I expect to see correct title")
    public void AboutPageTest(){
        AboutPage aboutPage = new HomePage().clickToAboutButton();
        aboutPage.titleCheckTest();
        log.info(" About page sayfası yüklendi ");
    }
}
