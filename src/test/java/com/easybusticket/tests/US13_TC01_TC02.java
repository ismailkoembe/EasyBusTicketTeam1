package com.easybusticket.tests;

import com.easybusticket.pages.*;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;
@Slf4j
public class US13_TC01_TC02 extends BaseTest{

    // The user is directed to the User Dashboard on the home page.

    @Test
    public void BookingTest(){
        UserDashboard userDashboard = new HomePage().clickToSignIn().login();

        userDashboard.dashboardButton.isDisplayed();
        new UserDashboard().dropDownBooking.isDisplayed();
        new UserDashboard().dropDownSupportRequest.isDisplayed();
        new UserDashboard().dropDownProfile.isDisplayed();
        new UserDashboard().labelTotalBookedTicket.isDisplayed();
        new UserDashboard().labelTotalRejectedTicket.isDisplayed();
        new UserDashboard().labelTotalPendingTicket.isDisplayed();
        new UserDashboard().numberOfTotalBookedTicket.isDisplayed();
        new UserDashboard().numberOfTotalRejectedTicket.isDisplayed();
        new UserDashboard().numberOfTotalPendingTicket.isDisplayed();
        new UserDashboard().labelPNRnumber.isDisplayed();
        new UserDashboard().labelAcNonAc.isDisplayed();
        new UserDashboard().labelStartingPoint.isDisplayed();
        new UserDashboard().labelDroppingPoint.isDisplayed();
        new UserDashboard().labelJourneyDate.isDisplayed();
        new UserDashboard().labelPickupTime.isDisplayed();
        new UserDashboard().labelBookedSeats.isDisplayed();
        new UserDashboard().labelStatus.isDisplayed();
        new UserDashboard().labelFare.isDisplayed();
        new UserDashboard().labelAction.isDisplayed();

        userDashboard.clickToBuyTicketsButton();
        log.info("bilet alma sayfasina yonlendirildi "+env);
    }

    // The reservation menu and the items below are displayed on the User Dashboard page.


}
