package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserLoginPage extends BasePage {
    public UserLoginPage() {
        PageFactory.initElements(Driver.get("stage"), this);
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

    public UserDashboard login() {

        username_login.sendKeys("asliekm");
        password_login.sendKeys("243085Asd.");
        waitAndClick(button_login);

        String expectedTitle = "Easy Bus Ticket - Dashboard";
        String actualTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualTitle, expectedTitle);
        softAssert.assertAll();


        return new UserDashboard();
    }

    public UserDashboard loginWithRememberMe() {
        username_login.sendKeys("asliekm");
        password_login.sendKeys("243085Asd.");
        waitAndClick(checkbox_rememberMe);
        waitAndClick(button_login);

        return new UserDashboard();
    }

    public UserPasswordResetPage clickToForgotPassword() {
        waitAndClick(link_forgotPassword);

        String expectedTitle = "Easy Bus Ticket - Forgot Password";
        String actualTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualTitle, expectedTitle);
        softAssert.assertAll();

        return new UserPasswordResetPage();
    }

    public RegisterPage clickToSignUp() {
        waitAndClick(button_SignUp);
        return new RegisterPage();
    }

}
