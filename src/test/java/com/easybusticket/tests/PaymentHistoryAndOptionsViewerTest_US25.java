package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

@Slf4j
public class PaymentHistoryAndOptionsViewerTest_US25 extends BaseTestAdmin {

    @Test
    public void paymentHistoryAndOptionsViewerTest() {//Payment History dropdown menu and items should be viewed on the Dashboard sidebar.

        //log in as an administrator and locate the admin Dashboard.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in admin dashboards");

        //Verrify that the "Payment History" dropdown menu with items (Pending Payment, Successful Payments, Rejected Payment and All History) is  visible.

        softAssert.assertTrue(adminDashboardPage.paymentHistoryDropdownDashboard.isDisplayed());
        log.info("Payment History Dropdown menu is displayed.");
        adminDashboardPage.paymentHistoryDropdownDashboard.click();

        Select dropdown = new Select(adminDashboardPage.paymentHistoryDropdownDashboard);

        softAssert.assertTrue(adminDashboardPage.isOptionPresent(dropdown, "Pending Payment"));
        softAssert.assertTrue(adminDashboardPage.isOptionPresent(dropdown, "Successful Payment"));
        softAssert.assertTrue(adminDashboardPage.isOptionPresent(dropdown, "Rejected Payment"));
        softAssert.assertTrue(adminDashboardPage.isOptionPresent(dropdown, "All Payment"));

        softAssert.assertAll();
    }
}


