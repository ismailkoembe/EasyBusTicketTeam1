package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import com.easybusticket.utilities.PropManager;
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

    public UserDashboardPage login() {

        username_login.sendKeys(PropManager.getProperties(env, "username"));
        password_login.sendKeys(PropManager.getProperties(env, "password"));
        waitAndClick(button_login);

        String expectedTitle = "Easy Bus Ticket - Dashboard";
        String actualTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualTitle, expectedTitle);
        softAssert.assertAll();


        return new UserDashboardPage();
    }

    public UserDashboardPage login(String username, String password) {

        username_login.sendKeys(username);
        password_login.sendKeys(password);
        waitAndClick(button_login);

        String expectedTitle = "Easy Bus Ticket - Dashboard";
        String actualTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualTitle, expectedTitle);
        softAssert.assertAll();


        return new UserDashboardPage();
    }

    public UserDashboardPage loginWithRememberMe() {
        username_login.sendKeys(PropManager.getProperties(env, "username"));
        password_login.sendKeys(PropManager.getProperties(env, "password"));
        waitAndClick(checkbox_rememberMe);
        waitAndClick(button_login);

        return new UserDashboardPage();
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
