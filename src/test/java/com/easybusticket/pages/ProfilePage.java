package com.easybusticket.pages;

import com.easybusticket.tests.BaseTest;
import com.easybusticket.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends BaseTest {

    public ProfilePage(){
        PageFactory.initElements(Driver.get("stage"),this);
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

    @FindBy(xpath = "//button[.='Update Profile']")
    public WebElement buttonUpdateProfile;

    @FindBy(xpath = "//div[@class='row justify-content-center']")
    public WebElement page;

    @FindBy(xpath = "(//a[text()='Profile'])[1]")
    public WebElement dropDownProfile;

    // Profile option
    @FindBy(xpath = "(//a[text()='Profile'])[2]")
    public WebElement profileOption;


    public ProfilePage profileSetting (){

        dropDownProfile.click();

        profileOption.click();

        return new ProfilePage();
    }
    public ProfilePage updateProfileSettings (){

        UserLoginPage loginPage = new UserLoginPage();
        address.clear();

        String fakeAddress ="Exocet" + loginPage.faker.letterify("??");
        address.sendKeys(fakeAddress);

        loginPage.actions.sendKeys(Keys.PAGE_DOWN).perform();

        buttonUpdateProfile.click();

        return new ProfilePage();
    }


}
