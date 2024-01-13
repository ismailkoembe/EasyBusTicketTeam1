package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminDashboardPage extends BasePage{
    public AdminDashboardPage(){
        PageFactory.initElements(Driver.get("stage"),this);
    }

    // Represents the title label on the Dashboard page
    @FindBy(className = "page-title")
    public WebElement labelDashboard;

    // Represents the label of the 'Total Users' card
    @FindBy(xpath = "//*[text()='Total Users']")
    public  WebElement labelTotalUsers;

    // Represents the label of the 'Total Verified Users' card
    @FindBy(xpath = "//*[text()='Total Verified Users']")
    public  WebElement labelTotalVerifiedUsers;

    // Represents the label of the 'Total Email Unverified Users' card
    @FindBy(xpath = "//*[text()='Total Email Unverified Users']")
    public  WebElement labelTotalEmailUnverifiedUsers;

    // Represents the label of the 'Total SMS Unverified Users' card
    @FindBy(xpath = "//*[text()='Total SMS Unverified Users']")
    public  WebElement labelTotalSmSUnverifiedUsers;

    // Represents the label of the 'Successful Payment' card
    @FindBy(xpath = "(//*[text()='Successful Payment'])[2]")
    public  WebElement labelSuccessfulPayment;

    // Represents the label of the 'Pending Payment' card
    @FindBy(xpath = "(//*[text()='Pending Payment'])[1]")
    public  WebElement labelpendingPayment;

    // Represents the label of the 'Rejected Payment' card
    @FindBy(xpath = "(//*[text()='Rejected Payment'])[2]")
    public  WebElement labelRejectedPayment;

    // Represents the label of the 'AC Vehicle' card
    @FindBy(xpath = "//*[text()='AC Vehicle']")
    public  WebElement labelAcVehicle;

    // Represents the label of the 'Non-AC Vehicle' card
    @FindBy(xpath = "//*[text()='Non-AC Vehicle']")
    public  WebElement labelNonAcVehicle;

    // Represents the label of the 'Total Counter' card
    @FindBy(xpath = "//*[text()='Total Counter']")
    public  WebElement labelTotalCounter;

    //========================VIEW ALL BUTTON===========================
    // Represents the ' View All' button of the 'Total Users' card
    @FindBy(className = "view-all-message")
    public  WebElement viewAllOfTotalUsersButton;

    // Represents the ' View All' button of the 'Total Verified Users' card
    @FindBy(xpath= "(//a[text()='View All'])[2]")
    public  WebElement viewAllOfTotalVerifiedUsersButton;

    // Represents the ' View All' button of the 'Total Email Unverified Users' card
    @FindBy(xpath = "(//a[text()='View All'])[3]")
    public  WebElement viewAllTotalEmailUnverifiedUsersButton;

    // Represents the ' View All' button of the 'Total SMS Unverified Users' card
    @FindBy(xpath = "(//a[text()='View All'])[4]")
    public  WebElement viewAllOfTotalSmSUnverifiedUsersButton;

    // Represents the ' View All' button of the 'Successful Payment' card
    @FindBy(xpath = "(//a[text()='View All'])[5]")
    public  WebElement viewAllOfSuccessfulPaymentButton;

    // Represents the ' View All' button of the 'Pending Payment' card
    @FindBy(xpath = "(//*[text()='Pending Payment'])[6]")
    public  WebElement viewAllAllOfPendingPaymentButton;


    // Represents the ' View All' button of the 'Rejected Payment' card
    @FindBy(xpath = "(//a[text()='View All'])[7]")
    public  WebElement viewAllOfRejectedPaymentButton;

    // Represents the ' View All' button of the 'AC Vehicle' card
    @FindBy(xpath = "(//a[text()='View All'])[8]")
    public  WebElement viewAllOfAcVehicleButton;

    // Represents the ' View All' button of the 'Non-AC Vehicle' card
    @FindBy(xpath = "(//a[text()='View All'])[9]")
    public  WebElement viewAllOfNonAcVehicleButton;

    // Represents the ' View All' button of the 'Total Counter' card
    @FindBy(xpath = "(//a[text()='View All'])[10]")
    public  WebElement viewAllOfTotalCounterButton;

    // Represents the 'Last Booking History' heading
    @FindBy(xpath = "//*[text()='Latest Booking History']")
    public WebElement labelLatestBookingHistory;

    //Table of the Last Booking History
    @FindBy(xpath= "//table/tbody")
    public WebElement tableLatestBookingHistory;

    //Row of the Last Booking History table
    @FindBy(xpath= "//table/thead/tr")
    public WebElement rowLatestBookingHistory;

    //Coloumn of User
    @FindBy(xpath= "(//table/thead/tr/th)[1] ")
    public WebElement coloumnUser;

    //Coloumn of PNR Nummer
    @FindBy(xpath= "(//table/thead/tr/th)[2] ")
    public WebElement coloumnPnrNummer;

    //Coloumn of Ticket Count
    @FindBy(xpath= "(//table/thead/tr/th)[3] ")
    public WebElement coloumnTicketCount;

     //Coloumn of Amount
    @FindBy(xpath= "(//table/thead/tr/th)[4] ")
    public WebElement coloumnAmount;

    //Coloumn of Action
    @FindBy(xpath= "(//table/thead/tr/th)[5] ")
    public WebElement coloumnAction;

   //Coloumn of Last 30 days Payment History
    @FindBy(xpath = "//*[text()='Last 30 days Payment History']")
    public WebElement labelLast30daysPaymentHistory;


    //Coloumn of Action Details
    @FindBy(xpath = "(//i[@class='la la-desktop'])[1]")
    public WebElement buttonActiondetails;

    // Login By Browser
    @FindBy(xpath = "//*[text()='Login By Browser']")
    public WebElement labelLoginByBrowser;

    // Login By OS
    @FindBy(xpath = "//*[text()='Login By OS']")
    public WebElement labelLoginByOs;

    // Login By OS
    @FindBy(xpath = "//*[text()='Login By Country']")
    public WebElement labelLoginByCountry;

    //========================SIDE BAR===========================//
    @FindBy(xpath = "//*[text()='Payment Gateways']")
    public WebElement paymentGatewaysButton;

    @FindBy(xpath = "//*[text()='Automatic Gateways']")
    public WebElement automaticGatewaysButton;

    @FindBy(xpath = "//*[text()='Manual Gateways']")
    public WebElement manualGatewaysButton;

    public GatewayPage clickToAutomaticGateway(){
        //softAssert.assertTrue(paymentGatewaysButton.isDisplayed());
        waitAndClick(paymentGatewaysButton);
        //softAssert.assertTrue(automaticGatewaysButton.isDisplayed());
        waitAndClick(automaticGatewaysButton);
        //softAssert.assertAll();
    return new GatewayPage();

    }

    //===================================================================//

    @FindBy(xpath = "(//i[@class='menu-icon las la-bus'])[1]")
    public WebElement manageFleets;

    @FindBy(xpath = "//span[text()='Seat Layouts']")
    public WebElement seatLayout;

    @FindBy(xpath = "//span[text()='Fleet Type']")
    public WebElement fleetType;

    @FindBy(xpath = "//span[text()='Vehicles']")
    public WebElement vehicle;

    public AdminDashboardPage ManageFleets(){

        manageFleets.click();



        return new AdminDashboardPage();

    }



}                                              
