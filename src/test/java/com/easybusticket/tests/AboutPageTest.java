package com.easybusticket.tests;

import com.easybusticket.pages.AboutPage;
import com.easybusticket.pages.HomePage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class AboutPageTest extends BaseTest
{
    @Test
    public void AboutPageTest(){
        com.easybusticket.pages.AboutPage aboutPage = new HomePage().clickToAboutButton();
        aboutPage.titleCheckTest();
        log.info(" About page sayfası yüklendi " + env);
    }
}
