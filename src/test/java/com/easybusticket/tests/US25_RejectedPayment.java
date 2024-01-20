package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.pages.RejectedPaymentPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class US25_RejectedPayment extends BaseTestAdmin {

    @Test(priority = 1)
    @Severity(SeverityLevel.TRIVIAL)
    @Description("Admin should be able to view Rejected Payment Page")
    public void rejectedPaymentTest() {
        //log in as an administrator and locate the admin Dashboard.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in " + env);
        //click on RejectedPaymentPage due to Payment History dropdown menu.
        adminDashboardPage.clickToRejectedPayment();
        log.info("clicked RejectedPaymentPage " + env);
        //RejectedPaymentPage enters
        RejectedPaymentPage rejectedPaymentPage = new RejectedPaymentPage();
        //verify that the Page ist the true Page.
        rejectedPaymentPage.titleRejectedPaymentPage();
        log.info("checked whether the Page true or not.");

    }

    @Test(priority = 3)
    @Severity(SeverityLevel.TRIVIAL)
    @Description("Admin should be able to search with Date and view the Ticket Information")
    public void getDateSearchNoTicket() {
        //The admin enters a time period in the past when no tickets were received.
        //log in as an administrator and locate the admin Dashboard.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in " + env);
        //log in as an administrator and locate the admin Dashboard.
        adminDashboardPage.clickToRejectedPayment();
        log.info("clicked RejectedPaymentPage" + env);
        //PendingPayment enters
        RejectedPaymentPage rejectedPaymentPage = new RejectedPaymentPage();
        log.info("RejectedPaymentPage entered " + env);
        //search
        rejectedPaymentPage.searchingTicketNoTicket();
        log.info("displayed whether a ticket is available or not.  " + env);
    }

    @Test(priority = 2)
    @Severity(SeverityLevel.TRIVIAL)
    @Description("Admin should be able to search with PNR number and view the Ticket Information")
    public void getPNRNumberSearchWithTicket() {
        //The admin enters a name or PR NUMBER
        //log in as an administrator and locate the admin Dashboard.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in " + env);
        //log in as an administrator and locate the admin Dashboard.
        adminDashboardPage.clickToPendingPayment();
        log.info("clicked RejectedPaymentPage" + env);
        //PendingPayment enters
        RejectedPaymentPage rejectedPaymentPage = new RejectedPaymentPage();
        log.info("RejectedPaymentPage entered " + env);
        //search
        rejectedPaymentPage.getPNRNumberSearchBoxWithTicket();
        log.info("displayed whether a ticket is available or not.  " + env);


    }
}
