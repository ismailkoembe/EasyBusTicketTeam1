package com.easybusticket.tests;

import com.easybusticket.pages.BuyTicketsPage;
import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserDashboardPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static com.easybusticket.pages.BasePage.driver;

public class BuyTicketsTest_US13 extends BaseTest{

    //Click on the "Buy tickets" link on the Dashboard page.
    //The user is successfully directed to the ticket purchase screen.
    //The departure point is selected from the 'pickup point' menu on the reservation page.
    //Destination point is selected from the 'Dropping point' menu
    //Travel date is selected from the 'Date of journey' box
    //When press the 'Finds ticket' button, tickets suitable for filtering will be listed.
    @Test
    public void BuyTicketTest() throws InterruptedException {

        UserDashboardPage userDashboardPage = new HomePage().clickToSignIn().login();
        BuyTicketsPage buyTicketsPage = userDashboardPage.clickToBuyTicketsButton();
        buyTicketsPage.fillTheFindTicketsForm();

    }
}
