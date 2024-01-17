package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclePage extends BasePage{

    public VehiclePage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }


    @FindBy(xpath = "//input[@placeholder='Reg. No.']")
    public WebElement regNoTexBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchButton;

    @FindBy(xpath = "//i[.='Add New']")
    public WebElement addNewVehicles;

    @FindBy(xpath = "//input[@placeholder='Enter nick name']")
    public WebElement nickNameTexBoxVehicles;

    @FindBy(xpath = "//select[@name='fleet_type']")
    public WebElement fleetTypeTexBoxVehicles;





    //====================================================================================================//

    public void Vehicles(){
        waitAndClick(regNoTexBox);
        regNoTexBox.sendKeys("8888");
        waitAndClick(searchButton);


    }
}
