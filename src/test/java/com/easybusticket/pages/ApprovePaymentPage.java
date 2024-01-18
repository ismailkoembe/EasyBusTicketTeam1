package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.support.PageFactory;
@Slf4j
public class ApprovePaymentPage extends BasePage{
    public ApprovePaymentPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }

    public void titleCheckTest(){
       String expectedTitle = "Easy Bus Ticket | Approve Ticket";
       String actualTitle = Driver.get(env).getTitle();

       softAssert.assertEquals(actualTitle,expectedTitle, "404 PAGE ERROR");
       softAssert.assertAll();

    }









}
