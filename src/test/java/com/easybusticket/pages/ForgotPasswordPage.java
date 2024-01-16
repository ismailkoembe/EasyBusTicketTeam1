package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class ForgotPasswordPage extends BasePage {
    public ForgotPasswordPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }

    @FindBy (xpath = "/html/body/section/div/div/form/div[1]/div/select")
    public WebElement selectBoxUserName;

    @FindBy (xpath = "/html/body/section/div/div/form/div[2]/div/input")
    public WebElement enterUserName;

    @FindBy (xpath = "/html/body/section/div/div/form/div[3]/div/button")
    public WebElement sendPasswordCodeButton;

    @FindBy (xpath = "/html/body/section/div/div/form/div[1]/div/input")
    public WebElement enterCode;


    public void passwordCodeTest(){
        String temporaryCode ="593068";

        Select select = new Select(selectBoxUserName);
        select.selectByVisibleText("Username");

        actions .sendKeys(enterUserName, faker.name().username().replaceAll("\\W","").concat("emmaaa"))
                .click(sendPasswordCodeButton)
                .perform();













                //

    }


}
