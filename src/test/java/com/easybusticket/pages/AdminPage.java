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

    public WebElement adminUsernameBox;

    //Password box for Admin
    @FindBy(xpath = "//*[@name='password']")
    public WebElement adminPasswordBox;

    //Login Button for Admin
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement buttonAdminLogin;

    //WelcomeToEasyBusTicket text
    @FindBy(xpath = "//*[text()='Admin Login to Easy Bus Ticket dashboard']")

    public WebElement adminLoginToEasyBusTicketDashboard;

    //Forgot Password Button
    @FindBy(xpath = "//*[@class='text-muted text--small']")
    public WebElement linkForgotPassword;

    public void AdminPage(String url) {
        Driver.get("stage").get("AdminUrl");
    }



    public AdminDashboardPage adminLogin() {

        waitAndClick(adminUsernameBox);
        adminUsernameBox.sendKeys("admin07");
        adminPasswordBox.sendKeys("123123123");
        waitAndClick(buttonAdminLogin);


        String expectedText = "Admin Login to Easy Bus Ticket dashboard";
        String actualText = Driver.get(env).getTitle();
        softAssert.assertEquals(actualText, expectedText);

        return new AdminDashboardPage();

    }
    /**
     * REYHAN for negative admin login with uncorrect username
     */

    public AdminDashboardPage negativeAdminLoginWithUncorrectUsername() {

        waitAndClick(adminUsernameBox);
        adminUsernameBox.sendKeys("ad");
        adminPasswordBox.sendKeys("123123123");
        waitAndClick(buttonAdminLogin);


        String expectedText = "Admin Login to Easy Bus Ticket dashboard";
        String actualText = Driver.get(env).getTitle();
        softAssert.assertNotEquals(actualText,expectedText);

        return new AdminDashboardPage();

    }

    /**
     * REYHAN for negative admin login with uncorrect password
     */

    public AdminDashboardPage negativeAdminLoginWithUncorrectPassword() {

        waitAndClick(adminUsernameBox);
        adminUsernameBox.sendKeys("admin07");
        adminPasswordBox.sendKeys("123");
        waitAndClick(buttonAdminLogin);


        String expectedText = "Admin Login to Easy Bus Ticket dashboard";
        String actualText = Driver.get(env).getTitle();
        softAssert.assertNotEquals(actualText,expectedText);

        return new AdminDashboardPage();

    }

    /**
     * REYHAN for negative admin login with uncorrect password
     */

    public AdminDashboardPage negativeAdminLoginWithUncorrectCredintial() {

        waitAndClick(adminUsernameBox);
        adminUsernameBox.sendKeys("admin");
        adminPasswordBox.sendKeys("123");
        waitAndClick(buttonAdminLogin);


        String expectedText = "Admin Login to Easy Bus Ticket dashboard";
        String actualText = Driver.get(env).getTitle();
        softAssert.assertNotEquals(actualText,expectedText);

        return new AdminDashboardPage();

    }

    /**
     * REYHAN for negative admin login with uncorrect password
     */

    public AdminDashboardPage negativeAdminLoginWithEmptyCredintial() {

        waitAndClick(adminUsernameBox);
        adminUsernameBox.sendKeys(" ");
        adminPasswordBox.sendKeys(" ");
        waitAndClick(buttonAdminLogin);


        String expectedText = "Admin Login to Easy Bus Ticket dashboard";
        String actualText = Driver.get(env).getTitle();
        softAssert.assertNotEquals(actualText,expectedText);

        return new AdminDashboardPage();

    }


}
