package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Ismail Koembe
 */
@Slf4j
public class RegisterPage extends BasePage {

    public RegisterPage(){
        PageFactory.initElements(Driver.get("stage"),this);
    }

    //sign up page text
    @FindBy(xpath = "//span[text()='Sign Up your Account']")
    public WebElement textOfSignUpyourAccount;

    //Firstname textbox
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement textBoxOfFirstName;

    //Acceptin All button
    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement buttonOfAcceptingall;

    //Sign Up button
    @FindBy(xpath = "//button[text()='Sign Up']")
    public WebElement buttonOfSignUp;

    //Dashboard title text
    @FindBy(xpath = "//h2[text()='Dashboard']")
    public WebElement labelDashboard;

    //Alert text
    @FindBy(xpath = "//strong[@class='text-dark']")
    public WebElement labelAlert;



    public UserDashboard signUp(){


        String fakePassword="06Feriha&";
        waitAndClick(textBoxOfFirstName);


        actions.click(textBoxOfFirstName)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.country().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().subscriberNumber())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().username().replaceAll("\\W","").concat("canim"))
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(fakePassword)
                .sendKeys(Keys.TAB)
                .sendKeys(fakePassword)
                .perform();

       buttonOfAcceptingall.click();

       buttonOfSignUp.click();

        String expectedTitle="Easy Bus Ticket - Dashboard";
        String actualTitle=Driver.get(env).getTitle();
        softAssert.assertEquals(expectedTitle,actualTitle);
        softAssert.assertAll();


        return new UserDashboard();
    }

    public UserDashboard withoutLastnameAndEmailSignUp(){

        String fakePassword="06Feriha&";

        waitAndClick(textBoxOfFirstName);
        actions.click(textBoxOfFirstName)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys("")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.country().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().subscriberNumber())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().username().replaceAll("\\W","").concat("canim"))
                .sendKeys(Keys.TAB)
                .sendKeys("")
                .sendKeys(Keys.TAB)
                .sendKeys(fakePassword)
                .sendKeys(Keys.TAB)
                .sendKeys(fakePassword)
                .perform();

        buttonOfAcceptingall.click();

        buttonOfSignUp.click();

        softAssert.assertFalse(labelDashboard.isDisplayed());//dashboard title'i goruntulenmemeli
        return new UserDashboard();

    }
    public UserDashboard withExistingUsernameAndEmailSignUp(){

        String username="celinpicard";
        String email="picardcelin06@gmail.com";
        String fakePassword="06Picard&";

        waitAndClick(textBoxOfFirstName);
        actions.click(textBoxOfFirstName)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.country().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().subscriberNumber())
                .sendKeys(Keys.TAB)
                .sendKeys(username)
                .sendKeys(Keys.TAB)
                .sendKeys(email)
                .sendKeys(Keys.TAB)
                .sendKeys(fakePassword)
                .sendKeys(Keys.TAB)
                .sendKeys(fakePassword)
                .perform();

        buttonOfAcceptingall.click();
        buttonOfSignUp.click();

        softAssert.assertTrue(labelAlert.isDisplayed());//alert goruntulenmeli
        return new UserDashboard();
    }


}
