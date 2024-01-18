package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;
@Slf4j
public class US01_UrlTest extends BaseTest{

    @Test
    @Severity(value = SeverityLevel.MINOR)
    @Description("As a visitor, Access to the home page and viewed the text")
    public void websiteTextTest(){
        HomePage homePage = new HomePage();
        homePage.websiteTest();
        log.info("Text displayed");
    }
}
