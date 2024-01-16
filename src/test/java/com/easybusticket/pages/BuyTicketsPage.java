package com.easybusticket.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class BuyTicketsPage extends BasePage{

    // Dropdown pickup point menu
    @FindBy(xpath = "(//span[@class='selection'])[1]")
    public WebElement dropDownPickupPoint ;

    // Dropdown search area
    @FindBy(xpath = "//*[@role='searchbox']")
    public WebElement pickupSearchArea;

    // Austin has selected for pickup point
    @FindBy(xpath = "")
    public WebElement pickupAustin;

    // Dropdown dropping point menu
    @FindBy(xpath = "(//*[@class='select2-selection__arrow'])[2]")
    public WebElement dropDownDroppingPoint;

    // Dallas has selected for dropping point
    @FindBy(xpath = "")
    public WebElement droppingDallas;

    // Date of journey menu
    @FindBy(id = "//div[@class='form--group']//input[1]")
    public WebElement dateOfJourneyMenu;

    // Day of journey has selected 21 january 2024
    @FindBy(xpath = "(//*[@class='ui-state-default'])[20]")
    public WebElement dayOfJourney;

    // Find tickets button
    @FindBy(xpath = "//button[text()='Find Tickets']")
    public WebElement findTicketsButton;


    public void fillTheFindTicketsForm(){

    }

}
