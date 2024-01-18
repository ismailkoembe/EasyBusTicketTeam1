package com.easybusticket.tests;

import com.easybusticket.pages.*;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;
@Slf4j
public class US13_BookingTest extends BaseTest{

    // The user is directed to the User Dashboard on the home page.
    // The reservation menu and the items below are displayed on the User Dashboard page.
    @Test
    @Severity(value = SeverityLevel.CRITICAL)
    @Description("The user directed to Buy Ticket Page")

    public void BookingTest(){
        UserDashboardPage userDashboardPage = new HomePage().clickToSignIn().login();

        softAssert.assertTrue(userDashboardPage.dashboardButton.isDisplayed());
        softAssert.assertTrue(userDashboardPage.dropDownBooking.isDisplayed());
        softAssert.assertTrue(userDashboardPage.dropDownSupportRequest.isDisplayed());
        softAssert.assertTrue(userDashboardPage.dropDownProfile.isDisplayed());
        softAssert.assertTrue(userDashboardPage.labelTotalBookedTicket.isDisplayed());
        softAssert.assertTrue(userDashboardPage.labelTotalRejectedTicket.isDisplayed());
        softAssert.assertTrue(userDashboardPage.labelTotalPendingTicket.isDisplayed());
        softAssert.assertTrue(userDashboardPage.numberOfTotalBookedTicket.isDisplayed());
        softAssert.assertTrue(userDashboardPage.numberOfTotalRejectedTicket.isDisplayed());
        softAssert.assertTrue(userDashboardPage.numberOfTotalPendingTicket.isDisplayed());
        softAssert.assertTrue(userDashboardPage.labelPNRnumber.isDisplayed());
        softAssert.assertTrue(userDashboardPage.labelAcNonAc.isDisplayed());
        softAssert.assertTrue(userDashboardPage.labelStartingPoint.isDisplayed());
        softAssert.assertTrue(userDashboardPage.labelDroppingPoint.isDisplayed());
        softAssert.assertTrue(userDashboardPage.labelJourneyDate.isDisplayed());
        softAssert.assertTrue(userDashboardPage.labelPickupTime.isDisplayed());
        softAssert.assertTrue(userDashboardPage.labelBookedSeats.isDisplayed());
        softAssert.assertTrue(userDashboardPage.labelStatus.isDisplayed());
        softAssert.assertTrue(userDashboardPage.labelFare.isDisplayed());
        softAssert.assertTrue(userDashboardPage.labelAction.isDisplayed());
        softAssert.assertAll();

        userDashboardPage.clickToBuyTicketsButton();
        log.info("The user directed to Buy Ticket Page ");
    }

}
