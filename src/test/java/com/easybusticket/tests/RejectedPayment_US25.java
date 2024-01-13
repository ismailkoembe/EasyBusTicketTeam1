package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.pages.PendingPaymentPage;
import com.easybusticket.pages.RejectedPaymentPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class RejectedPayment_US25 extends BaseTestAdmin{

    @Test
    public void rejectedPaymentTest() {

        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        adminDashboardPage.clickToRejectedPayment();
        RejectedPaymentPage rejectedPaymentPage =new RejectedPaymentPage();
        rejectedPaymentPage.titleRejectedPaymentPage();


    }
}
