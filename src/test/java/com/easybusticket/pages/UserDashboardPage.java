package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Slf4j
public class UserDashboardPage extends BasePage {

    public UserDashboardPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }
    //EasyBusTicket logosu
    @FindBy(xpath = "(//img[@*='Logo'])[1]")
    public WebElement logoEasybusticket;

    //homepage headerdaki dashboard linki
    @FindBy(xpath = "//a[text()='Dashboard']")
    public WebElement linkDashboard;

    //Title Dashboard
   @FindBy(xpath = "//h2[text()='Dashboard']")
   public WebElement titleDashboard;

    public HomePage logoEasyBusTicket() {
        waitAndClick(logoEasybusticket);
        softAssert.assertTrue(linkDashboard.isDisplayed());
        softAssert.assertAll();
        return new HomePage();
    }

    public void linkDashboard(){
        waitAndClick(linkDashboard);
        softAssert.assertTrue(titleDashboard.isDisplayed());
        softAssert.assertAll();
    }

    // Button of dashboard
    @FindBy(xpath = "//a[text()='Dashboard']")
    public WebElement dashboardButton;

    // Booking dropdown menu
    @FindBy(xpath = "//a[text()='Booking']")
    public WebElement dropDownBooking;

    // Buy ticket option
    @FindBy(xpath = "//a[text()='Buy Ticket']")
    public WebElement buyTicketOption;

    // Booking history option
    @FindBy(xpath = "//a[text()='Booking History']")
    public WebElement bookingHistory;

    // Support Request dropdown menu
    @FindBy(xpath = "//a[text()='Support Request']")
    public WebElement dropDownSupportRequest;

    // Create New option
    @FindBy(xpath = "//a[text()='Create New']")
    public WebElement createNewOption;

    // Requests option
    @FindBy(xpath = "//a[text()='Requests']")
    public WebElement requestsOption;

    // Profile dropdown
    @FindBy(xpath = "(//a[text()='Profile'])[1]")
    public WebElement dropDownProfile;

    // Profile option
    @FindBy(xpath = "(//a[text()='Profile'])[2]")
    public WebElement profileOption;

    // Change Password option
    @FindBy(xpath = "//a[text()='Change Password']")
    public WebElement changePasswordOption;

    // Logout option
    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement logoutOption;

    // Buy tickets button
    @FindBy(xpath = "//*[@*='cmn--btn btn--sm']")
    public WebElement buyTicketsButton;

    // Icon Phone
    @FindBy(xpath = "//*[@*='las la-phone']")
    public WebElement iconPhone;

    // Phone link
    @FindBy(xpath = "(//a[@href='tel:+1 (603) 624-1800'])[1]")
    public WebElement linkPhone;

    // Icon email
    @FindBy(xpath = "//*[@*='las la-envelope-open']")
    public WebElement iconEmail;

    // Email link
    @FindBy(xpath = "(//a[@href='mailto:info@easybusticket.com'])[1]")
    public WebElement linkEmail;

    // Logo Easy Bus Ticket
    @FindBy(xpath = "(//*[@*='logo'])[1]")
    public WebElement logoEasyBusTicket;

    // Link Easy bus ticket logo link-homepage link
    @FindBy(xpath = "//a[@href='https://easybusticket.com']")
    public WebElement linkHomepage;


    // Total Booked Ticket label
    @FindBy(xpath = "//p[text()='Total Booked Ticket']")
    public WebElement labelTotalBookedTicket;

    // Total booked ticket number
    @FindBy(xpath = "(//h3[@class='title'])[1]")
    public WebElement numberOfTotalBookedTicket;

    // Total Rejected Ticket label
    @FindBy(xpath = "//p[text()='Total Rejected Ticket']")
    public WebElement labelTotalRejectedTicket;

    // Total Rejected ticket number
    @FindBy(xpath = "(//h3[@class='title'])[2]")
    public WebElement numberOfTotalRejectedTicket;

    // Total Pending Ticket label
    @FindBy(xpath = "//p[text()='Total Pending Ticket']")
    public WebElement labelTotalPendingTicket;

    // Total Rejected ticket number
    @FindBy(xpath = "(//h3[@class='title'])[3]")
    public WebElement numberOfTotalPendingTicket;

    // PNR number label
    @FindBy(xpath = "//table/thead/tr/th[1]")
    public WebElement labelPNRnumber;

    // AC/Non-Ac label
    @FindBy(xpath = "//table/thead/tr/th[2]")
    public WebElement labelAcNonAc;

    // Starting point label
    @FindBy(xpath = "//table/thead/tr/th[3]")
    public WebElement labelStartingPoint;

    // Dropping point label
    @FindBy(xpath = "//table/thead/tr/th[4]")
    public WebElement labelDroppingPoint;

    // Journey date label
    @FindBy(xpath = "//table/thead/tr/th[5]")
    public WebElement labelJourneyDate;

    // Pickup time label
    @FindBy(xpath = "//table/thead/tr/th[6]")
    public WebElement labelPickupTime;

    // Booked seats label
    @FindBy(xpath = "//table/thead/tr/th[7]")
    public WebElement labelBookedSeats;

    // Status label
    @FindBy(xpath = "//table/thead/tr/th[8]")
    public WebElement labelStatus;

    // Fare label
    @FindBy(xpath = "//table/thead/tr/th[9]")
    public WebElement labelFare;

    // Action label
    @FindBy(xpath = "//table/thead/tr/th[10]")
    public WebElement labelAction;

    // Ticket No1
    @FindBy(xpath = "(//*[@class='ticket-no'])[1]")
    public WebElement ticketNo1;

    // Action button 1
    @FindBy(xpath = "(//*[@class='action-button-wrapper'])[1]")
    public WebElement actionButton;


    public BuyTicketsPage clickToBuyTicketsButton() {
        waitAndClick(dropDownBooking);
        waitAndClick(buyTicketOption);
        String expectedAboutTitle = "Easy Bus Ticket - Search Result";
        String actualAboutTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualAboutTitle,expectedAboutTitle);

        softAssert.assertAll();


        return new BuyTicketsPage();


    }


    public UserLoginPage logout(){

        waitAndClick(dropDownProfile);
        waitAndClick(logoutOption);
        String expectedTitle ="Easy Bus Ticket - Sign In";
        String actualTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualTitle, expectedTitle);
        softAssert.assertAll();
        return new UserLoginPage();


    }

    public SupportTicketPage requestHistory() {
        waitAndClick(dropDownSupportRequest);
        waitAndClick(requestsOption);
        String expectedTitle = "Easy Bus Ticket - Support Tickets";
        String actualTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualTitle, expectedTitle);
        softAssert.assertAll();
        return new SupportTicketPage();
    }


}

