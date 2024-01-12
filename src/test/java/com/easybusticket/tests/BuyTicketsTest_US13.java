package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserDashboard;
import org.testng.annotations.Test;

public class BuyTicketsTest_US13 extends BaseTest{

    //Click on the "Buy tickets" link on the Dashboard page.
    //The user is successfully directed to the ticket purchase screen.
    //The departure point is selected from the 'pickup point' menu on the reservation page.
    //Destination point is selected from the 'Dropping point' menu
    //Travel date is selected from the 'Date of journey' box
    //Vehicle has selected from the 'Vehicle type' menu.
    //Route has selected from the 'Routes' menu.
    //When press the 'Finds ticket' button, tickets suitable for filtering will be listed.
    @Test
    public void BuyTicketTest(){

        UserDashboard userDashboard = new HomePage().clickToSignIn().login();
        userDashboard.clickToBuyTicketsButton();

    }
}
