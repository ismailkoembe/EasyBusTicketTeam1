package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.pages.AllPaymentPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class US25_AllPayment extends BaseTestAdmin{

    @Test(priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Admin should be able to view All Pagement Page from the entering Dashboard.")
    public void allPaymentPageTest() {
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in " + env);
        adminDashboardPage.clickToAllPayment();
        log.info("clicked All Payment Page " + env);
        AllPaymentPage allPaymentPage =new AllPaymentPage();
        allPaymentPage.titleCheckAllPaymentPage();
        log.info("checked whether the Page true or not.");

    }
    @Test(priority = 3)
    @Severity(SeverityLevel.TRIVIAL)
    @Description("Admin enters a time period in the past when no tickets were received.")
    public void getDateSearchNoTicket() {
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

    @Test(priority = 2)
    @Severity(SeverityLevel.NORMAL)
    @Description("Admin should be able to view the Ticket Information after searching by PNR number.")
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
