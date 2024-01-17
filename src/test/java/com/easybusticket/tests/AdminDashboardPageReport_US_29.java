package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;
@Slf4j
public class AdminDashboardPageReport_US_29 extends BaseTestAdmin {
    @Test
    public void reportTest() {
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        adminDashboardPage.clickToReport();
        adminDashboardPage.clickLoginHistory();
        adminDashboardPage.clickEmailHistory();
        adminDashboardPage.clickEmailHistoryActionButton();


    }






}

