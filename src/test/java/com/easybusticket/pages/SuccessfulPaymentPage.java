package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
@Slf4j
public class SuccessfulPaymentPage extends BasePage {
    public SuccessfulPaymentPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }
    
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div/table/tbody/tr[1]/td[7]/a")
    public WebElement detailActionButtonLink;

    public void titleSuccessfulPaymentPage() {

        String expectedTitle = "Easy Bus Ticket - Successful Payment";
        String actualTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualTitle, expectedTitle);
        softAssert.assertAll();

    }
}
