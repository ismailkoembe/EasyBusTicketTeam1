package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import com.github.javafaker.Faker;
import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


@Slf4j
public class AdminDashboardPage extends BasePage {

    public AdminDashboardPage() {
        PageFactory.initElements(Driver.get(env), this);


    }


    // Represents the title label on the Dashboard page
    @FindBy(xpath = "//h6[@class='page-title']")
    public WebElement labelDashboard;

    // Represents the label of the 'Total Users' card
    @FindBy(xpath = "//*[text()='Total Users']")
    public WebElement labelTotalUsers;

    // Represents the label of the 'Total Verified Users' card
    @FindBy(xpath = "//*[text()='Total Verified Users']")
    public WebElement labelTotalVerifiedUsers;

    // Represents the label of the 'Total Email Unverified Users' card
    @FindBy(xpath = "//*[text()='Total Email Unverified Users']")
    public WebElement labelTotalEmailUnverifiedUsers;

    // Represents the label of the 'Total SMS Unverified Users' card
    @FindBy(xpath = "//*[text()='Total SMS Unverified Users']")
    public WebElement labelTotalSmSUnverifiedUsers;

    // Represents the label of the 'Successful Payment' card
    @FindBy(xpath = "(//*[text()='Successful Payment'])[2]")
    public WebElement labelSuccessfulPayment;

    // Represents the label of the 'Pending Payment' card

    @FindBy(xpath = "(//*[text()='Pending Payment'])[2]")

    public WebElement labelpendingPayment;

    // Represents the label of the 'Rejected Payment' card
    @FindBy(xpath = "(//*[text()='Rejected Payment'])[2]")
    public WebElement labelRejectedPayment;

    // Represents the label of the 'AC Vehicle' card
    @FindBy(xpath = "//*[text()='AC Vehicle']")
    public WebElement labelAcVehicle;

    // Represents the label of the 'Non-AC Vehicle' card
    @FindBy(xpath = "//*[text()='Non-AC Vehicle']")
    public WebElement labelNonAcVehicle;

    // Represents the label of the 'Total Counter' card
    @FindBy(xpath = "//*[text()='Total Counter']")
    public WebElement labelTotalCounter;

    //========================VIEW ALL BUTTON===========================
    // Represents the ' View All' button of the 'Total Users' card


    @FindBy(xpath = "(//a[@class='btn btn-sm text--small bg--white text--black box--shadow3 mt-3'])[1]")

    public WebElement viewAllOfTotalUsersButton;

    // Represents the ' View All' button of the 'Total Verified Users' card
    @FindBy(xpath = "(//a[text()='View All'])[2]")
    public WebElement viewAllOfTotalVerifiedUsersButton;

    // Represents the ' View All' button of the 'Total Email Unverified Users' card
    @FindBy(xpath = "(//a[text()='View All'])[3]")
    public WebElement viewAllTotalEmailUnverifiedUsersButton;

    // Represents the ' View All' button of the 'Total SMS Unverified Users' card
    @FindBy(xpath = "(//a[text()='View All'])[4]")
    public WebElement viewAllOfTotalSmSUnverifiedUsersButton;

    // Represents the ' View All' button of the 'Successful Payment' card
    @FindBy(xpath = "(//a[text()='View All'])[5]")
    public WebElement viewAllOfSuccessfulPaymentButton;

    // Represents the ' View All' button of the 'Pending Payment' card
    @FindBy(xpath = "(//*[text()='View All'])[6]")
    public WebElement viewAllAllOfPendingPaymentButton;


    // Represents the ' View All' button of the 'Rejected Payment' card
    @FindBy(xpath = "(//a[text()='View All'])[7]")
    public WebElement viewAllOfRejectedPaymentButton;

    // Represents the ' View All' button of the 'AC Vehicle' card
    @FindBy(xpath = "(//a[text()='View All'])[8]")
    public WebElement viewAllOfAcVehicleButton;

    // Represents the ' View All' button of the 'Non-AC Vehicle' card
    @FindBy(xpath = "(//a[text()='View All'])[9]")
    public WebElement viewAllOfNonAcVehicleButton;

    // Represents the ' View All' button of the 'Total Counter' card
    @FindBy(xpath = "(//a[text()='View All'])[10]")
    public WebElement viewAllOfTotalCounterButton;

