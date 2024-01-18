package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclePage extends BasePage{

    public VehiclePage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }


    @FindBy(xpath = "(//input[@placeholder='Reg. No.'])[1]")
    public WebElement regNoTexBox;

    @FindBy(xpath = "//button[@class='btn btn--primary']")
    public WebElement searchButton;

    @FindBy(xpath = "//a[@class='btn btn--primary box--shadow1 addBtn']")
    public WebElement addNewVehicles;

    @FindBy(xpath = "//input[@placeholder='Enter nick name']")
    public WebElement nickNameTexBoxVehicles;

    @FindBy(xpath = "(//input[@placeholder='Enter Reg. No.'])[1]")
    public WebElement registreNoTexBoxVehicles;

    @FindBy(xpath = "//option[@value='1']")
    public WebElement selectAnOption1;

    @FindBy(xpath = "(//input[@placeholder='Enter Eng. No.'])[1]")
    public WebElement engineNoTexBoxVehicles;

    @FindBy(xpath = "(//input[@placeholder='Enter Chasis No.'])[1]")
    public WebElement chasisNoTexBoxVehicles;

    @FindBy(xpath = "(//input[@placeholder='Enter Model No.'])[1]")
    public WebElement modelNoTexBoxVehicles;

    @FindBy(xpath = "//select[@name='fleet_type']")
    public WebElement fleetTypeTexBoxVehicles;

    @FindBy(xpath = "//button[.='Save']")
    public WebElement saveVehicles;

    @FindBy(xpath = "(//i[@class='la la-pen'])[1]")
    public WebElement penIcon;

    @FindBy(xpath = "(//input[@placeholder='Enter nick name'])[2]")
    public WebElement nickNameTexBoxUpdateVehicles;

    @FindBy(xpath = "(//select[@name='fleet_type'])[2]")
    public WebElement fleetTypeTexBoxUpdateVehicles;

    @FindBy(xpath = "(//input[@placeholder='Enter Reg. No.'])[2]")
    public WebElement registreNoTexBoxUpdateVehicles;

    @FindBy(xpath = "//option[@value='77']")
    public WebElement selectAnOption2;

    @FindBy(xpath = "(//input[@placeholder='Enter Eng. No.'])[2]")
    public WebElement engineNoTexBoxUpdateVehicles;

    @FindBy(xpath = "(//input[@placeholder='Enter Chasis No.'])[2]")
    public WebElement chasisNoTexBoxUpdateVehicles;

    @FindBy(xpath = "(//input[@placeholder='Enter Model No.'])[2]")
    public WebElement modelNoTexBoxUpdateVehicles;

    @FindBy(xpath = "//button[.='Update']")
    public WebElement updateVehicles;





    //====================================================================================================//

    public void Vehicles(){
        waitAndClick(regNoTexBox);
        regNoTexBox.sendKeys("8888");
        waitAndClick(searchButton);

    }

    public void AddVehicle(){

        waitAndClick(addNewVehicles);

        waitAndClick(nickNameTexBoxVehicles);
        nickNameTexBoxVehicles.sendKeys(faker.name().firstName());

        waitAndClick(fleetTypeTexBoxVehicles);
        fleetTypeTexBoxVehicles.click();
        waitAndClick(selectAnOption1);

        waitAndClick(registreNoTexBoxVehicles);
        registreNoTexBoxVehicles.sendKeys(faker.numerify("#########"));

        waitAndClick(engineNoTexBoxVehicles);
        engineNoTexBoxVehicles.sendKeys(faker.numerify("####"));

        waitAndClick(chasisNoTexBoxVehicles);
        chasisNoTexBoxVehicles.sendKeys(faker.letterify("???????????????????????").toUpperCase());

        waitAndClick(modelNoTexBoxVehicles);
        modelNoTexBoxVehicles.sendKeys(faker.numerify("####"));

        waitAndClick(saveVehicles);

    }
//=====================================================================================//
    public void UpdateVehicle(){

        waitAndClick(penIcon);

        waitAndClick(nickNameTexBoxUpdateVehicles);
        nickNameTexBoxUpdateVehicles.clear();
        nickNameTexBoxUpdateVehicles.sendKeys(faker.name().firstName());

        waitAndClick(fleetTypeTexBoxUpdateVehicles);
        fleetTypeTexBoxUpdateVehicles.sendKeys("topcam");
        fleetTypeTexBoxUpdateVehicles.click();

        waitAndClick(registreNoTexBoxUpdateVehicles);
        registreNoTexBoxUpdateVehicles.clear();
        registreNoTexBoxUpdateVehicles.sendKeys(faker.numerify("#########"));

        waitAndClick(engineNoTexBoxUpdateVehicles);
        engineNoTexBoxUpdateVehicles.clear();
       engineNoTexBoxUpdateVehicles.sendKeys(faker.numerify("####"));

        waitAndClick(chasisNoTexBoxUpdateVehicles);
        chasisNoTexBoxUpdateVehicles.clear();
       chasisNoTexBoxUpdateVehicles.sendKeys(faker.letterify("???????????????????????").toUpperCase());

        waitAndClick(modelNoTexBoxUpdateVehicles);
        modelNoTexBoxUpdateVehicles.clear();
        modelNoTexBoxUpdateVehicles.sendKeys(faker.numerify("####"));

        waitAndClick(updateVehicles);


    }

    public void titleCheckTest() {

        String expectedTitle = "Vehicle";
        String actualTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualTitle, expectedTitle);
        softAssert.assertAll();

    }
}
