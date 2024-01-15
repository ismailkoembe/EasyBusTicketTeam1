package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.pages.PendingPaymentPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class PendingPaymentSearchTest_US25 {
    @Test
    public void getDateSearch() {

        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        adminDashboardPage.clickToPendingPayment();
        PendingPaymentPage pendingPaymentPage = new PendingPaymentPage();








    }
}
