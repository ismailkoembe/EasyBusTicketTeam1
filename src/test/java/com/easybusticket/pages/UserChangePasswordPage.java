package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import com.easybusticket.utilities.PropManager;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserChangePasswordPage extends BasePage {
    public UserChangePasswordPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }

    @FindBy(xpath = "(//input[@id='password'])[1]")
    public WebElement inputCurrentPassword;

    @FindBy(xpath = "(//input[@id='password'])[2]")
    public WebElement inputNewPassword;
    @FindBy(xpath = "//input[@id='password_confirmation']")
    public WebElement inputConfirmPassword;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement buttonChangePassword;

    @Step("User clicked to change password button")
    public void clickToChangePasswordButton() {
        inputCurrentPassword.sendKeys(PropManager.getProperties(env, "passwordRegistered"));
        inputNewPassword.sendKeys(PropManager.getProperties(env, "changedPassword"));
        inputConfirmPassword.sendKeys(PropManager.getProperties(env, "confirmPassword"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        waitAndClick(buttonChangePassword);
    }

    @Step("User clicked to change password button")
    public void clickToChangePasswordButton(String currentPassword, String newPassword) {
        inputCurrentPassword.sendKeys(currentPassword);
        inputNewPassword.sendKeys(newPassword);
        inputConfirmPassword.sendKeys(newPassword);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        waitAndClick(buttonChangePassword);
    }
}
