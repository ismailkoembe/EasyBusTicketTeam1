package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class PaymentHistoryAndOptionsViewerTest_US25 extends BaseTestAdmin{


    @Test
    public void PaymentHistoryDropdownAndOptionsViewerTest() {
    //The admin should view the list of "Payment History" dropdown menü with its items on the admin dashboard.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in admin dashboards");

        adminDashboardPage.paymentHistoryDashboard.click();







    }
}
