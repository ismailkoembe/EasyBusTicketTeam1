package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class ManageUsersPage extends BasePage {

    @FindBy(xpath = "/html/body/div/div[2]/div/div[1]/div[2]/form/div/input")
    private WebElement emailLink;

    @FindBy(xpath = "//table[@class='your-table-class']//tbody//tr[1]//td[7]//a")
    private WebElement detailActionButtonLink;

    @FindBy(xpath = "//form[@class='your-form-class']//input[@class='your-input-class']")
    private WebElement formControlButtonLink;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[1]/div[2]/form/div/div/button")
    private WebElement searchButtonLink;

    public  AllUsersPage clikcToManageUsers() {
        waitAndClick(manageUsersDropdownDashboard);

        waitAndClick(allUsersOption);
       
        return new AllUsersPage();

    }

    public void clickToAllUsers() {
        // Assuming that clicking the search button leads to the All Users page
        searchButtonLink.click();
    }


    public ManageUsersPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }

    public void titleCheckTestManageUsers() {
        String expectedAboutTitle = "Easy Bus Ticket - Manage Users";
        String actualAboutTitle = Driver.get(env).getTitle();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualAboutTitle, expectedAboutTitle);
        softAssert.assertAll();
    }

    // Getter methods for WebElement fields
    public WebElement getEmailLink() {
        return emailLink;
    }

    public WebElement getDetailActionButtonLink() {
        return detailActionButtonLink;
    }

    public WebElement getFormControlButtonLink() {
        return formControlButtonLink;
    }

    public WebElement getSearchButtonLink() {
        return searchButtonLink;
    }
}
