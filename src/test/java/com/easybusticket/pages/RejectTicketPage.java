package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;

public class RejectTicketPage extends BasePage {
    public RejectTicketPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }
@Step("check the title")
    public void titleCheckTest(){
        String expectedTitle = "Easy Bus Ticket | Reject Ticket";
        String actualTitle = Driver.get(env).getTitle();

        softAssert.assertEquals(actualTitle,expectedTitle, "404 PAGE ERROR");
        softAssert.assertAll();

    }
}
