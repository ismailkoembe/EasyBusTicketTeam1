package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.utilities.Driver;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
@Slf4j
public class US22_AdminDashboard extends BaseTestAdmin{
    @Test
    @Severity(value = SeverityLevel.CRITICAL)
    @Description("Admin Dashboard page viewed and verified and The details are displayed " +
            "with the View All button.\n" +
            "Latest Booking History page ,\n" +
            "Last 30 days Payment History page and the following graphs were displayed ")

    public void displayOfDashboardItems() {
        // Navigate to the login page
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();

        //Dashboard title should be displayed
        softAssert.assertTrue(adminDashboardPage.labelDashboard.isDisplayed());
        log.info("Dashboard item  displayed");

        //Total  Users item should be displayed
        softAssert.assertTrue(adminDashboardPage.labelTotalUsers.isDisplayed());
        log.info("Total  Users item  displayed");

        //Total Verified Users item should be displayed
        softAssert.assertTrue(adminDashboardPage.labelTotalVerifiedUsers.isDisplayed());
        log.info("Total Verified Users item  displayed");

        //Total Email Unverified Users item should be displayed
        softAssert.assertTrue(adminDashboardPage.labelTotalEmailUnverifiedUsers.isDisplayed());
        log.info("Total Email Unverified Users item  displayed");

        //Total SMS Unverified Users item should be displayed
        softAssert.assertTrue(adminDashboardPage.labelTotalSmSUnverifiedUsers.isDisplayed());
        log.info("Total SMS Unverified Users item  displayed");

        //Successful Payment item should be displayed
        softAssert.assertTrue(adminDashboardPage.labelSuccessfulPayment.isDisplayed());
        log.info("Successful Payment item  displayed");

        //Pending Payment item should be displayed
        softAssert.assertTrue(adminDashboardPage.labelpendingPayment.isDisplayed());
        log.info("Pending Payment item  displayed");

        //Rejected Payment item  should be displayed
        softAssert.assertTrue(adminDashboardPage.labelRejectedPayment.isDisplayed());
        log.info("Rejected Payment item   displayed");

        //AC Vehicle item should be displayed
        softAssert.assertTrue(adminDashboardPage.labelAcVehicle.isDisplayed());
        log.info("AC Vehicle item displayed");

        //Non-AC Vehicle item  should be displayed
        softAssert.assertTrue(adminDashboardPage.labelNonAcVehicle.isDisplayed());
        log.info("Non-AC Vehicle item displayed");

        //Total Counter item should be displayed
        softAssert.assertTrue(adminDashboardPage.labelTotalCounter.isDisplayed());
        log.info("Total Counter item  displayed");
        softAssert.assertAll();


        //Viewing TotalUsers card with view all button
        adminDashboardPage.clickViewAllTotalUsers();

        //Viewing TotalVerifiedUsers card with view all button
        adminDashboardPage.clickViewAllTotalVerifiedUsers();

        //Viewing EmailUnverifiedUsers card with view all button
        adminDashboardPage.clickViewAllEmailUnverifiedUsers();

        //Viewing TotalSMSUnverifiedUsers card with view all button
        adminDashboardPage.clickViewAllTotalSMSUnverifiedUsers();

        //Viewing SuccessfulPayment card with view all button
        adminDashboardPage.clickViewAllSuccessfulPayment();

        //Viewing PendingPayment card with view all button
        adminDashboardPage.clickViewAllPendingPayment();

        //Viewing Rejected Payment card with view all button
        adminDashboardPage.clickViewAllRejectedPayment();

        //Viewing AC Vehicles card with view all button
        adminDashboardPage.clickViewAllAcVehicles();

        //Viewing Non-AC Vehicles card with view all button
        adminDashboardPage.clickViewAllNonAcVehicles();
 
        //Viewing Total Counter card with view all button
        adminDashboardPage.clickViewAllTotalCounter();



        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) Driver.get(env);
        javascriptExecutor.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",adminDashboardPage.tableLatestBookingHistory);

        //Latest Booking History heading should be displayed
        softAssert.assertTrue(adminDashboardPage.labelLatestBookingHistory.isDisplayed());
        log.info("Latest Booking History' heading displayed");


        //Table of the Latest Booking History should be displayed
        softAssert.assertTrue(adminDashboardPage.tableLatestBookingHistory.isDisplayed());
        log.info("Table of the Latest Booking History displayed");

        //User title should be displayed
        softAssert.assertTrue(adminDashboardPage.coloumnUser.isDisplayed());
        log.info("User title  displayed ");

        //PNR title should be displayed
        softAssert.assertTrue(adminDashboardPage.coloumnPnrNummer.isDisplayed());
        log.info("PNR title  displayed ");

        //Ticket Count title should be displayed
        softAssert.assertTrue(adminDashboardPage.coloumnTicketCount.isDisplayed());
        log.info("Ticket Count title  displayed ");

        //Amount title should be displayed
        softAssert.assertTrue(adminDashboardPage.coloumnAmount.isDisplayed());
        log.info("Amount title  displayed ");

        //Action title should be displayed
         softAssert.assertTrue(adminDashboardPage.coloumnAction.isDisplayed());
         log.info("Action title  displayed ");


         //Action Button details  button should be display
         adminDashboardPage.clickActionButton();

        //Last 30 Days Payment History should be displayed
         softAssert.assertTrue(adminDashboardPage.labelLast30daysPaymentHistory.isDisplayed());
         log.info("Last 30 Days Payment History displayed");
         softAssert.assertAll();

         //Login By Browser title should be display
        softAssert.assertTrue(adminDashboardPage.labelLoginByBrowser.isDisplayed());
        log.info("Login By Browser title displayed");
        softAssert.assertAll();

        //Login By OS title should be display
        softAssert.assertTrue(adminDashboardPage.labelLoginByOs.isDisplayed());
        log.info("Login By OS title displayed");
        softAssert.assertAll();

        //Login By Country title should be display
        softAssert.assertTrue(adminDashboardPage.labelLoginByCountry.isDisplayed());
        log.info("Login By Country title  displayed");
        softAssert.assertAll();



    }
}
