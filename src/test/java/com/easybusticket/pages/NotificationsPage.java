package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Slf4j
public class NotificationsPage extends BasePage{
    public NotificationsPage(){
        PageFactory.initElements(Driver.get("stage"),this);
    }

    //Mark all as read butonu
    @FindBy(xpath = "//*[@class='btn btn--primary']")
    public WebElement buttonMarkAllAsRead;

    //No unread notification found texti
    @FindBy(xpath = "//*[text()='No unread notification found']")
    public WebElement labelNoUnreadNotificationFound;

    //header daki notification button
    @FindBy(xpath = "(//button[@type='button'])[5]")
    public WebElement buttonNotification;

    @Step("I clicked the button Mark All as Read in admin")
    public void clickButtonMarkAllAsRead(){
        waitAndClick(buttonMarkAllAsRead);
        /*try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        waitAndClick(buttonNotification);
        softAssert.assertTrue(labelNoUnreadNotificationFound.isDisplayed());
        */
    }
}
