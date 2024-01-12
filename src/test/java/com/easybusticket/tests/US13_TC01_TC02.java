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
        UserDashboardPage userDashboardPage = new HomePage().clickToSignIn().login();

        userDashboardPage.dashboardButton.isDisplayed();
        userDashboardPage.dropDownBooking.isDisplayed();
        userDashboardPage.dropDownSupportRequest.isDisplayed();
        userDashboardPage.dropDownProfile.isDisplayed();
        userDashboardPage.labelTotalBookedTicket.isDisplayed();
        userDashboardPage.labelTotalRejectedTicket.isDisplayed();
        userDashboardPage.labelTotalPendingTicket.isDisplayed();
        userDashboardPage.numberOfTotalBookedTicket.isDisplayed();
        userDashboardPage.numberOfTotalRejectedTicket.isDisplayed();
        userDashboardPage.numberOfTotalPendingTicket.isDisplayed();
        userDashboardPage.labelPNRnumber.isDisplayed();
        userDashboardPage.labelAcNonAc.isDisplayed();
        userDashboardPage.labelStartingPoint.isDisplayed();
        userDashboardPage.labelDroppingPoint.isDisplayed();
        userDashboardPage.labelJourneyDate.isDisplayed();
        userDashboardPage.labelPickupTime.isDisplayed();
        userDashboardPage.labelBookedSeats.isDisplayed();
        userDashboardPage.labelStatus.isDisplayed();
        userDashboardPage.labelFare.isDisplayed();
        userDashboardPage.labelAction.isDisplayed();

        userDashboardPage.clickToBuyTicketsButton();
        log.info("bilet alma sayfasina yonlendirildi "+env);
    }

}
