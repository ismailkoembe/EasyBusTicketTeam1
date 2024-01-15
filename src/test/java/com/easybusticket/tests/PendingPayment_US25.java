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
        //click on the Pending Payment due to Payment History dropdown menu.
        adminDashboardPage.clickToPendingPayment();
        //PendingPayment enters
        PendingPaymentPage pendingPaymentPage = new PendingPaymentPage();
        //verify that the Page ist the true Page.
        pendingPaymentPage.titlePendingPaymentPage();


    }
}


