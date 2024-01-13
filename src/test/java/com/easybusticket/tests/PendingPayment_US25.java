package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.pages.PendingPaymentPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class PendingPayment_US25 extends BaseTestAdmin {

    @Test
    public void pendingPaymentTest() {//Payment History dropdown menu and items should be viewed on the Dashboard sidebar.

        //log in as an administrator and locate the admin Dashboard.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        adminDashboardPage.clickToPendingPayment();
        PendingPaymentPage pendingPaymentPage = new PendingPaymentPage();
        pendingPaymentPage.titlePendingPaymentPage();


    }
}


