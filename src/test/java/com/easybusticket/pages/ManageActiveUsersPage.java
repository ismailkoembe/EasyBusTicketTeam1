package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageActiveUsersPage {
    public ManageActiveUsersPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }

    @FindBy(xpath = "//*[@class='btn btn--primary btn--shadow btn-block btn-lg']")
    WebElement loginLogs;

    /**
     * REYHAN for All Users Under the manage users
     */
    public void loginLogs(){

        loginLogs.isDisplayed();

    }
}
