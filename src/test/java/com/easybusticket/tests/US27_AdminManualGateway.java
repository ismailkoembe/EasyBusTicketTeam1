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
public class US27_AdminManualGateway extends BaseTestAdmin{

    @Test
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Admin access and verify manual gateway submenu, add a new payment method, view and organize information about it.")
    public void manuelGatewayTest(){
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        adminDashboardPage.clickToManualGateway();
        GatewayPage gatewayPage = new GatewayPage();
        gatewayPage.manualGatewayMenuVerifyTest();
        log.info("Verified the page");
        gatewayPage.manualGatewaySearchBoxTest();
        log.info("Searched");
        gatewayPage.manualGatewayNewAddPaymentTest();
        log.info("Added new manual payment method");
        gatewayPage.manualGatewayPaymentUpdateTest();
        log.info("Updated information");
        gatewayPage.manualGatewayActivationTest();
        log.info("Checked the buttons");
        log.info("There is no delete button in method edit");
        HardWait.hardWait(3000);
        adminDashboardPage.logout();
    }


}
