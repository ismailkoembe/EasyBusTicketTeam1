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

    @FindBy(xpath = "//button[@class='btn btn--primary']")
    public WebElement searchButton;

    @FindBy(xpath = "//i[.='Add New']")
    public WebElement addNewVehicles;

    @FindBy(xpath = "//input[@placeholder='Enter nick name']")
    public WebElement nickNameTexBoxVehicles;

    @FindBy(xpath = "(//input[@placeholder='Enter Reg. No.'])[1]")
    public WebElement registreNoTexBoxVehicles;

    @FindBy(xpath = "(//input[@placeholder='Enter Reg. No.'])[2]")
    public WebElement engineNoTexBoxVehicles;

    @FindBy(xpath = "(//input[@placeholder='Enter Chasis No.'])[2]")
    public WebElement chasisNoTexBoxVehicles;

    @FindBy(xpath = "(//input[@placeholder='Enter Model No.'])[1]")
    public WebElement modelNoTexBoxVehicles;

    @FindBy(xpath = "//select[@name='fleet_type']")
    public WebElement fleetTypeTexBoxVehicles;





    //====================================================================================================//

    public void Vehicles(){
        waitAndClick(regNoTexBox);
        regNoTexBox.sendKeys("8888");
        waitAndClick(searchButton);

    }

    public void AddVehicle(){



    }
}
