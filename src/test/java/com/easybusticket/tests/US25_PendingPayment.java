package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.pages.PendingPaymentPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class US25_PendingPayment extends BaseTestAdmin {

    @Test(priority = 1)
    @Severity(SeverityLevel.BLOCKER)
    @Description("Admin should be view the pending Tickets")
    public void pendingPaymentTest() {//Payment History dropdown menu and items should be viewed on the Dashboard sidebar.

        //log in as an administrator and locate the admin Dashboard.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in " + env);
        //click on the Pending Payment due to Payment History dropdown menu.
        adminDashboardPage.clickToPendingPayment();
        log.info("clicked Pending Payment Page " + env);
        //PendingPayment enters
        PendingPaymentPage pendingPaymentPage = new PendingPaymentPage();
        //verify that the Page ist the true Page.
        pendingPaymentPage.titlePendingPaymentPage();
        log.info("checked whether the Page true or not.");

    }

    @Test(priority = 3)
    @Severity(SeverityLevel.TRIVIAL)
    @Description("The admin viewed no tickets text on the table when er enters a time period with no Ticket in the past")
    public void searchingTicketByDate() {
        //The admin enters a time period in the past when no tickets were received.
        //log in as an administrator and locate the admin Dashboard.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in " + env);
        //log in as an administrator and locate the admin Dashboard.
        adminDashboardPage.clickToPendingPayment();
        log.info("clicked Pending Payment Page " + env);
        //PendingPayment enters
        PendingPaymentPage pendingPaymentPage = new PendingPaymentPage();
        log.info("Pending Payment entered " + env);
        //search
        pendingPaymentPage.searchingTicketNoTicket();
        log.info("displayed whether a ticket is available or not.  " + env);
    }


    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    public void getPNRNumberSearchWithTicket() {
        //The admin enters a name or PR NUMBER
        //log in as an administrator and locate the admin Dashboard.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in " + env);
        //log in as an administrator and locate the admin Dashboard.
        adminDashboardPage.clickToPendingPayment();
        log.info("clicked Pending Payment Page " + env);
        //PendingPayment enters
        PendingPaymentPage pendingPaymentPage = new PendingPaymentPage();
        log.info("Pending Payment entered " + env);
        //search
        pendingPaymentPage.getPNRNumberSearchBoxWithTicket();
        log.info("displayed whether a ticket is available or not.  " + env);


    }


}


