package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ManageActiveUsersPage extends  BasePage{
    public ManageActiveUsersPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }

    @FindBy(xpath = "//*[@class='btn btn--primary btn--shadow btn-block btn-lg']")
    WebElement loginLogs;

    @FindBy(xpath = "//*[@class='btn btn--info btn--shadow btn-block btn-lg']")
    WebElement sendEmail;

    @FindBy(xpath = "//*[@class='btn btn--dark btn--shadow btn-block btn-lg']")
    WebElement loginAsUser;

    @FindBy(xpath = "//*[@class='btn btn--warning btn--shadow btn-block btn-lg']")
    WebElement emailLog;



    /**
     * REYHAN for All Users Under the manage users
     */
    public void userActionVisibility(){
        ManageActiveUsersPage manageActiveUsersPage = new ManageActiveUsersPage();
        softAssert.assertTrue(manageActiveUsersPage.loginLogs.isDisplayed());
        softAssert.assertTrue(manageActiveUsersPage.sendEmail.isDisplayed());
        softAssert.assertTrue(manageActiveUsersPage.loginAsUser.isDisplayed());
        softAssert.assertTrue(manageActiveUsersPage.emailLog.isDisplayed());
        softAssert.assertAll();


    }
}
