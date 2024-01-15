package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.pages.PaymentHistory;
import com.easybusticket.pages.PendingPaymentPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class PendingPayment_US25 extends BaseTestAdmin {

    @Test(priority = 1)
    public void pendingPaymentTest() {//Payment History dropdown menu and items should be viewed on the Dashboard sidebar.

        //log in as an administrator and locate the admin Dashboard.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        //click on the Pending Payment due to Payment History dropdown menu.
        adminDashboardPage.clickToPendingPayment();
        //PendingPayment enters
        PendingPaymentPage pendingPaymentPage =new PendingPaymentPage();
        //verify that the Page ist the true Page.
        pendingPaymentPage.titlePendingPaymentPage();

    }

    @Test(priority = 2)
    public void getDateSearchNoTicket() {
        //The admin enters a time period in the past when no tickets were received.
        //log in as an administrator and locate the admin Dashboard.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in " + env);
        //log in as an administrator and locate the admin Dashboard.
        adminDashboardPage.clickToPendingPayment();
        log.info("clicked Pending Payment Page " + env);
        //PendingPayment enters
        PendingPaymentPage pendingPaymentPage =new PendingPaymentPage();
        log.info("Pending Payment entered " + env);
        //search
        pendingPaymentPage.searchingTicketNoTicket();
        log.info("displayed whether a ticket is available or not.  " + env);
    }
    @Test(dependsOnMethods = "getPNRNumberSearchWithTicket")
    public void pendingPaymentNoTicketTest() {
        //!!!There must be no Ticket in this Test Scenario
        //log in as an administrator and locate the admin Dashboard.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in " + env);
        //log in as an administrator and locate the admin Dashboard.
        adminDashboardPage.clickToPendingPayment();
        log.info("clicked Pending Payment Page " + env);
        //PendingPayment enters
        PendingPaymentPage pendingPaymentPage =new PendingPaymentPage();
        log.info("Pending Payment entered " + env);
        //verify the Text on the Table that "There is no pending payment" is written.
        String actualResultTest = pendingPaymentPage.dataTableNoTicket.getText();
        softAssert.assertEquals(actualResultTest, "There is no pending payment");
        log.info("displayed whether a ticket is  not.  " + env);

        softAssert.assertAll();

    }
    @Test(priority = 3)
    public void getPNRNumberSearchWithTicket() {
        //The admin enters a name or PR NUMBER
        //log in as an administrator and locate the admin Dashboard.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in " + env);
        //log in as an administrator and locate the admin Dashboard.
        adminDashboardPage.clickToPendingPayment();
        log.info("clicked Pending Payment Page " + env);
        //PendingPayment enters
        PendingPaymentPage pendingPaymentPage =new PendingPaymentPage();
        log.info("Pending Payment entered " + env);
        //search
        pendingPaymentPage.getPNRNumberSearchBoxWithTicket();
        log.info("displayed whether a ticket is available or not.  " + env);


    }


}


