package com.easybusticket.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyTicketsPage extends BasePage{

    // Dropdown pickup point menu
    @FindBy(xpath = "(//*[@class='select2-selection__arrow'])[1]")
    public WebElement dropDownPickupPoint ;

    // Nashville has selected for pickup point
    @FindBy(xpath = "//*[@title='Nashville']")
    public WebElement pickupPointNashville;

    // Dropdown dropping point menu
    @FindBy(xpath = "(//*[@class='select2-selection__arrow'])[2]")
    public WebElement dropDownDroppingPoint;

    // Fort Worth has selected for dropping point
    @FindBy(xpath = "//*[@title='Fort Worth']")
    public WebElement droppingDownFortWorth;

    // Date of journey menu
    @FindBy(id = "dp1705013251149")
    public WebElement dateOfJourneyMenu;

    // Day of journey has selected 21 january 2024
    @FindBy(xpath = "(//*[@class='ui-state-default'])[20]")
    public WebElement dayOfJourney;

    // Find tickets button
    @FindBy(xpath = "//button[text()='Find Tickets']")
    public WebElement findTicketsButton;


}
