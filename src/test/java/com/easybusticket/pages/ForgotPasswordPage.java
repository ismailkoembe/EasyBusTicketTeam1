package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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

    @FindBy (xpath = "/html/body/div[3]")
    public WebElement confirmMessage;

    @FindBy (xpath = "/html/body/section/div/div/form/div[2]/div[2]/a")
    public WebElement tryToSendAgain;

    public void passwordCodeTest(){
        Select select = new Select(selectBoxUserName);
        select.selectByVisibleText("Username");

        enterUserName.sendKeys("emmaaa");

        waitAndClick(sendPasswordCodeButton);

        boolean isDisplayedConfirm = confirmMessage.isDisplayed();

        softAssert.assertTrue(isDisplayedConfirm, "Confirm message not displayed");
        softAssert.assertAll();

        waitAndClick(tryToSendAgain);
    }


}
