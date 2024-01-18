package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminManageTripsPage extends BasePage {

    public AdminManageTripsPage(){
        PageFactory.initElements(Driver.get("stage"),this);
    }

    // xpath s of the required fields for the test scenario
    //Username box for Admin
    @FindBy(xpath = "/html/body/div/div/div/form/div[1]/input")

    public WebElement adminUsernameBox;

    //Password box for Admin
    @FindBy(xpath = "/html/body/div/div/div/form/div[2]/input")
    public WebElement adminPasswordBox;

    //Login Button for Admin
    @FindBy(xpath = "/html/body/div/div/div/form/div[4]/button")
    public WebElement buttonAdminLogin;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/ul/li[11]/a/span")
    public WebElement manageTripsButton;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/ul/li[11]")
    public WebElement manageTripsMenu;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/ul/li[11]/div/ul/li[1]/a")
    public WebElement routeButton;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/ul/li[11]/div/ul/li[2]/a")
    public WebElement scheduleButton;

    @FindBy(xpath = "//*[@id=\"sidebar__menuWrapper\"]/ul/li[11]/div/ul/li[3]/a")
    public WebElement ticketPriceButton;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/ul/li[11]/div/ul/li[4]/a")
    public WebElement tripButton;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/ul/li[11]/div/ul/li[5]/a")
    public WebElement assignedVehicleButton;

    // Step 2 - XPath s
    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div/div[1]/div")
    public WebElement routesTable;
    @FindBy(xpath = "/html/body/div/div[2]/div/div[1]/div[2]/a")
    public WebElement addNewRoute;
    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div/div/form/div[1]/div[1]/div/input")
    public WebElement routeName;
    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div/div/form/div[1]/div[5]/div[1]/input")
    public WebElement routeTime;
    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div/div/form/div[1]/div[5]/div[2]/input")
    public WebElement routeDistance;
    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div/div/form/div[1]/div[2]/div[1]/select")
    public WebElement selectStartFrom;
    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div/div/form/div[1]/div[3]/div/select")
    public WebElement selectEndTo;
    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div/div/form/div[2]/div/div/button")
    public WebElement saveRoute;
    @FindBy(xpath = "/html/body/div/div[2]/div/div[1]/div[2]/a")
    public WebElement goBackButton;
    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div/div[1]/div/table/tbody/tr[1]/td[1]")
    public WebElement firstRowName;
    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div/div[1]/div/table/tbody/tr[1]/td[7]/a")
    public WebElement editRouteButton;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div/table/tbody/tr[1]/td[7]/button")
    public WebElement disableRouteActionButton;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[4]/div/div/form/div[2]/button[2]")
    public WebElement disableRouteButton;

    // Step 1 - Test login Admin Page and test if  Manage Trip menu options are visible/displayed
    public void adminLogin() {
        // Test login Admin Page
        waitAndClick(adminUsernameBox);
        adminUsernameBox.sendKeys("admin07");
        adminPasswordBox.sendKeys("123123123");
        waitAndClick(buttonAdminLogin);


        String expectedText = "Admin Login to Easy Bus Ticket dashboard";
        String actualText = Driver.get(env).getTitle();
        softAssert.assertEquals(actualText, expectedText);

        // Test Manage Trip Options are visible
        waitAndClick(manageTripsButton);
        boolean areOptionsDisplayed = manageTripsMenu.isDisplayed();
        boolean isRouteDisplayed = routeButton.isDisplayed();
        boolean isScheduleDisplayed = scheduleButton.isDisplayed();
        boolean isTicketPriceDisplayed = ticketPriceButton.isDisplayed();
        boolean isTripDisplayed = tripButton.isDisplayed();
        boolean isAssignedVehicleDisplayed = assignedVehicleButton.isDisplayed();

        softAssert.assertTrue(areOptionsDisplayed, "Menu options container is not displayed");
        softAssert.assertTrue(isRouteDisplayed, "Route Button is not displayed");
        softAssert.assertTrue(isScheduleDisplayed, "Schedule Button is not displayed");
        softAssert.assertTrue(isTicketPriceDisplayed, "Ticket Price is not displayed");
        softAssert.assertTrue(isTripDisplayed, "Trip Button is not displayed");
        softAssert.assertTrue(isAssignedVehicleDisplayed, "Assigned Vehicle is not displayed");
    }

    // Step 2 - Route Page and Route Config
    public void routeConfig() {
        waitAndClick(routeButton);

        // Check All Routes are displayed
        softAssert.assertTrue(routesTable.isDisplayed(), "Routes table is not displayed!");

        // Add new Route
        waitAndClick(addNewRoute);

        Select selectStart = new Select(selectStartFrom);
        Select selectEnd = new Select(selectEndTo);

        selectStart.selectByVisibleText("Austin");
        selectEnd.selectByVisibleText("nevfel");

        String newRouteName = faker.name().username().concat("tripGLC");

        actions.sendKeys(routeName, newRouteName)
                .sendKeys(routeTime, "11")
                .sendKeys(routeDistance, "111")
                .perform();

        waitAndClick(saveRoute);

        waitAndClick(goBackButton);

        // Checks if the last created item's (first row) name is equals to our fake route name
        String firstRowItem = firstRowName.getText();
        softAssert.assertEquals(firstRowItem, newRouteName);

        waitAndClick(editRouteButton);

        waitAndClick(goBackButton);

        waitAndClick(disableRouteActionButton);

        waitAndClick(disableRouteButton);

    }



}
