package com.easybusticket.pages;

import com.easybusticket.tests.BaseTest;
import com.easybusticket.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends BasePage {

    public ProfilePage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstname;

    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastname;


    @FindBy(xpath = "//input[@id='phone']")
    public WebElement phone;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='address']")
    public WebElement address;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement city;

    @FindBy(xpath = "//input[@id='zip']")
    public WebElement zip;

    @FindBy(xpath = "//input[@id='state']")
    public WebElement state;

    @FindBy(tagName = "button")
    public WebElement buttonUpdateProfile;


    @FindBy(xpath = "//div[@class='row justify-content-center']")
    public WebElement page;

    @FindBy(xpath = "(//a[text()='Profile'])[1]")
    public WebElement dropDownProfile;

    // Profile option
    @FindBy(xpath = "(//a[text()='Profile'])[2]")
    public WebElement profileOption;


    public ProfilePage profileSetting() {

        dropDownProfile.click();

        profileOption.click();

        return new ProfilePage();
    }

    public ProfilePage updateProfileSettings() {

        UserLoginPage loginPage = new UserLoginPage();
        address.clear();

        String fakeAddress = "Exocet" + loginPage.faker.letterify("??");
        address.sendKeys(fakeAddress + Keys.ENTER);

        JavascriptExecutor jse = (JavascriptExecutor) Driver.get(env);
        jse.executeScript("arguments[0].scrollIntoViewIfNeeded(true);", buttonUpdateProfile);

        buttonUpdateProfile.submit();
        //String actualresult = successfulyUpdateMessage.getText();

        //String expectedresult = "Profile updated successfully";

        //softAssert.assertEquals(actualresult, expectedresult);


        return new ProfilePage();
    }

    public void titleCheckTest() {

        String expectedTitle = "Profile Setting";
        String actualTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualTitle, expectedTitle);
        softAssert.assertAll();

    }


}
