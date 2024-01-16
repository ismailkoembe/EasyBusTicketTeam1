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


    @FindBy(xpath = "//a[@class='btn btn-sm btn--primary box--shadow1 text--small addBtn']")
    public WebElement fleetTypeaddNewButton;

    @FindBy(xpath = "//input[@placeholder='Enter Fleet Name']")
    public WebElement fleetTypeTextBoxName;

    @FindBy(xpath = "//select[@name='seat_layout']")
    public WebElement fleetTypeTextBoxSeatLayout;

    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement fleetTypeTextBoxNumberOfDeck;

    @FindBy(xpath = "//input[@placeholder='Enter Number of Deck']")
    public WebElement fleetTypeTextBoxSeatOfDeck;

    @FindBy(xpath = "//span[@class='select2-selection select2-selection--multiple']")
    public WebElement fleetTypeTextBoxFacilities;

    @FindBy(xpath = "//button[.='Save']")
    public WebElement fleetTypeTextBoxButtonSave;

    @FindBy(xpath = "//i[@class='la la-pen']")
    public WebElement penIcon;

    @FindBy(xpath = "//span[.='Wifi']")
    public WebElement FleetTypeTextBoxFacilitiesWifi;

    @FindBy(xpath = "//span[.='Water']")
    public WebElement FleetTypeTextBoxFacilitiesWater;

    @FindBy(xpath = "//span[.='Tea &amp; Coffee']")
    public WebElement FleetTypeTextBoxFacilitiesTeaCoffee;

    @FindBy(xpath = "//span[.='Pillow']")
    public WebElement FleetTypeTextBoxFacilitiesPillow;

    @FindBy(xpath = "//option[@value='Select an option']")
    public WebElement firstDropdownOption;

    @FindBy(xpath = "//button[.='Update']")
    public WebElement updateButton;


//=======================================================================================================//

    public void addFleetType () {
        waitAndClick(fleetTypeaddNewButton);
       //waitAndClick(fleetTypeTextBoxName);

        //fleetTypeTextBoxName.sendKeys(faker.name().name());
       // waitAndClick(fleetTypeTextBoxSeatLayout);

       // waitAndClick(firstDropdownOption);

       // waitAndClick(fleetTypeTextBoxNumberOfDeck);
       // fleetTypeTextBoxNumberOfDeck.sendKeys("1");

       // waitAndClick(fleetTypeTextBoxSeatOfDeck);
        //fleetTypeTextBoxSeatOfDeck.sendKeys(faker.numerify("##"));

       // waitAndClick(fleetTypeTextBoxButtonSave);

    }


   public void updateFleetType(){

        waitAndClick(penIcon);
        waitAndClick(fleetTypeTextBoxName);
        fleetTypeTextBoxName.clear();
        fleetTypeTextBoxName.sendKeys("Urfa Cesur");
        waitAndClick(updateButton);

    }

}