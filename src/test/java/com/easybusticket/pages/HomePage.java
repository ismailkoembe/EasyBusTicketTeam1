package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Ismail Koembe
 */
public class HomePage extends BasePage{

    public HomePage(){
        PageFactory.initElements(Driver.get("stage"),this);
    }


    @FindBy(xpath = "//a[text()='Allow']")
    public WebElement cookies;

    @FindBy(xpath = "//*[@class='sign-up']")
    public WebElement signUpLink;



    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement textBoxOfFirstName;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement buttonOfAcceptingall;

    @FindBy(xpath = "//button[text()='Sign Up']")
    public WebElement buttonOfSignUp;

    public RegisterPage register=new RegisterPage();

    public void acceptCookies(){
        waitAndClick(cookies);
    }

    public RegisterPage clickSignUp (){
            waitAndClick(signUpLink);
        String expectedText="Sign Up your Account";
        String actualText= register.textOfSignUpyourAccount.getText();
        softAssert.assertEquals(expectedText,actualText);

        return new RegisterPage();
    }

}
