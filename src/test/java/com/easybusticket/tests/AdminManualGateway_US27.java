package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.pages.GatewayPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class AdminManualGateway_US27 extends BaseTestAdmin{

    @Test
    public void manuelGatewayTest(){
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        adminDashboardPage.clickToManualGateway();
        GatewayPage gatewayPage = new GatewayPage();
        gatewayPage.manualGatewayVerifyTest();
    }

}
