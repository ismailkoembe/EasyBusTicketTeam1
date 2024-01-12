package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class PaymentHistoryAndOptionsViewerTest_US25 extends BaseTestAdmin {

    public void PaymentHistoryDropdownAndOptionsViewerTest() { //The admin should view the list of "Payment History" dropdown menü with its items on the admin dashboard.

        //logged in as an administrator and Locate the admin Dashboard.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in admin dashboards");

        //Verrify that the "Payment History" dropdown menu with items (Pending Payment, Successful Payments, Rejected Payment and All History) is  visible and enabled.
        softAssert.assertTrue(adminDashboardPage.paymentHistoryDropdownDashboard.isDisplayed());
        log.info("Payment History Dropdown menu is displayed.");
        adminDashboardPage.paymentHistoryDropdownDashboard.click();
        softAssert.assertTrue(adminDashboardPage.pendingPaymentOption.isDisplayed());
        log.info("Pending Payment Option is displayed.");
        softAssert.assertTrue(adminDashboardPage.successfulPaymentOption.isDisplayed());
        log.info("Successful Payment Option is displayed.");
        softAssert.assertTrue(adminDashboardPage.rejectedPaymentOption.isDisplayed());
        log.info("Rejected Payment Option is displayed.");
        softAssert.assertTrue(adminDashboardPage.allPaymentOption.isDisplayed());
        log.info("All Payment Option is displayed.");

        softAssert.assertAll();
    }
}
