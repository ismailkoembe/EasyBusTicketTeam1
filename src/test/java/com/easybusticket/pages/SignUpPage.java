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
public class SignUpPage extends BasePage {

    public SignUpPage(){
        PageFactory.initElements(Driver.get("stage"),this);
    }

    @FindBy(xpath = "//span[text()='Sign Up your Account']")
    public WebElement textOfSignUpyourAccount;


    public TermsAndConditions fillTheSignUpForm(){


        String fakePassword=faker.internet().password();

        actions.sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.country().name())
                .sendKeys(Keys.TAB)
                .sendKeys("789674923")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().username())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(fakePassword)
                .sendKeys(Keys.TAB)
                .sendKeys(fakePassword)
                .perform();

        return new TermsAndConditions();

    }
}
