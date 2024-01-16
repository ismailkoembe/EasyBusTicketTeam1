package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.pages.AllPaymentPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class AllPayment_US25 extends BaseTestAdmin{

    @Test(priority = 1)
    public void allPaymentPageTest() {
        //Admin should be able to view All Pagement Page from the entering Dashboard.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in " + env);
        adminDashboardPage.clickToAllPayment();
        log.info("clicked All Payment Page " + env);
        AllPaymentPage allPaymentPage =new AllPaymentPage();
        allPaymentPage.titleCheckAllPaymentPage();
        log.info("checked whether the Page true or not.");

    }
    @Test(priority = 2)
    public void getDateSearchNoTicket() {
        //The admin enters a time period in the past when no tickets were received.
        //log in as an administrator and locate the admin Dashboard.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in " + env);
        //log in as an administrator and locate the admin Dashboard.
        adminDashboardPage.clickToAllPayment();
        log.info("clicked All Payment Page " + env);
        //PendingPayment enters
        AllPaymentPage allPaymentPage =new AllPaymentPage();
        log.info("All Payment entered " + env);
        //search
        allPaymentPage.searchingTicketNoTicket();
        log.info("displayed whether a ticket is available or not.  " + env);
    }
    @Test(dependsOnMethods = "getPNRNumberSearchWithTicket")
    public void allPaymentNoTicketTest() {
        //!!!There must be no Ticket in this Test Scenario
        //log in as an administrator and locate the admin Dashboard.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in " + env);
        //log in as an administrator and locate the admin Dashboard.
        adminDashboardPage.clickToAllPayment();
        log.info("clicked All Payment Page " + env);
        //PendingPayment enters
        AllPaymentPage allPaymentPage =new AllPaymentPage();
        log.info("All Payment entered " + env);
        //verify the Text on the Table that "There is no pending payment" is written.
        String actualResultTest = allPaymentPage.dataTableNoTicket.getText();
        softAssert.assertEquals(actualResultTest, "There is no ticket");
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
        adminDashboardPage.clickToAllPayment();
        log.info("clicked All Payment Page " + env);
        //PendingPayment enters
        AllPaymentPage allPaymentPage =new AllPaymentPage();
        log.info("All Payment entered " + env);
        //search
        allPaymentPage.getPNRNumberSearchBoxWithTicket();
        log.info("displayed whether a ticket is available or not.  " + env);


    }
}
