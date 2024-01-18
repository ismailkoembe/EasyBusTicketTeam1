package com.easybusticket.tests;

import com.easybusticket.pages.*;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
@Severity(SeverityLevel.NORMAL)
public class US25_PendingTicketRejectTestNegativ extends BaseTestAdmin {

    @Test
    public void pendingTicketApproveTestNegativ() {

        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in " + env);
        //log in as an administrator and locate the admin Dashboard.
        adminDashboardPage.clickToPendingPayment();
        log.info("clicked Pending Payment Page " + env);
        //PendingPayment enters
        PendingPaymentPage pendingPaymentPage = new PendingPaymentPage();
        log.info("Pending Payment entered " + env);
        pendingPaymentPage.clickToDetailButton();
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage();
        paymentDetailsPage.clickToApprovePendingTicket();
        ApprovePaymentPage approvePaymentPage = new ApprovePaymentPage();
        approvePaymentPage.titleCheckTest();


    }


    @Test
    public void pendingTicketRejectTestNegativ() {
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in " + env);
        //log in as an administrator and locate the admin Dashboard.
        adminDashboardPage.clickToPendingPayment();
        log.info("clicked Pending Payment Page " + env);
        //PendingPayment enters
        PendingPaymentPage pendingPaymentPage = new PendingPaymentPage();
        log.info("Pending Payment entered " + env);
        pendingPaymentPage.clickToDetailButton();
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage();
        paymentDetailsPage.clickToRejectPendingTicket();
        paymentDetailsPage.messageBoxRejectedTicket.sendKeys("Unfortunately, we are cancelling your ticket for non-payment.");
        paymentDetailsPage.clickToRejectPendingTicket();
        RejectTicketPage rejectTicketPage = new RejectTicketPage();
        rejectTicketPage.titleCheckTest();

    }


}
