package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.support.PageFactory;
@Slf4j
public class ContactPage extends BasePage{
    public ContactPage(){
        PageFactory.initElements(Driver.get("stage"),this);
    }
public void titleContactTest(){
        String expectedContactTitle="Easy Bus Ticket - Contact Us";
        String actualContactTitle=Driver.get(env).getTitle();
        softAssert.assertEquals(actualContactTitle,expectedContactTitle);
        softAssert.assertAll();
}
}
