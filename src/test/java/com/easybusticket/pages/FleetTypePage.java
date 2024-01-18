package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FleetTypePage extends BasePage{

    public FleetTypePage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }

    @FindBy(xpath = "//span[.='Fleet Type']")
    public WebElement fleetType;

    @FindBy(xpath = "//a[@class='btn btn-sm btn--primary box--shadow1 text--small addBtn']")
    public WebElement fleetTypeaddNewButton;

    @FindBy(xpath = "//input[@placeholder='Enter Fleet Name']")
    public WebElement fleetTypeTextBoxName;

    @FindBy(xpath = "(//input[@placeholder='Enter Fleet Name'])[2]")
    public WebElement fleetTypeTextBoxName1;

    @FindBy(xpath = "//select[@name='seat_layout']")
    public WebElement fleetTypeTextBoxSeatLayout;

    @FindBy(xpath = "(//input[@placeholder='Enter Number of Deck'])[1]")
    public WebElement fleetTypeTextBoxNumberOfDeck;

    @FindBy(xpath = "(//input[@placeholder='Enter Number of Seat'])[1]")
    public WebElement fleetTypeTextBoxSeatOfDeck;

    @FindBy(xpath = "//option[@value='1x2']")
    public WebElement selectAnOption;

    @FindBy(xpath = "//span[@class='select2-selection select2-selection--multiple']")
    public WebElement fleetTypeTextBoxFacilities;

    @FindBy(xpath = "//button[.='Save']")
    public WebElement fleetTypeTextBoxButtonSave;

    @FindBy(xpath = "//i[@class='la la-pen']")
    public WebElement penIcon;


    @FindBy(xpath = "//option[.='1 x 2']")
    public WebElement firstDropdownOption;

    @FindBy(xpath = "//button[.='Update']")
    public WebElement updateButton;





//=======================================================================================================//

    public void addFleetType () {
        waitAndClick(fleetTypeaddNewButton);
        waitAndClick(fleetTypeTextBoxName);

        fleetTypeTextBoxName.sendKeys(faker.name().firstName());
        waitAndClick(fleetTypeTextBoxSeatLayout);

        waitAndClick(firstDropdownOption);

        waitAndClick(fleetTypeTextBoxNumberOfDeck);
        fleetTypeTextBoxNumberOfDeck.sendKeys("1");

        waitAndClick(fleetTypeTextBoxSeatOfDeck);
        fleetTypeTextBoxSeatOfDeck.sendKeys("1");

       waitAndClick(fleetTypeTextBoxButtonSave);

    }

   public void updateFleetType(){

        waitAndClick(penIcon);
        waitAndClick(fleetTypeTextBoxName1);

        fleetTypeTextBoxName1.clear();
        fleetTypeTextBoxName1.sendKeys(faker.name().firstName());
        waitAndClick(updateButton);

    }

    public void addFleetTypeCheckTest(){

        String expectedTitle = "Add fleet type successfuly";
        String actualTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualTitle, expectedTitle);
        softAssert.assertAll();

    }

}