    // Represents the 'Last Booking History' heading
    @FindBy(xpath = "//*[text()='Latest Booking History']")
    public WebElement labelLatestBookingHistory;

    //Table of the Last Booking History
    @FindBy(xpath = "(//div[@class='card-body'])[1]")
    public WebElement tableLatestBookingHistory;

    //Coloumn of User
    @FindBy(xpath = "(//table/thead/tr/th)[1] ")
    public WebElement coloumnUser;

    //Coloumn of PNR Nummer
    @FindBy(xpath = "(//table/thead/tr/th)[2] ")
    public WebElement coloumnPnrNummer;

    //Coloumn of Ticket Count
    @FindBy(xpath = "(//table/thead/tr/th)[3] ")
    public WebElement coloumnTicketCount;

    //Coloumn of Amount
    @FindBy(xpath = "(//table/thead/tr/th)[4] ")
    public WebElement coloumnAmount;

    //Coloumn of Action
    @FindBy(xpath = "(//table/thead/tr/th)[5] ")
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


    @FindBy(xpath = "//*[text()='Booking History']")
    public WebElement bookingHistorySidebar;

    @FindBy(xpath = "//*[text()='Pending Ticket']")
    public WebElement pendingTicketOnderTheSidebar;

    @FindBy(xpath = "//*[text()='Booked Ticket']")
    public WebElement bookedTicketOnderTheSidebar;

    @FindBy(xpath = "//*[text()='Rejected Ticket']")
    public WebElement rejectedTicketOnderTheSidebar;

    @FindBy(xpath = "//*[text()='All Ticket']")
    public WebElement allTicketOnderTheSidebar;

    @FindBy(xpath = "(//*[@class='menu-title'])[2]")
    public WebElement manageUsers;


    @FindBy(xpath = "(//*[@class='menu-title'])[2]")
    public WebElement allUsersUnderTheManageUsers;


