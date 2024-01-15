package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.pages.PaymentHistory;
import com.easybusticket.pages.SuccessfulPaymentPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class SuccessfulPayment_US25 extends BaseTestAdmin{

    @Test(priority = 1)
    public void successfulPaymentTest() {

        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        adminDashboardPage.clickToSuccessfulPayment();
        SuccessfulPaymentPage successfulPaymentPage =new SuccessfulPaymentPage();
        successfulPaymentPage.titleSuccessfulPaymentPage();
    }
    @Test(priority = 2)
    public void getDateSearchNoTicket() {
        //The admin enters a time period in the past when no tickets were received.
        //log in as an administrator and locate the admin Dashboard.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in " + env);
        //log in as an administrator and locate the admin Dashboard.
        adminDashboardPage.clickToSuccessfulPayment();
        log.info("clicked PSuccessfulPaymentPage " + env);
        //SuccessfulPaymentPage enters
        SuccessfulPaymentPage successfulPaymentPage =new SuccessfulPaymentPage();
        log.info("SuccessfulPaymentPage entered " + env);
        //search
        successfulPaymentPage.searchingTicketNoTicket();
        log.info("displayed whether a ticket is available or not.  " + env);
    }
    @Test(dependsOnMethods = "getPNRNumberSearchWithTicket")
    public void successfullPaymentNoTicketTest() {
        //!!!There must be no Ticket in this Test Scenario
        //log in as an administrator and locate the admin Dashboard.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in " + env);
        //log in as an administrator and locate the admin Dashboard.
        adminDashboardPage.clickToSuccessfulPayment();
        log.info("clicked SuccessfulPaymentPage" + env);
        //SuccessfulPaymentPage enters
        SuccessfulPaymentPage successfulPaymentPage =new SuccessfulPaymentPage();
        log.info("SuccessfulPaymentPage entered " + env);
        //verify the Text on the Table that "There is no pending payment" is written.
        String actualResultTest = successfulPaymentPage.dataTableNoTicket.getText();
        softAssert.assertEquals(actualResultTest, "There is no Ticket");
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
        adminDashboardPage.clickToSuccessfulPayment();;
        log.info("clicked SuccessfulPaymentPage " + env);
        //PendingPayment enters
        SuccessfulPaymentPage successfulPaymentPage =new SuccessfulPaymentPage();
        log.info("SuccessfulPaymentPage entered " + env);
        //search
        successfulPaymentPage.getPNRNumberSearchBoxWithTicket();
        log.info("displayed whether a ticket is available or not.  " + env);


    }
}
