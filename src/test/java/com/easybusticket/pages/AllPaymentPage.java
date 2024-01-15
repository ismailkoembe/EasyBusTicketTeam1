package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.support.PageFactory;
@Slf4j
public class AllPaymentPage extends BasePage {
    public AllPaymentPage(){
        PageFactory.initElements(Driver.get("stage"),this);
    }

    public void titleAllPaymentPage(){

        String expectedTitle = "Easy Bus Ticket - All Payment";
        String actualTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualTitle,expectedTitle);
        softAssert.assertAll();

    }





}