    /**
     * REYHAN  for Admin booking History
     */
    public void bookingHistories() {

        Wait<WebDriver> wait = new FluentWait<>(Driver.get("stage"))
                .withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofSeconds(5L))
                .ignoring(NoSuchElementException.class);
        WebElement bookingHistory = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement bookingHistory = Driver.get("stage").findElement(By.xpath("//*[text()='Booking History']"));
                bookingHistory.click();
                return bookingHistory;
            }

        });

    }

    public void bookingHistoryDropdown() {
        bookingHistorySidebar.isDisplayed();
        pendingTicketOnderTheSidebar.isDisplayed();
        bookedTicketOnderTheSidebar.isDisplayed();
        rejectedTicketOnderTheSidebar.isDisplayed();
        allTicketOnderTheSidebar.isDisplayed();
        waitAndClick(pendingTicketOnderTheSidebar);


    }




    /**
     * REYHAN  for Admin Booked Ticket
     */
    public AdminTicketPage bookedTickets() {

        Wait<WebDriver> wait = new FluentWait<>(Driver.get("stage"))
                .withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofSeconds(5L))
                .ignoring(NoSuchElementException.class);
        WebElement bookedTicket = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement bookedTicket = Driver.get("stage").findElement(By.xpath("//*[text()='Booked Ticket']"));
                bookedTicket.click();
                return bookedTicket;
            }

        });
        return new AdminTicketPage();
    }


    /**
     * REYHAN  for Admin Rejected Ticket
     */

    public AdminTicketPage rejectedTickets() {
        waitAndClick(rejectedTicketOnderTheSidebar);


        return new AdminTicketPage();
    }

    /**
     * REYHAN  for Admin All Ticket
     */

    public AdminTicketPage allTickets() {

        Wait<WebDriver> wait = new FluentWait<>(Driver.get("stage"))
                .withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofSeconds(5L))
                .ignoring(NoSuchElementException.class);
        WebElement allTicket = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement allTicket = Driver.get("stage").findElement(By.xpath("//*[text()='All Ticket']"));
                allTicket.click();
                return allTicket;
            }

        });
        return new AdminTicketPage();
    }


    //Ekrani full screen yapma butonu
    @FindBy(xpath = "//i[@class='fullscreen-open las la-compress']")
    public WebElement buttonFullScreenPage;

    @FindBy(xpath = "//i[@class='fullscreen-close las la-compress-arrows-alt']")
    public WebElement buttonCloseFullScreenPage;

    @Step("Maked the dashboard screen full screen and brings it back to normal")
    public void clickButtonFullScreenPage() {
        waitAndClick(buttonFullScreenPage);
        waitAndClick(buttonCloseFullScreenPage);
    }

    //header'daki search buttonu
    @FindBy(xpath = "(//button[@type='button'])[4]")
    public WebElement buttonSearch;

    //search cubugu
    @FindBy(xpath = "//*[@id='navbar-search__field']")
    public WebElement linkSearch;

    //search alt cubugu
    @FindBy(xpath = "//*[@id=\"navbar_search_result_area\"]/ul/li/a")
    public WebElement linkSearchSub;
    @Step("I clicked button search")
    public void clickButtonSearch() {
        waitAndClick(buttonSearch);
        waitAndClick(linkSearch);
    }
    @FindBy(xpath = "//*[@class='page-title']")
    public WebElement labelContact;
    @FindBy(xpath = "//*[@class='page-title']")
    public WebElement labelBlog;
    @FindBy(xpath = "//*[@class='page-title']")
    public WebElement labelFaq;
    @FindBy(xpath = "//*[@class='page-title']")
    public WebElement labelAboutUs;
    @Step("Page searched with data provider")
    public Object searchPage(String pages) {
        linkSearch.sendKeys(pages);
        waitAndClick(linkSearchSub);
        switch (pages) {
            case "Blog":
                return new BlogPage();
            case "FAQ":
                return new FaqsPage();
            case "About Us":
                return new AboutPage();
            case "Contact":
                return new ContactPage();
        }
        return null;
    }


    //========================SIDE BAR===========================//


    @FindBy(xpath = "//*[text()='Payment Gateways']")
    public WebElement paymentGatewaysButton;

    // DasboardPage of dasboard button
    @FindBy(xpath = "//i[@class='menu-icon las la-home']")
    public WebElement dashboardIconButton;

    @FindBy(xpath = "//*[text()='Automatic Gateways']")
    public WebElement automaticGatewaysButton;

    @FindBy(xpath = "//*[text()='Manual Gateways']")
    public WebElement manualGatewaysButton;
    /** Ayca Ovali*/

    @Step("Admin clicked to automatic gateway submenu option")
    public GatewayPage clickToAutomaticGateway() {
        softAssert.assertTrue(paymentGatewaysButton.isDisplayed());
        waitAndClick(paymentGatewaysButton);
        waitAndClick(automaticGatewaysButton);
        String expectedTitleAutoGateway = "Easy Bus Ticket - Automatic Gateways";
        String actualTitleAutoGateway = Driver.get(env).getTitle();
        softAssert.assertEquals(actualTitleAutoGateway, expectedTitleAutoGateway);
        softAssert.assertAll();
        log.info("Automatic Gateway page loaded");
        return new GatewayPage();

    }

    /** Ayca Ovali*/
    @Step("Admin clicked to manual gateway submenu option")
    public GatewayPage clickToManualGateway() {
        softAssert.assertTrue(paymentGatewaysButton.isDisplayed());
        waitAndClick(paymentGatewaysButton);
        waitAndClick(manualGatewaysButton);
        String expectedTitleManualGateway = "Easy Bus Ticket - Manual Gateways";
        String actualTitleManualGateway = Driver.get(env).getTitle();
        softAssert.assertEquals(actualTitleManualGateway, expectedTitleManualGateway);
        softAssert.assertAll();
        log.info("Manual Gateway page loaded");
        return new GatewayPage();

    }

    //===================================================================//

    //Manage Fleets Dropdown
    @FindBy(xpath = "(//i[@class='menu-icon las la-bus'])[1]")
    public WebElement manageFleets;

    @FindBy(xpath = "//span[.='Seat Layouts']")
    public WebElement seatLayout;

    @FindBy(xpath = "//span[text()='Fleet Type']")
    public WebElement fleetType;

    @FindBy(xpath = "//span[text()='Vehicles']")
    public WebElement vehicle;

    public SeatLayoutsPage manageFleets() {

        waitAndClick(manageFleets);
        waitAndClick(seatLayout);

        return new SeatLayoutsPage();
    }
    public FleetTypePage manageFleets1(){

        waitAndClick(manageFleets);
        waitAndClick(fleetType);

        return new FleetTypePage();

    }

    public VehiclePage manageFleets2() {

        waitAndClick(manageFleets);
        waitAndClick(vehicle);

        return new VehiclePage();

    }
    //Dropdown PaymentHistory option
    @FindBy(xpath = "//*[@id=\"sidebar__menuWrapper\"]/ul/li[3]/a")
    public WebElement paymentHistoryDropdownDashboard;

    //Dropdown PaymentHistory option
    @FindBy(xpath = "//*[@id=\"sidebar__menuWrapper\"]/ul/li[3]/div/ul/li[1]/a/span")
    public WebElement pendingPaymentOption;

    //Dropdown PaymentHistory option
    @FindBy(xpath = "//*[text()='Successful Payment']")
    public WebElement successfulPaymentOption;

    //Dropdown PaymentHistory option
    @FindBy(xpath = "//*[text()='Rejected Payment']")
    public WebElement rejectedPaymentOption;

    //Dropdown PaymentHistory option
    @FindBy(xpath = "//*[text()='All Payment']")
    public WebElement allPaymentOption;


    public boolean isOptionPresent(Select dropdown, String optionText) {
        for (WebElement option : dropdown.getOptions()) {
            if (option.getText().equals(optionText)) {
                return true;
            }
        }
        return false;
    }

    public PendingPaymentPage clickToPendingPayment() {

        waitAndClick(paymentHistoryDropdownDashboard);
        softAssert.assertTrue(paymentHistoryDropdownDashboard.isEnabled());
        waitAndClick(pendingPaymentOption);
        softAssert.assertTrue(pendingPaymentOption.isEnabled());
        softAssert.assertAll();
        return new PendingPaymentPage();

    }

    public SuccessfulPaymentPage clickToSuccessfulPayment() {


        waitAndClick(paymentHistoryDropdownDashboard);
        waitAndClick(successfulPaymentOption);
        return new SuccessfulPaymentPage();

    }

    public RejectedPaymentPage clickToRejectedPayment() {

        softAssert.assertTrue(paymentHistoryDropdownDashboard.isDisplayed());
        waitAndClick(paymentHistoryDropdownDashboard);
        softAssert.assertTrue(rejectedPaymentOption.isDisplayed());
        waitAndClick(rejectedPaymentOption);
        //softAssert.assertAll();
        return new RejectedPaymentPage();

    }

    public AllPaymentPage clickToAllPayment() {

        //softAssert.assertTrue(paymentHistoryDropdownDashboard.isDisplayed());
        waitAndClick(paymentHistoryDropdownDashboard);
        //softAssert.assertTrue(allPaymentOption.isDisplayed());
        waitAndClick(allPaymentOption);
        //softAssert.assertAll();
        return new AllPaymentPage();

    }
    //========================CHANGING-ADMIN-PASSWORD===========================//

    // admin page admin icon
    @FindBy(xpath = "//span[@class='navbar-user']")
    public WebElement adminIcon;

    // admin page, admin icon dropdown menu, option 'profile'
    @FindBy(xpath = "(//*[@class='dropdown-menu__item d-flex align-items-center px-3 py-2'])[1]")
    public WebElement optionProfile;

    // admin logout option
    @FindBy(xpath = "//span[text()='Logout']")
    public WebElement logoutOptionAdmin;

    @Step("Clicks admin icon and directed page settings")
    public AdminProfilePage adminPageSettings() {

        waitAndClick(adminIcon);
        waitAndClick(optionProfile);
        return new AdminProfilePage();
    }
    @Step("Admin successfully logout")
    public void logout() {

        waitAndClick(adminIcon);
        waitAndClick(logoutOptionAdmin);
        String expectedTitle = "Easy Bus Ticket - Admin Login";
        String actualTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualTitle, expectedTitle);
        softAssert.assertAll();

    }

    //header daki notification button
    @FindBy(xpath = "//i[@class='las la-bell text--primary']")
    public WebElement buttonNotification;

    //header daki notification butona basinca cikan notification yazisi
    @FindBy(xpath = "//span[text()='Notification']")
    public WebElement labelNotification;
    @Step("I clicked button notification,I expect title Notification")
    public void clickButtonNotification() {
        waitAndClick(buttonNotification);
        softAssert.assertTrue(labelNotification.isDisplayed());
        softAssert.assertAll();
    }

    //view all notification butonu
    @FindBy(xpath = "//*[@class='view-all-message']")
    public WebElement buttonViewAllNotification;
    @Step("I clicked button View All Notification,navigate to page Notification")
    public NotificationsPage clickViewAllNotification() {
        waitAndClick(buttonViewAllNotification);
        return new NotificationsPage();
    }
