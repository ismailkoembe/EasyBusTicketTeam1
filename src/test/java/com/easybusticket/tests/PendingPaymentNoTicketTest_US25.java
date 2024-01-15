package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.pages.PendingPaymentPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class PendingPaymentNoTicketTest_US25 extends BaseTestAdmin {

    @Test
    public void pendingPaymentNoTicketTest() {

        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        adminDashboardPage.clickToPendingPayment();
        PendingPaymentPage pendingPaymentPage = new PendingPaymentPage();
        String actualResultTest = pendingPaymentPage.getTablePendingPaymentNoTicket.getText();
        softAssert.assertEquals(actualResultTest, "There is no pending payment");

        softAssert.assertAll();


    }
}
