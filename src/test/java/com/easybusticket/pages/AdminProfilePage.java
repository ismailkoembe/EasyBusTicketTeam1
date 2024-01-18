package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
@Slf4j
public class AdminProfilePage extends BasePage{

    public AdminProfilePage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }
    // Old Password
    @FindBy(xpath = "//input[@name='old_password']")
    public WebElement oldPassword;

    // button save changes
    @FindBy(xpath = "//button[@class='btn btn--primary btn-block btn-lg']")
    public WebElement saveChangesButton;

    // Password settings button
    @FindBy(xpath = "//a[@class='btn btn-sm btn--primary box--shadow1 text--small']")
    public WebElement passwordSettingsButton;

    // Password settigs form title
    @FindBy(xpath = "//*[@class='card-title mb-50 border-bottom pb-2']")
    public WebElement passwordSettingsTitle;

    @Step("Admin password changes succesfully")
    public void changePasswordAdmin(){

        waitAndClick(passwordSettingsButton);
        //Password Setting Title is displayed
        softAssert.assertTrue(passwordSettingsTitle.isDisplayed());
        log.info("password settings form is displayed ");

        String newPassword="123123123";

        waitAndClick(oldPassword);
        actions.click(oldPassword)
                .sendKeys("123123123")
                .sendKeys(Keys.TAB)
                .sendKeys(newPassword)
                .sendKeys(Keys.TAB)
                .sendKeys(newPassword)
                .sendKeys(Keys.TAB)
                .perform();

        waitAndClick(saveChangesButton);

        softAssert.assertAll();
    }

}