//==========================Dashboard View All Button click===========================
    //Viewing total users card with view all button
    @Step(" Clicked All Total Users")
    public ManageUsersPage clickViewAllTotalUsers() {
        waitAndClick(viewAllOfTotalUsersButton);
        String expectedUrl = "https://qa.easybusticket.com/admin/users";
        String actualUrl = Driver.get(env).getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        softAssert.assertAll();
        waitAndClick(dashboardIconButton);
        return new ManageUsersPage();

    }

    //Viewing Total Verified Users card with view all button
    @Step("Clicked All Total Verified Users")
    public ManageActiveUsersPage clickViewAllTotalVerifiedUsers() {

        waitAndClick(viewAllOfTotalVerifiedUsersButton);
        String expectedUrl = "https://qa.easybusticket.com/admin/users/active";
        String actualUrl = Driver.get(env).getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        softAssert.assertAll();
        waitAndClick(dashboardIconButton);
        return new ManageActiveUsersPage();

    }

    //Viewing Email Unverified Users card with view all button
    @Step("Clicked All Email Unverified Users")
    public EmailUnverifiedUsersPage clickViewAllEmailUnverifiedUsers() {
        waitAndClick(viewAllTotalEmailUnverifiedUsersButton);
        String expectedUrl = "https://qa.easybusticket.com/admin/users/email-unverified";
        String actualUrl = Driver.get(env).getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        softAssert.assertAll();
        waitAndClick(dashboardIconButton);
        return new EmailUnverifiedUsersPage();

    }


    //Viewing Total SMS Unverified Users card with view all button
    @Step("Clicked All Total SMS Unverified Users")
    public TotalSMSUnverifiedUsers clickViewAllTotalSMSUnverifiedUsers() {
        waitAndClick(viewAllOfTotalSmSUnverifiedUsersButton);
        String expectedUrl = "https://qa.easybusticket.com/admin/users/sms-unverified";
        String actualUrl = Driver.get(env).getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        softAssert.assertAll();
        waitAndClick(dashboardIconButton);
        return new TotalSMSUnverifiedUsers();

    }

    //Viewing Succesful Payment card with view all button
    @Step("Clicked View All of Successful Payments")
    public SuccessfulPaymentPage clickViewAllSuccessfulPayment() {
        waitAndClick(viewAllOfSuccessfulPaymentButton);
        String expectedUrl = "https://qa.easybusticket.com/admin/payment/successful";
        String actualUrl = Driver.get(env).getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        softAssert.assertAll();
        waitAndClick(dashboardIconButton);
        return new SuccessfulPaymentPage();
    }

    //Viewing Pending Payment card with view all button
    @Step("Clicked View all of PendingPayment")
    public PendingPaymentPage clickViewAllPendingPayment() {
        waitAndClick(viewAllAllOfPendingPaymentButton);
        String expectedUrl = "https://qa.easybusticket.com/admin/payment/pending";
        String actualUrl = Driver.get(env).getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        softAssert.assertAll();
        waitAndClick(dashboardIconButton);
        return new PendingPaymentPage();
    }

    //Viewing Rejected Payment card with view all button
    @Step("Clicked View all of RejectedPaymentPage")
    public RejectedPaymentPage clickViewAllRejectedPayment() {
        waitAndClick(viewAllOfRejectedPaymentButton);
        String expectedUrl = "https://qa.easybusticket.com/admin/payment/rejected";
        String actualUrl = Driver.get(env).getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        softAssert.assertAll();
        waitAndClick(dashboardIconButton);
        return new RejectedPaymentPage();
    }


    //Viewing AC Vehicles card with view all button
    @Step("Clicked View all of AcVehicles")
    public AllVehiclesPages clickViewAllAcVehicles() {
        waitAndClick(viewAllOfAcVehicleButton);
        String expectedUrl = "https://qa.easybusticket.com/admin/manage/vehicles";
        String actualUrl = Driver.get(env).getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        softAssert.assertAll();
        waitAndClick(dashboardIconButton);
        return new AllVehiclesPages();

    }

    //Viewing Non-AC Vehicles card with view all button
    @Step("Clicked View all of NonAcVehicles")
    public AllVehiclesPages clickViewAllNonAcVehicles() {
        waitAndClick(viewAllOfNonAcVehicleButton);
        String expectedUrl = "https://qa.easybusticket.com/admin/manage/vehicles";
        String actualUrl = Driver.get(env).getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        softAssert.assertAll();
        waitAndClick(dashboardIconButton);
        return new AllVehiclesPages();

    }

    //Viewing Total counter card with view all button
    @Step("Clicked View all of TotalCounter")
    public AllCounterPage clickViewAllTotalCounter() {
        waitAndClick(viewAllOfTotalCounterButton);
        String expectedUrl = "https://qa.easybusticket.com/admin/manage/counter";
        String actualUrl = Driver.get(env).getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        softAssert.assertAll();
        waitAndClick(dashboardIconButton);
        return new AllCounterPage();

    }


    //Easy Bus Ticket radio Button
    @FindBy(xpath = "//button[@class='navbar__expand']")
    public WebElement buttonEasyBusTicketradioButton;

    @Step("Clicked View all of ActionButton")
    public BookingHistoryPage clickActionButton() {


        waitAndClick(buttonActiondetails);
        String expectedUrl = "https://qa.easybusticket.com/admin/ticket/booked";
        String actualUrl = Driver.get(env).getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        softAssert.assertAll();
        waitAndClick(dashboardIconButton);
        return new BookingHistoryPage();
    }


    @FindBy(xpath = "//*[text()='All Users']")
    WebElement getAllUsersUnderTheManageUsers;

    @FindBy(xpath = "//*[text()='Active Users']")
    WebElement getActiveUsersUnderTheManageUsers;

    @FindBy(xpath = "//*[text()='Banned Users']")
    WebElement getBannedUsersUnderTheManageUsers;

    @FindBy(xpath = "//*[text()='Email Unverified']")
    WebElement getEmailUnverifiedUnderTheManageUsers;

    @FindBy(xpath = "//*[text()='SMS Unverified']")
    WebElement getSmsUnverifiedUnderTheManageUsers;

    @FindBy(xpath = "//*[text()='Email to All']")
    WebElement getEmailToAllUnderTheManageUsers;


    /**
     * REYHAN  for ManageUsers dropdown menu
     */
    public void manageUsersDropdown() {
        waitAndClick(manageUsers);
    }


    //TransportManager Counter section
    @FindBy(xpath = "(//span[@class='menu-title'])[30]")
    public WebElement counterTitle;

    //All Counter Title
    @FindBy(xpath = "//div[@class='col-lg-6 col-sm-6']")
    public WebElement allCounterTitle;

    //Name title of counter page
    @FindBy(xpath = "//th[text()='Name']")
    public WebElement nameTitle;

    //Mobile Number title of counter page
    @FindBy(xpath = "//th[text()='Mobile Number']")
    public WebElement mobileNumberTitle;

    //City title of counter page
    @FindBy(xpath = "//th[text()='City']")
    public WebElement cityTitle;

    //Location title of counter page
    @FindBy(xpath = "//th[text()='Location']")
    public WebElement locationTitle;

    //Status title of counter page
    @FindBy(xpath = "//th[text()='Status']")
    public WebElement statusTitle;

    //Action title of counter page
    @FindBy(xpath = "//th[text()='Action']")
    public WebElement actionTitle;

    //Add New ButtonLink
    @FindBy(xpath = "//a[text()='Add New']")
    public WebElement addNewButtonLink;

    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement namesection;

    //Submit button
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement submitButton;

    //New counter information is added.
    public ManageUsersPage addedCounter() {
        addNewButtonLink.click();
        Faker faker = new Faker();
        actions.click(namesection)
                .sendKeys(faker.country().capital())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().cityName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().cityName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().subscriberNumber())
                .sendKeys(Keys.TAB)
                .perform();
        submitButton.click();
        return new ManageUsersPage();

    }


