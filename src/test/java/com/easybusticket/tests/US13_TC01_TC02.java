package com.easybusticket.tests;

import com.easybusticket.pages.*;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;
@Slf4j
public class US13_TC01_TC02 extends BaseTest{

    // The user is directed to the User Dashboard on the home page.
    // The reservation menu and the items below are displayed on the User Dashboard page.
    @Test
    public void BookingTest(){
        UserDashboard userDashboard = new HomePage().clickToSignIn().login();

        userDashboard.dashboardButton.isDisplayed();
        userDashboard.dropDownBooking.isDisplayed();
        userDashboard.dropDownSupportRequest.isDisplayed();
        userDashboard.dropDownProfile.isDisplayed();
        userDashboard.labelTotalBookedTicket.isDisplayed();
        userDashboard.labelTotalRejectedTicket.isDisplayed();
        userDashboard.labelTotalPendingTicket.isDisplayed();
        userDashboard.numberOfTotalBookedTicket.isDisplayed();
        userDashboard.numberOfTotalRejectedTicket.isDisplayed();
        userDashboard.numberOfTotalPendingTicket.isDisplayed();
        userDashboard.labelPNRnumber.isDisplayed();
        userDashboard.labelAcNonAc.isDisplayed();
        userDashboard.labelStartingPoint.isDisplayed();
        userDashboard.labelDroppingPoint.isDisplayed();
        userDashboard.labelJourneyDate.isDisplayed();
        userDashboard.labelPickupTime.isDisplayed();
        userDashboard.labelBookedSeats.isDisplayed();
        userDashboard.labelStatus.isDisplayed();
        userDashboard.labelFare.isDisplayed();
        userDashboard.labelAction.isDisplayed();

        userDashboard.clickToBuyTicketsButton();
        log.info("bilet alma sayfasina yonlendirildi "+env);
    }

}
