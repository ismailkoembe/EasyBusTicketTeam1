package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
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

    public SeatLayoutsPage addSeatLayouts() {

        addNewButton.click();

        layoutTextBox.isDisplayed();

        waitAndClick(layoutTextBox);

        //layoutTextBox.sendKeys(String.valueOf(2));


        layoutTextBox.sendKeys("43");

        waitAndClick(saveButton);

        return new SeatLayoutsPage();

    }

}
