package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.pages.GatewayPage;
import com.easybusticket.utilities.HardWait;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class US27_AdminAutoPaymentGateway extends BaseTestAdmin{
    @Test
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Admin access and verify automatic gateway submenu, view and organize information about it.")
    public void automaticGateWayTest(){
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        adminDashboardPage.clickToAutomaticGateway();
        GatewayPage gatewayPage = new GatewayPage();
        gatewayPage.automaticGatewayVerifyTest();
        log.info("Verified the page");
        gatewayPage.automaticGatewaySearchBoxTest();
        log.info("Searched");
        log.info("Completed until the edit - delete steps. Edit - Delete buttons are not available on the page");
        HardWait.hardWait(2000);
        adminDashboardPage.logout();
    }
}
