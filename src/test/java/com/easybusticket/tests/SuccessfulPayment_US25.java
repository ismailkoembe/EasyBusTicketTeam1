package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.pages.PendingPaymentPage;
import com.easybusticket.pages.SuccessfulPaymentPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class SuccessfulPayment_US25 extends BaseTestAdmin{

    @Test
    public void successfulPaymentTest() {

        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        adminDashboardPage.clickToSuccessfulPayment();
        SuccessfulPaymentPage successfulPaymentPage =new SuccessfulPaymentPage();
        successfulPaymentPage.titleSuccessfulPaymentPage();
    }
}
