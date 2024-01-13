package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class AdminAutoPaymentGateway_US27 extends BaseTestAdmin{
    @Test
    public void automaticGateWayTest(){

        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        adminDashboardPage.clickToAutomaticGateway();

    }
}
