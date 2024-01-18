package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import com.easybusticket.utilities.HardWait;
import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

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

    @Step("I clicked to logo Easy Bus Ticket,Redirected to home page")
    public HomePage logoEasyBusTicket() {
        waitAndClick(logoEasybusticket);
        softAssert.assertTrue(linkDashboard.isDisplayed());
        softAssert.assertAll();
        return new HomePage();
    }
    @Step("Clicked on the dashboard link on the home page,I expect title Dashboard")
    public void linkDashboard() {
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

    @Step("Clicks to buy tickets button")
    public BuyTicketsPage clickToBuyTicketsButton() {
        waitAndClick(dropDownBooking);
        waitAndClick(buyTicketOption);
        String expectedAboutTitle = "Easy Bus Ticket - Search Result";
        String actualAboutTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualAboutTitle, expectedAboutTitle);

        softAssert.assertAll();

        return new BuyTicketsPage();

    }

    /**Ayça Ovalı */
    @Step("Registered user logout")
    public UserLoginPage logout() {
        waitAndClick(dropDownProfile);
        waitAndClick(logoutOption);

        WebElement logoutMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iziToast-message")));
        Assert.assertTrue(logoutMessage.isDisplayed(), "Logout message is not displayed.");
        String messageText = logoutMessage.getText();
        Assert.assertEquals(messageText, "You have been logged out.", "Logout message text does not match.");
        log.info("You have been logout. message is displayed");

        String expectedTitle = "Easy Bus Ticket - Sign In";
        String actualTitle = Driver.get(env).getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        log.info("logout method was run");
        return new UserLoginPage();
    }
    /**Ayça Ovalı */
    @Step("registered user clicks on the request history section")
    public SupportTicketPage requestHistory() {
        waitAndClick(dropDownSupportRequest);
        waitAndClick(requestsOption);
        String expectedTitle = "Easy Bus Ticket - Support Tickets";
        String actualTitle = Driver.get(env).getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        log.info("request history option clicked");
        return new SupportTicketPage();
    }

    @Step("click to Booking dropdown menu and then click to Booking History Option")
    public BookingHistoryPage clickToBookingHistory() {
        waitAndClick(dropDownBooking);
        waitAndClick(bookingHistory);
        return new BookingHistoryPage();
    }

    public UserChangePasswordPage getToChangePasswordPage() {
        waitAndClick(dropDownProfile);
        waitAndClick(changePasswordOption);
        String expectedTitle = "Easy Bus Ticket - Change password";
        String actualTitle = Driver.get(env).getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        return new UserChangePasswordPage();
    }

    //Home Title Button
    @FindBy(xpath = "(//a[text()='Home'])")
    public WebElement homeTitle;

    //About Title Button
    @FindBy(xpath = "(//a[text()='About'])")
    public WebElement aboutTitle;

    //FAQs Title Button
    @FindBy(xpath = "(//a[text()='FAQs'])")
    public WebElement faqsTitle;

    //Blog Title Button
    @FindBy(xpath = "(//a[text()='Blog'])")
    public WebElement blogTitle;

    // Contact Title Button.
    @FindBy(xpath = "(//a[text()='Contact'])")
    public WebElement contactTitle;

    //FindTicketsButton
    @FindBy(xpath = "//button[text()='Find Tickets']")
    public WebElement findTicketsButton;

    //Get Ticket Now ButtonLink
    @FindBy(xpath = "//a[@class='cmn--btn ']")
    public WebElement getTicketNowButton;

    //Pickup Point Dropdown
    @FindBy(xpath = "//div[@class='col-md-6'][1]")
    public WebElement pickUpPointButton;

    //Cookie Allow Button
    @FindBy(xpath = "//a[text()='Allow']")
    public WebElement cookies;

    //Dropping Point Dropdown
    @FindBy(xpath = "//div[@class='col-md-6'][2]")
    public WebElement droppingPointButton;

    //'In Just 3 Simple Steps, Get Your Bus Ticket' Title
    @FindBy(xpath = "//div[@class='col-lg-6 col-md-10'][1]")
    public WebElement bodyFirstTitle;

    //'Offered Facilities' Title
    @FindBy(xpath = "(//h2[@class='title'])[2]")
    public WebElement offeredFacilitiesTitle;

    //'Our Testimonials' Title
    @FindBy(xpath = "(//h2[@class='title'])[3]")
    public WebElement ourTestimonialsTitle;

    //'Recent Blog Post' Title
    @FindBy(xpath = "(//h2[@class='title'])[4]")
    public WebElement recentBlogPostTitle;

    //'Looking For a Bus' Title
    @FindBy(xpath = "(//div[@class='col-lg-4 col-md-6 col-sm-10'])[1]")
    public WebElement lookingForaBusTitle;

    //'Select your Ticket' Title
    @FindBy(xpath = "(//div[@class='col-lg-4 col-md-6 col-sm-10'])[2]")
    public WebElement selectYourTicketTitle;

    //'Pay your Bill' Title
    @FindBy(xpath = "(//div[@class='col-lg-4 col-md-6 col-sm-10'])[3]")
    public WebElement payYourBillTitle;

    //Travel Trends Blog Page Link
    @FindBy(xpath = "(//div[@class='col-lg-4 col-md-6 col-sm-10'])[4]")
    public WebElement travelTrendsBlogTitle;

    //Travel Technology Blog Page Link
    @FindBy(xpath = "(//div[@class='col-lg-4 col-md-6 col-sm-10'])[5]")
    public WebElement travelTechnologyBlogTitle;

    //Safety Mesaures Blog Page Link
    @FindBy(xpath = "(//div[@class='col-lg-4 col-md-6 col-sm-10'])[6]")
    public WebElement safetyMeasuresBlogTitle;

    //Facilities Items
    @FindBy(xpath = "(//div[@class='slick-list draggable'])[1]")
    public WebElement facilitiesItems;

    //Customer Comments
    @FindBy(xpath = "(//div[@class='slick-list draggable'])[2]")
    public WebElement customerComments;

    //Footer Twitter Icon Link
    @FindBy(xpath = "(//*[local-name()='svg'])[1]")
    public WebElement getTwitterIconFooter;

    //Footer Facebook Icon Link
    @FindBy(xpath = "(//*[local-name()='svg'])[2]")
    public WebElement getFacebookIconFooter;

    //Footer Youtube Icon Link
    @FindBy(xpath = "(//*[local-name()='svg'])[4]")
    public WebElement getYoutubeIconFooter;

    //Footer Instagram Icon Link
    @FindBy(xpath = "//a[@href='https://www.instagram.com']")
    public WebElement getInstagramIconFooter;

    //Footer About Title Link
    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[2]/div/ul/li[1]/a")
    public WebElement getAboutTitleFooter;

    //Footer FAQs Title Link
    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[2]/div/ul/li[2]/a")
    public WebElement getFaqsTitleFooter;

    //Footer Blog Title Link
    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[2]/div/ul/li[3]/a")
    public WebElement getBlogTitleFooter;

    //Footer Contact Title Link
    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[2]/div/ul/li[4]/a")
    public WebElement footerContactUsefulLinks;

    //Footer Privacy Policy Title Link
    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[3]/div/ul/li[1]/a")
    public WebElement getPrivacyPolicyTitleFooter;

    //Footer Terms and Conditions Title Link
    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[3]/div/ul/li[2]/a")
    public WebElement getTermsAndConditionsTitleFooter;

    //Footer Ticket Policies Title Link
    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[3]/div/ul/li[3]/a")
    public WebElement getTicketPoliciesFooter;

    //Footer Contact Info Adress
    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[4]/div/ul/li[1]")
    public WebElement footerContactInfoAdrese;

    //Footer phone Link
    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[4]/div/ul/li[2]/a")
    public WebElement footerPhoneLink;

    //Footer Adress Link
    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[4]/div/ul/li[3]/a")
    public WebElement footerEmailAdreseLink;

    public SupportTicketPage createNewHistory() {
        waitAndClick(dropDownSupportRequest);
        waitAndClick(createNewOption);
        String expectedTitle = "Easy Bus Ticket - Support Tickets";
        String actualTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualTitle, expectedTitle);
        softAssert.assertAll();
        return new SupportTicketPage();
    }

    @Step("User navigated to the New Support Ticket Page")
    public SupportTicketPage createNewRequestPage() {
        waitAndClick(dropDownSupportRequest);
        waitAndClick(createNewOption);
        String expectedTitle = "Easy Bus Ticket - Support Tickets";
        String actualTitle = Driver.get(env).getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        return new SupportTicketPage();
    }

}

