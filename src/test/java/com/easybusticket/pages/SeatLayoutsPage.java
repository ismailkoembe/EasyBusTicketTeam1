package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SeatLayoutsPage extends BasePage{
    public SeatLayoutsPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }

    @FindBy(xpath = "//i[@class='fa fa-fw fa-plus']")
    public WebElement addNewButton;

    @FindBy(xpath = "(//input[@placeholder='2 x 3'])[1]")
    public WebElement layoutTextBox;

    @FindBy(xpath = "//button[.='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@*='iziToast-texts']")
    public WebElement successfulyUpdateMessage;

    @FindBy(xpath = "//i[@class='la la-pen']")
    public WebElement penIcon;

    @FindBy(xpath = "(//input[@placeholder='2 x 3'])[2]")
    public WebElement layoutTextBoxUpdate;

    @FindBy(xpath = "//i[@class='las la-trash']")
    public WebElement deleteIcon;

    @FindBy(xpath = "//button[.='Update']")
    public WebElement updateButton;

    @FindBy(xpath = "//button[.='Delete']")
    public WebElement deleteButton;

//============================================================================================================//

    public void addSeatLayouts() {

        addNewButton.click();
        layoutTextBox.isDisplayed();

        waitAndClick(layoutTextBox);

        String fakeLayout = faker.numerify("##");
        layoutTextBox.sendKeys(fakeLayout);
        waitAndClick(saveButton);

    }

    public void successfulMessage(){
        String expectedMessage = "Seat layout saved successfully.";
        String actualMessage = successfulyUpdateMessage.getText();
        softAssert.assertEquals(actualMessage,expectedMessage);

    }

    public void updateLayout(){

        waitAndClick(penIcon);
        waitAndClick(layoutTextBoxUpdate);
        layoutTextBoxUpdate.clear();
        layoutTextBoxUpdate.sendKeys(faker.numerify("##"));

        waitAndClick(updateButton);

    }
    public void deleteLayout(){

        waitAndClick(deleteIcon);
        waitAndClick(deleteButton);


    }

}
