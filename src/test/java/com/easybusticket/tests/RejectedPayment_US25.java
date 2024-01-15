package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.pages.PaymentHistory;
import com.easybusticket.pages.RejectedPaymentPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class RejectedPayment_US25 extends BaseTestAdmin{

    @Test(priority = 1)
    public void rejectedPaymentTest() {

        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        adminDashboardPage.clickToRejectedPayment();
        RejectedPaymentPage rejectedPaymentPage =new RejectedPaymentPage();
        rejectedPaymentPage.titleRejectedPaymentPage();


    }
    @Test(priority = 2)
    public void getDateSearchNoTicket() {
        //The admin enters a time period in the past when no tickets were received.
        //log in as an administrator and locate the admin Dashboard.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in " + env);
        //log in as an administrator and locate the admin Dashboard.
        adminDashboardPage.clickToRejectedPayment();
        log.info("clicked RejectedPaymentPage" + env);
        //PendingPayment enters
        RejectedPaymentPage rejectedPaymentPage =new RejectedPaymentPage();
        log.info("RejectedPaymentPage entered " + env);
        //search
        rejectedPaymentPage.searchingTicketNoTicket();
        log.info("displayed whether a ticket is available or not.  " + env);
    }
    @Test(dependsOnMethods = "getPNRNumberSearchWithTicket")
    public void rejectedPaymentNoTicketTest() {
        //!!!There must be no Ticket in this Test Scenario
        //log in as an administrator and locate the admin Dashboard.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in " + env);
        //log in as an administrator and locate the admin Dashboard.
        adminDashboardPage.clickToPendingPayment();
        log.info("clicked RejectedPaymentPage " + env);
        //PendingPayment enters
        RejectedPaymentPage rejectedPaymentPage =new RejectedPaymentPage();
        log.info("RejectedPaymentPage entered " + env);
        //verify the Text on the Table that "There is no pending payment" is written.
        String actualResultTest = rejectedPaymentPage.dataTableNoTicket.getText();
        softAssert.assertEquals(actualResultTest, "There is no RejectedPaymentPage");
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
        log.info("clicked RejectedPaymentPage" + env);
        //PendingPayment enters
        RejectedPaymentPage rejectedPaymentPage =new RejectedPaymentPage();
        log.info("RejectedPaymentPage entered " + env);
        //search
        rejectedPaymentPage.getPNRNumberSearchBoxWithTicket();
        log.info("displayed whether a ticket is available or not.  " + env);


    }
}
