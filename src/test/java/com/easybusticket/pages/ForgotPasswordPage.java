package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage extends BasePage {
    public ForgotPasswordPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }


    @FindBy (xpath = "/html/body/section/div/div/form/div[1]/div/select")
    public WebElement userName;

    @FindBy (xpath = "/html/body/section/div/div/form/div[4]/div[2]/a")
    public WebElement forgotPasword;

    @FindBy (xpath = "/html/body/section/div/div/form/div[1]/div/select")
    public WebElement byUserName;

    @FindBy (xpath = "/html/body/section/div/div/form/div[2]/div")
    public WebElement enterUserName;

    @FindBy (xpath = "/html/body/section/div/div/form/div[3]/div/button")
    public WebElement sendPasswordCode;

    @FindBy (xpath = "/html/body/section/div/div/form/div[1]/div/input")
    public WebElement enterCode;
    @FindBy (xpath = "/html/body/section/div/div/form/div[1]/div/div/input")
    public WebElement enterNewPassword;

    @FindBy (xpath = "/html/body/section/div/div/form/div[2]/div/input")
    public WebElement confirmNewPassword;

    @FindBy (xpath = "/html/body/section/div/div/form/div[3]/div/div/button")
    public WebElement resetPasswordButton;

    public void passwordCodeTest(){

        userName.sendKeys("emmaaa");
        waitAndClick(forgotPasword);
        String temporaryCode ="593068";

        actions.click(forgotPasword)
                .sendKeys(byUserName)
                .sendKeys(faker.name().username().replaceAll("\\W","").concat("emmaaa"))
                .sendKeys(sendPasswordCode)
                .sendKeys(Keys.ENTER)
                .sendKeys(temporaryCode)
                .sendKeys(enterNewPassword)
                .sendKeys(faker.lorem().characters())
                .sendKeys(Keys.TAB)
                .sendKeys(confirmNewPassword)
                .perform();

        resetPasswordButton.click();

        String expectedTitle="Easy Bus Ticket - Dashboard";
        String actualTitle=Driver.get(env).getTitle();
        softAssert.assertEquals(expectedTitle,actualTitle);
        softAssert.assertAll();














                //

    }


}
