package com.easybusticket.pages;
import com.easybusticket.utilities.Driver;
import com.easybusticket.utilities.HardWait;
import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

@Slf4j
public class BuyTicketsPage extends BasePage{


    public BuyTicketsPage() {PageFactory.initElements(Driver.get("stage"), this);}

    // Dropdown pickup point menu
    @FindBy(xpath = "(//div[@class='form--group'])[1]")
    public WebElement dropDownPickupPoint ;

    // Austin has selected for pickup point
    @FindBy(xpath = "(//option[@value='2'])[1]")
    public WebElement pickupPoint;

    // Dropdown dropping point menu
    @FindBy(xpath = "(//div[@class='form--group'])[2]")
    public WebElement dropDownDroppingPoint;

    // Dallas has selected for dropping point
    @FindBy(xpath = "(//option[@value='1'])[2]")
    public WebElement droppingPoint;

    // Date of journey menu
    @FindBy(xpath = "(//div[@class='form--group'])[3]")
    public WebElement dateOfJourneyMenu;

    // Day of journey has selected
    @FindBy(xpath = "(//*[@class='ui-state-default'])[21]")
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


    @Step("Select route")
    public void fillTheFindTicketsForm() {

        waitAndClick(dropDownPickupPoint);
        waitAndClick(pickupPoint);
        waitAndClick(dropDownDroppingPoint);
        waitAndClick(droppingPoint);
        (dateOfJourneyMenu).click();
        (dayOfJourney).click();
        (findTicketsButton).click();
        waitAndClick(selectSeatButton);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN)
                .perform();
        HardWait.hardWait(3000);
    }

    @Step("Select seat no")
    public void selectSeat() {

        // Tüm koltukları içeren liste
        List<WebElement> allSeats = new ArrayList<>();

        // Rezerve edilen koltukları içeren liste
        List<WebElement> listSeatsReserved = Driver.get(env).findElements(By.xpath("//span[@class='seat selected']"));
        List<WebElement> listSeatsAvailable = Driver.get(env).findElements(By.xpath( "//span[@class='seat']"));

        // Tüm koltukları ekleyin (örneğin, sayfa yüklenirken)
        allSeats.addAll(listSeatsAvailable); // listSeatsAvailable'ı doğrudan ekleyin
        allSeats.addAll(listSeatsReserved);  // listSeatsReserved'ı doğrudan ekleyin

        // Rezerve edilen koltukları kaldırın
        allSeats.removeAll(listSeatsReserved);

        // Eğer rezerve edilmemiş koltuk varsa devam edin
        if (!allSeats.isEmpty()) {
            Random random = new Random();
            int clickElementIndex = random.nextInt(allSeats.size());
            WebElement selectedSeat = allSeats.get(clickElementIndex);
            waitAndClick(selectedSeat);

        }
    }

    @Step("Gender is select")
    public void selectGender() {
        HardWait.hardWait(2000);
        waitAndClick(femaleCheckBox);
        waitAndClick(continueButtonToPay);
        waitAndClick(confirmButtonToPay1);
    }

    @Step("Click pay now button")
    public void payNow() {

        actions.sendKeys(Keys.PAGE_DOWN)
               .sendKeys(Keys.PAGE_DOWN).perform();
        waitAndClick(payNowButton1);
        waitAndClick(confirmButtonToPay2);
        HardWait.hardWait(2000);
        actions.sendKeys(Keys.PAGE_DOWN)
               .sendKeys(Keys.PAGE_DOWN).perform();
        waitAndClick(payNowButton2);

    }

    @Step("Fill the card information")
    public void fillTheCardInformations() {
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
    HardWait.hardWait(3000);
    }

    // print ticket button
    @FindBy(xpath = "//i[@class='las la-print']")
    public WebElement printButton;

    @Step("Print ticket button is clicks")
    public void printTicket() {

        waitAndClick(printButton);

        HardWait.hardWait(2000);
        //Assert.assertTrue(downloadButton.isDisplayed());

        log.info("Ticket is ready to download");
    }

}
