package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.pages.SuccessfulPaymentPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class US25_SuccessfulPayment extends BaseTestAdmin {

    @Test(priority = 1)
    @Severity(SeverityLevel.TRIVIAL)
    @Description("Admin should be view Successfull Payment Page")
    public void successfulPaymentTest() {
        //log in as an administrator and locate the admin Dashboard.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in " + env);
        //click on the SuccessfulPaymentPage due to Payment History dropdown menu.
        adminDashboardPage.clickToSuccessfulPayment();
        log.info("clicked SuccessfulPaymentPage " + env);
        //SuccessfulPaymentPage enters
        SuccessfulPaymentPage successfulPaymentPage = new SuccessfulPaymentPage();
        //verify that the Page ist the true Page.
        successfulPaymentPage.titleSuccessfulPaymentPage();
        log.info("checked whether the Page true or not.");
    }

    @Test(priority = 2)
    @Severity(SeverityLevel.TRIVIAL)
    @Description("Admin should be able to search successfull payment tickets with entering the date")
    public void withPNRNumberOrUserNameTicketSearch() {
        //The admin enters a name or PR NUMBER
        //log in as an administrator and locate the admin Dashboard.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in " + env);
        //log in as an administrator and locate the admin Dashboard.
        adminDashboardPage.clickToSuccessfulPayment();
        log.info("clicked SuccessfulPaymentPage " + env);
        //PendingPayment enters
        SuccessfulPaymentPage successfulPaymentPage = new SuccessfulPaymentPage();
        log.info("SuccessfulPaymentPage entered " + env);
        //search
        successfulPaymentPage.getPNRNumberSearchBoxWithTicket();
        log.info("displayed whether a ticket is available or not.  " + env);

    }


    @Test(priority = 3)
    @Severity(SeverityLevel.TRIVIAL)
    @Description("Admin should be able to search successfull payment tickets with entering the PnrNumber/Name")
    public void withDateSearchTicketSearch() {
        //The admin enters a name or PR NUMBER
        //log in as an administrator and locate the admin Dashboard.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in " + env);
        //log in as an administrator and locate the admin Dashboard.
        adminDashboardPage.clickToSuccessfulPayment();
        log.info("clicked SuccessfulPaymentPage " + env);
        //PendingPayment enters
        SuccessfulPaymentPage successfulPaymentPage = new SuccessfulPaymentPage();
        log.info("SuccessfulPaymentPage entered " + env);
        //search
        successfulPaymentPage.getDateSearchBoxWithTicket();
        log.info("displayed whether a ticket is available or not.  " + env);


    }

}