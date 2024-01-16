package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import java.util.List;
@Slf4j
public class BuyTicketsPage extends BasePage{
    public BuyTicketsPage() {PageFactory.initElements(Driver.get("stage"), this);}

    // Dropdown pickup point menu
    @FindBy(xpath = "(//div[@class='form--group'])[1]")
    public WebElement dropDownPickupPoint ;

    // Austin has selected for pickup point
    @FindBy(xpath = "(//option[@value='1'])[1]")
    public WebElement pickupAustin;

    // Dropdown dropping point menu
    @FindBy(xpath = "(//div[@class='form--group'])[2]")
    public WebElement dropDownDroppingPoint;

    // Dallas has selected for dropping point
    @FindBy(xpath = "(//option[@value='2'])[2]")
    public WebElement droppingDallas;

    // Date of journey menu
    @FindBy(xpath = "(//div[@class='form--group'])[3]")
    public WebElement dateOfJourneyMenu;

    // Day of journey has selected
    @FindBy(xpath = "(//*[@class='ui-state-default'])[29]")
    public WebElement dayOfJourney;

    // Find tickets button
    @FindBy(xpath = "//button[text()='Find Tickets']")
    public WebElement findTicketsButton;

    // select seat button
    @FindBy(xpath = "//a[@class='btn btn--base']")
    public WebElement selectSeatButton;

    // female gender box
    @FindBy(xpath = "//label[@for='female']")
    public WebElement femaleCheckBox;

    // select seat no
    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div[1]/div/div[9]/div[1]/div/span")
    public WebElement seatNo;

    // continue button
    @FindBy(xpath = "//button[@class='book-bus-btn']")
    public WebElement continueButtonToPay;

    // confirmation button 1
    @FindBy(xpath = "//button[@class='btn btn--success btn--sm w-auto']")
    public WebElement confirmButtonToPay1;

    // pay now button 1
    @FindBy(xpath = "(//a[@class=' btn btn--base w-100 deposit'])[1]")
    public WebElement payNowButton1;

    // confirmation button 2
    @FindBy(xpath = "//button[@class='btn btn--success confirm-btn btn--sm']")
    public WebElement confirmButtonToPay2;

    // pay now button 2
    @FindBy(xpath = "//a[@class='btn btn--base btn--md w-100 radius-5 mt-3 ']")
    public WebElement payNowButton2;

    // name on the card
    @FindBy(xpath = "(//input[@class='form--control custom-input w-auto jp-card-invalid'])[1]")
    public WebElement nameOnCard;

    // pay now button 3
    @FindBy(xpath = "//button[@class='btn btn--base h-40']")
    public WebElement payNowButton3;

    // print ticket button
    @FindBy(xpath = "//i[@class='las la-print']")
    public WebElement printButton;

    // download ticket button
    @FindBy(xpath = "//button[@type='button']")
    public WebElement downloadButton;

    @FindBy(xpath = "(//h5[@class='value'])[1]")
    public WebElement actualPnrNumberOnTicket;

    // actual name on ticket
    @FindBy(xpath = "(//h5[@class='value'])[2]")
    public WebElement actualNameOnTicket;

    @FindBy(xpath = "(//*[@class='ticket-no'])[1]")
    public WebElement expectedPnrNumber;

    public void fillTheFindTicketsForm(){

        waitAndClick(dropDownPickupPoint);
        waitAndClick(pickupAustin);
        waitAndClick(dropDownDroppingPoint);
        waitAndClick(droppingDallas);
        (dateOfJourneyMenu).click();
        (dayOfJourney).click();
        (findTicketsButton).click();
        waitAndClick(selectSeatButton);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).perform();
        waitAndClick(seatNo);
        waitAndClick(femaleCheckBox);

        waitAndClick(continueButtonToPay);
        waitAndClick(confirmButtonToPay1);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        waitAndClick(payNowButton1);
        waitAndClick(confirmButtonToPay2);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        waitAndClick(payNowButton2);


    }
    public void fillTheCardInformations(){
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        waitAndClick(nameOnCard);
        actions.sendKeys("WISE QUARTER")
                .sendKeys(Keys.TAB)
                .sendKeys("4242424242424242")
                .sendKeys(Keys.TAB)
                .sendKeys("12 / 34")
                .sendKeys(Keys.TAB)
                .sendKeys("572")
                .perform();
        waitAndClick(payNowButton3);

        String actualPnrNumber = actualPnrNumberOnTicket.getText();
        waitAndClick(printButton);

        softAssert.assertTrue(downloadButton.isDisplayed());
        log.info("ticket is ready to download");

        softAssert.assertEquals(actualPnrNumber,expectedPnrNumber);
        softAssert.assertEquals(actualNameOnTicket,"Asli ekm");
        log.info("ticket informations are true");
    }

}
