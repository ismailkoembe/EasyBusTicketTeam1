package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.pages.AllPaymentPage;
import com.easybusticket.pages.PendingPaymentPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class AllPayment_US25 extends BaseTestAdmin{

    @Test
    public void allPaymentPageTest() {
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        adminDashboardPage.clickToAllPayment();
        AllPaymentPage allPaymentPage =new AllPaymentPage();
        allPaymentPage.titleAllPaymentPage();

    }
}
