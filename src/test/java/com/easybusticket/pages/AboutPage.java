package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Slf4j
public class AboutPage extends BasePage{
    public AboutPage(){
        PageFactory.initElements(Driver.get("stage"),this);
    }
    //About page title
    @FindBy (xpath = "(//h2[@class='title'])[1]")
    public WebElement labelAboutPage;

    public void titleCheckTest(){
        String expectedAboutTitle = "Easy Bus Ticket - About";
        String actualAboutTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualAboutTitle,expectedAboutTitle);
        softAssert.assertAll();
    }
}
