package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeatLayoutsPage extends BasePage{
    public SeatLayoutsPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }

    @FindBy(xpath = "//i[@class='fa fa-fw fa-plus']")
    public WebElement addNewButton;

    @FindBy(xpath = "//input[@placeholder='2 x 3']")
    public WebElement layoutTextBox;

    @FindBy(xpath = "//button[.='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@*='iziToast-texts']")
    public WebElement successfulyUpdateMessage;

    @FindBy(xpath = "//i[@class='la la-pen']")
    public WebElement penIcon;

    @FindBy(xpath = "//i[@class='las la-trash']")
    public WebElement deleteIcon;

    @FindBy(xpath = "//button[.='Update']")
    public WebElement updateButton;

//============================================================================================================//

    public SeatLayoutsPage addSeatLayouts() {

        addNewButton.click();

        layoutTextBox.isDisplayed();

        waitAndClick(layoutTextBox);

        //layoutTextBox.sendKeys(String.valueOf(2));

        String fakeLayout = faker.numerify("##");
        layoutTextBox.sendKeys(fakeLayout);
        waitAndClick(saveButton);

        return new SeatLayoutsPage();
    }

    public SeatLayoutsPage successfulMessage(){
        String expectedMessage = "Seat layout saved successfully.";
        String actualMessage = successfulyUpdateMessage.getText();
        softAssert.assertEquals(actualMessage,expectedMessage);

        return new SeatLayoutsPage();
    }

    public SeatLayoutsPage updateLayout(){

        waitAndClick(penIcon);

        layoutTextBox.click();
        layoutTextBox.clear();

        //layoutTextBox.sendKeys(faker.numerify("##"));

        waitAndClick(updateButton);
        return new SeatLayoutsPage();
    }

}
