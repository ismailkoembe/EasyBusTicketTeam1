package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Ismail Koembe
 */
@Slf4j
public class UserDashboard extends BasePage {
    public UserDashboard(){
        PageFactory.initElements(Driver.get("stage"),this);
    }
    //EasyBusTicket logosu
    @FindBy(xpath = "(//img[@*='Logo'])[1]")
    public WebElement logoEasybusticket;

    //homepage headerdaki dashboard linki
    @FindBy(xpath = "//a[text()='Dashboard']")
    public WebElement linkDashboard;

    //Title Dashborad
   @FindBy(xpath = "//h2[text()='Dashboard']")
   public WebElement titleDashboard;

    public HomePage logoEasybusticket() {
        waitAndClick(logoEasybusticket);
        softAssert.assertTrue(linkDashboard.isDisplayed());
        return new HomePage();
    }

    public void linkDashboard(){
        waitAndClick(linkDashboard);
        softAssert.assertTrue(titleDashboard.isDisplayed());
    }



}
