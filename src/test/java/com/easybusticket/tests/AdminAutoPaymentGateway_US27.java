package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.pages.GatewayPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class AdminAutoPaymentGateway_US27 extends BaseTestAdmin{
    @Test
    public void automaticGateWayTest(){

        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        adminDashboardPage.clickToAutomaticGateway();
        GatewayPage gatewayPage = new GatewayPage();
        gatewayPage.automaticGatewayVerifyTest();
        log.info("edit - delete basamaklarına kadar tamamlandı. Edit - Delete butonları sayfada mevcut değil");

    }
}
