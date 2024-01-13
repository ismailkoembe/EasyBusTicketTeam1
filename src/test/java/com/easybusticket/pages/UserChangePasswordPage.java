package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
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

    public UserChangePasswordPage clickToChangePasswordButton() {
        inputCurrentPassword.sendKeys("LoginTesti!2");
        inputNewPassword.sendKeys("LoginTesti!3");
        inputConfirmPassword.sendKeys("LoginTesti!3");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.get(env);
        javascriptExecutor.executeScript("javascript:window.scrollBy(0,750)");
        waitAndClick(buttonChangePassword);
        return new UserChangePasswordPage();
    }
}
