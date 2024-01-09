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
public class Register extends BasePage {

    public Register(){
        PageFactory.initElements(Driver.get("stage"),this);
    }

    @FindBy(xpath = "//span[text()='Sign Up your Account']")
    public WebElement textOfSignUpyourAccount;

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement textBoxOfFirstName;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement buttonOfAcceptingall;

    @FindBy(xpath = "//button[text()='Sign Up']")
    public WebElement buttonOfSignUp;



    public UserDashboard fillTheSignUpForm(){


        String fakePassword="06Feriha&";
        String username="Crazyyy";
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


        return new UserDashboard();




    }


}
