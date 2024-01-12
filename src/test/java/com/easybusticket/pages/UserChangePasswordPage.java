package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserChangePasswordPage extends BasePage{
    public UserChangePasswordPage(){
        PageFactory.initElements(Driver.get("stage"),this);
    }
    @FindBy(xpath = "(//input[@id='password'])[1]")
    public WebElement inputCurrentPassword;

    @FindBy(xpath = "(//input[@id='password'])[2]")
    public WebElement inputNewPassword;
    @FindBy(xpath = "//input[@id='password_confirmation']")
    public WebElement inputConfirmPassword;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement buttonChangePassword;

    public UserChangePasswordPage clickToChangePasswordButton(){
        inputCurrentPassword.sendKeys("");
        waitAndClick(buttonChangePassword);
        return new UserChangePasswordPage();
    }
}
