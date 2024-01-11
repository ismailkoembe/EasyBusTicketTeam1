package com.easybusticket.tests;

import com.easybusticket.pages.BasePage;
import com.easybusticket.pages.ContactPage;
import com.easybusticket.pages.HomePage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;
@Slf4j
public class US08_TC01_TC02 extends BaseTest {
    @Test
    public void ContactPageTest(){
        ContactPage contactPage=new HomePage().clickToContactTitle();
        contactPage.titleContactTest();
        log.info("Contact page displayed "+env);

    }

}
