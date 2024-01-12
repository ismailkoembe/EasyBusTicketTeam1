package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.pages.PendingPaymentPage;
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
        PendingPaymentPage pendingPaymentPage = new PendingPaymentPage();


    }
}


