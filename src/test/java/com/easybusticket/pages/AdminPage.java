package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends BasePage {


    public AdminPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }

    //Username box for Admin
    @FindBy(xpath = "//*[@name='username']")
    public WebElement AdminUsernameBox;

    //Password box for Admin
    @FindBy(xpath = "//*[@name='password']")
    public WebElement AdminPasswordBox;

    //Login Button for Admin
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement ButtonAdminLogin;


    //WelcomeToEasyBusTicket text
    @FindBy(xpath = "//*[text()='Admin Login to Easy Bus Ticket dashboard']")
    public WebElement AdminLoginToEasyBusTicketDashboard;

    //Forgot Password Button
    @FindBy(xpath = "//*[@class='text-muted text--small']")
    public WebElement LinkForgotPassword;


    public void AdminPage(String url) {
        Driver.get("stage").get("AdminUrl");
    }






    public AdminDashboardPage adminLogin() {
       //waitAndClick(AdminUsernameBox);
        AdminUsernameBox.sendKeys("admin07");
        AdminPasswordBox.sendKeys("123123123");
        waitAndClick(ButtonAdminLogin);

        String expectedText = "Admin Login to Easy Bus Ticket dashboard";
        String actualText = Driver.get(env).getTitle();
        softAssert.assertEquals(actualText, expectedText);

        return new AdminDashboardPage();
    }


}
