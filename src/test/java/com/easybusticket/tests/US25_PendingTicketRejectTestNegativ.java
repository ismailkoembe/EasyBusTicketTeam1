package com.easybusticket.tests;

import com.easybusticket.pages.*;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
@Severity(SeverityLevel.NORMAL)
public class US25_PendingTicketRejectTestNegativ extends BaseTestAdmin {

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("The Admin should be able to the panding ticket approved.")
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
        log.info("Detail Button clicked and Payment Detail Ticket viewed. " + env);
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage();
        paymentDetailsPage.clickToApprovePendingTicket();
        log.info("The pendling ticket is approved.");
        ApprovePaymentPage approvePaymentPage = new ApprovePaymentPage();
        approvePaymentPage.titleCheckTest();
        log.info("The loaded page is checked.");

    }


    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("The Admin should be able to the Pending Ticket rejected.")
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
        log.info("Detail Button clicked and Payment Detail Ticket viewed. " + env);
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage();
        paymentDetailsPage.clickToRejectPendingTicket();
        log.info("Clicked on reject button on the detail page.");
        log.info("the messege is written to reject");
        log.info("The pendling ticket is rejected");
        RejectTicketPage rejectTicketPage = new RejectTicketPage();
        rejectTicketPage.titleCheckTest();
        log.info("The loaded page is checked.");
    }


}