//===============================Report Button==============
    //Report button
    @FindBy(xpath = "//*[text()='Report ']")
    public WebElement reportButton;
    //Login History link
    @FindBy(xpath = "//*[text()='Login History']")
    public WebElement loginHistoryLink;

    //Email History link
    @FindBy(xpath = "//*[text()='Email History']")
    public WebElement emailHistoryLink;

    // User title of User Login History
    @FindBy(xpath = "//thead/tr/th[1]")
    public WebElement userTitle;

    // Login at title of User Login History
    @FindBy(xpath = "//thead/tr/th[2]")
    public WebElement loginAtTitle;

    // IP title of User Login History
    @FindBy(xpath = "//thead/tr/th[3]")
    public WebElement coloumnIp;

    //Location title of User Login History
    @FindBy(xpath = "//thead/tr/th[3]")
    public WebElement coloumnLocation;

    //Browser | OS title of User Login History
    @FindBy(xpath = "//thead/tr/th[3]")
    public WebElement coloumnBrowserOSTitle;

    //Send title of Email History
    @FindBy(xpath = "//thead/tr/th[2]")
    public WebElement coloumnSent;

    //Mail sender title of Email History
    @FindBy(xpath = "//thead/tr/th[3]")
    public WebElement coloumnMailSender;

    //Subject title of Email History
    @FindBy(xpath = "//thead/tr/th[4]")
    public WebElement coloumnSubject;

    //Action button of Email History
    @FindBy(xpath = "//tr[1]/td[5]/a")
    public WebElement coloumnActionButton;






    //Report button should be clicked
    @Step("Clicked Report und display Login History and Email History")
    public void clickToReport() {
        softAssert.assertTrue(reportButton.isDisplayed());
        waitAndClick(reportButton);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        softAssert.assertTrue(loginHistoryLink.isDisplayed());
        softAssert.assertTrue(emailHistoryLink.isDisplayed());
        softAssert.assertAll();

    }

    //Login History should be clicked
    @Step("Clicked Login History")
    public UserLoginHistoryPage clickLoginHistory() {


        waitAndClick(loginHistoryLink);

        String expectedUrl = "https://qa.easybusticket.com/admin/report/login/history";
        String actualUrl = Driver.get(env).getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        log.info("URL  verified");
        softAssert.assertTrue(userTitle.isDisplayed());
        log.info("User title  displayed");
        softAssert.assertTrue(loginAtTitle.isDisplayed());
        log.info("login At Title  displayed");
        softAssert.assertTrue(coloumnIp.isDisplayed());
        log.info("coloumnIp title  displayed");
        softAssert.assertTrue(coloumnLocation.isDisplayed());
        log.info("Location title  verified");
        softAssert.assertTrue(coloumnBrowserOSTitle.isDisplayed());
        log.info("BrowserOSTitle verified");
        softAssert.assertAll();
        waitAndClick(dashboardIconButton);
        return new UserLoginHistoryPage();


    }

    //Email History should be clicked
    @Step("Clicked Email History")
    public EmailHistoryPage clickEmailHistory() {
        waitAndClick(reportButton);
        waitAndClick(emailHistoryLink);
        String expectedUrl = "https://qa.easybusticket.com/admin/report/email/history";
        String actualUrl = Driver.get(env).getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        softAssert.assertTrue(userTitle.isDisplayed());
        softAssert.assertTrue(coloumnSent.isDisplayed());
        softAssert.assertTrue(coloumnMailSender.isDisplayed());
        softAssert.assertTrue(coloumnSubject.isDisplayed());
        softAssert.assertTrue(coloumnAction.isDisplayed());
        softAssert.assertAll();

        return new EmailHistoryPage();
    }
    //Action Button should be clicked und the page should open as "Email details" in another tab
    @Step("Clicked ActionButton and vieved Emails of details")
    public PaymentCompletedSuccessfully clickEmailHistoryActionButton() {

        waitAndClick(coloumnActionButton);
        driver.switchTo().newWindow(WindowType.TAB).get("https://qa.easybusticket.com/admin/users/email-details/911");
        String expectedUrl = "https://qa.easybusticket.com/admin/users/email-details/911";
        String actualUrl = Driver.get(env).getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        softAssert.assertAll();
       driver.navigate().back();
        return new PaymentCompletedSuccessfully();
    }


    @FindBy(xpath = "//*[@id=\"sidebar__menuWrapper\"]/ul/li[2]/a/span[1]")
    public WebElement manageUsersDropdown;
    @FindBy(xpath = "//*[@id=\"sidebar__menuWrapper\"]/ul/li[2]/div/ul/li[1]/a/span[1]")
    public WebElement allUsersDropdown;
    @FindBy(xpath = "//*[@id=\"sidebar__menuWrapper\"]/ul/li[2]/div/ul/li[2]/a/span[1]")
    public WebElement activeUsersDropdown;
    @FindBy(xpath = "//*[@id=\"sidebar__menuWrapper\"]/ul/li[2]/div/ul/li[3]/a/span[1]")
    public WebElement bannedUsersDropdown;
    @FindBy(xpath = "//*[@id=\"sidebar__menuWrapper\"]/ul/li[2]/div/ul/li[4]/a/span[1]")
    public WebElement emailUnverified;
    @FindBy(xpath = "//*[@id=\"sidebar__menuWrapper\"]/ul/li[2]/div/ul/li[5]/a/span[1]")
    public WebElement smsUnverified;
    @FindBy(xpath = "//*[@id=\"sidebar__menuWrapper\"]/ul/li[2]/div/ul/li[6]/a/span[1]")
    public WebElement emailToAll;


    public void openManageUsersDropdown() {
        WebElement manageUsersDropdown = driver.findElement(By.id("manageUsersDropdownId"));
        // Ensure the dropdown is visible or clickable before interacting
        // You can use WebDriverWait to wait for the element to be clickable
        manageUsersDropdown.click();
    }

    public void clickEmailUnverified() {
        WebElement manageUsersDropdown = driver.findElement(By.id("manageUsersDropdownId"));
        // Ensure the dropdown is visible or clickable before interacting
        // You can use WebDriverWait to wait for the element to be clickable
        manageUsersDropdown.click();
    }

    public void clickActiveUsersLink() {
        WebElement manageUsersDropdown = driver.findElement(By.id("manageUsersDropdownId"));
        // Ensure the dropdown is visible or clickable before interacting
        // You can use WebDriverWait to wait for the element to be clickable
        manageUsersDropdown.click();
    }

    public void clickBannedUsersLink() {
        WebElement manageUsersDropdown = driver.findElement(By.id("manageUsersDropdownId"));
        // Ensure the dropdown is visible or clickable before interacting
        // You can use WebDriverWait to wait for the element to be clickable
        manageUsersDropdown.click();
    }

    public void allUsers() {
        WebElement manageUsersDropdown = driver.findElement(By.id("manageUsersDropdownId"));
        // Ensure the dropdown is visible or clickable before interacting
        // You can use WebDriverWait to wait for the element to be clickable
        manageUsersDropdown.click();
    }

    public void clickSmsUnverified() {
        WebElement manageUsersDropdown = driver.findElement(By.id("manageUsersDropdownId"));
        // Ensure the dropdown is visible or clickable before interacting
        // You can use WebDriverWait to wait for the element to be clickable
        manageUsersDropdown.click();
    }

    public void clickEmailToAllLink() {
        WebElement manageUsersDropdown = driver.findElement(By.id("manageUsersDropdownId"));
        // Ensure the dropdown is visible or clickable before interacting
        // You can use WebDriverWait to wait for the element to be clickable
        manageUsersDropdown.click();
    }

    /**
     * REYHAN  for Admin Pending Ticket
     */
    public AdminTicketPage pendingTickets(){

        Wait<WebDriver> wait = new FluentWait<>(Driver.get("stage"))
                .withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofSeconds(5L))
                .ignoring(NoSuchElementException.class);
        WebElement pendingTicket = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement pendingTicket = Driver.get("stage").findElement(By.xpath("//*[text()='Pending Ticket']"));
                pendingTicket.click();
                return pendingTicket;
            }

        });
        return new AdminTicketPage();
}


}






