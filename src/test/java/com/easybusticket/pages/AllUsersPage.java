package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Slf4j
public class AllUsersPage extends BasePage {

    public AllUsersPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }

    @FindBy(xpath = "//*[@id=\"sidebar__menuWrapper\"]/ul/li[2]/div/ul/li[2]/a")
    public WebElement allUsersButtonLink;


    @FindBy(xpath = "/html/body/div/div[2]/div/div[1]/div[2]/form/div/input")
    public WebElement emailLink;


    @FindBy(xpath = "//table[@class='your-table-class']//tbody//tr[1]//td[7]//a")
    public WebElement detailActionButtonLink;

    @FindBy(xpath = "//form[@class='your-form-class']//input[@class='your-input-class']")
    public WebElement formControlButtonLink;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[1]/div[2]/form/div/div/button")
    public WebElement searchButtonLink;


    public void titleAllUsersPage() {
        String expectedTitle = "Easy Bus Ticket - All Users";
        String actualTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualTitle, expectedTitle, "Incorrect page title on All Users page");
        softAssert.assertAll();
        // assertAll should not be called here
    }

    public void clickToAllUsersPage() {
        allUsersButtonLink.click();
    }

    public void clickToSearchButton() {
        searchButtonLink.click();
    }

    public void searchUserByEmailAndUsername(String email) {
        emailLink.sendKeys(email);
        searchButtonLink.click();

    }
}


