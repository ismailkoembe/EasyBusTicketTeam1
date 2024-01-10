package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Ismail Koembe
 */
public class UserDashboard extends BasePage {
    public UserDashboard(){
        PageFactory.initElements(Driver.get("stage"),this);
    }

    // Button of dashboard
    @FindBy(xpath = "//a[text()='Dashboard']")
    public WebElement dashboardButton;

    // Booking dropdown menu
    @FindBy(xpath = "//a[text()='Booking']")
    public WebElement dropDownBooking;

    // Buy ticket option
    @FindBy(xpath = "//a[text()='Buy Ticket']" )
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
    public  WebElement logoutOption;

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
    @FindBy(xpath ="//a[@href='https://easybusticket.com']" )
    public WebElement linkHomepage;

    // Dashboard label
    @FindBy(xpath = "(//*[@class='title'])[1]")
    public WebElement titleDashboard;

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

    // Ticket No1
    @FindBy(xpath = "(//*[@class='ticket-no'])[1]")
    public WebElement ticketNo1;

    // Action button 1
    @FindBy(xpath = "(//*[@class='action-button-wrapper'])[1]")
    public WebElement actionButton;

}
