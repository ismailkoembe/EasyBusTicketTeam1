package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;
@Slf4j
public class AdminDashboard_US22 extends BaseTestAdmin{
    @Test
    public void displayOfDashboardItems(){
        // Navigate to the login page
        AdminDashboardPage adminDashboardPage=new AdminPage().adminLogin();

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
        softAssert.assertTrue( adminDashboardPage.labelpendingPayment.isDisplayed());
        log.info("Pending Payment item  displayed");

        //Rejected Payment item  should be displayed
        softAssert.assertTrue(adminDashboardPage.labelRejectedPayment.isDisplayed());
        log.info("Rejected Payment item   displayed");

        //AC Vehicle item should be displayed
        softAssert.assertTrue(  adminDashboardPage.labelAcVehicle.isDisplayed());
        log.info("AC Vehicle item displayed");

        //Non-AC Vehicle item  should be displayed
        softAssert.assertTrue( adminDashboardPage.labelNonAcVehicle.isDisplayed());
        log.info("Non-AC Vehicle item displayed");

        //Total Counter item should be displayed
        softAssert.assertTrue( adminDashboardPage.labelTotalCounter.isDisplayed());
        log.info("Total Counter item  displayed");
        softAssert.assertAll();




    }
}
