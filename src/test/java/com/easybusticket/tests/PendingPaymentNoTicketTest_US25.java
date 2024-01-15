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
        //log in as an administrator and locate the admin Dashboard.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in " + env);
        //log in as an administrator and locate the admin Dashboard.
        adminDashboardPage.clickToPendingPayment();
        log.info("clicked Pending Payment Page " + env);
        //PendingPayment enters
        PendingPaymentPage pendingPaymentPage = new PendingPaymentPage();
        log.info("Pending Payment entered " + env);
        //verify the Text on the Table that "There is no pending payment" is written.
        String actualResultTest = pendingPaymentPage.dataTableNoTicket.getText();
        softAssert.assertEquals(actualResultTest, "There is no pending payment");
        log.info("displayed whether a ticket is  not.  " + env);
        softAssert.assertAll();


    }
}
