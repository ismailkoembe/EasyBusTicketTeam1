package com.easybusticket.tests;

import com.easybusticket.pages.AboutPage;
import com.easybusticket.pages.HomePage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class US05_TC01 extends BaseTest
{
    @Test
    public void AboutPageTest(){
        AboutPage aboutPage = new HomePage().clickToAboutButton();

        new AboutPage().titleCheckTest();
        log.info(" About page sayfası yüklendi " + env);
    }
}
