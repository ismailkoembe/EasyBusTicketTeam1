package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserLoginPage extends BasePage{
    public UserLoginPage(){
        PageFactory.initElements(Driver.get("stage"),this);
    }

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username_login;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password_login;

    @FindBy(xpath = "//button[text()='Log In']")
    public WebElement button_login;

    @FindBy(xpath = "//input[@id='remember']")
    public WebElement checkbox_rememberMe;

    @FindBy(xpath = "//a[text()='Forgot Password?']")
    public WebElement link_forgotPassword;

    @FindBy(xpath = "//a[text()='Sign Up']")
    public WebElement button_SignUp;

}
