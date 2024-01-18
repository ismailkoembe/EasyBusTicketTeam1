package com.easybusticket.tests;

import com.easybusticket.pages.AdminManageTripsPage;
import com.easybusticket.pages.HomePage;
import org.testng.annotations.Test;

public class AdminManageTripsPageTest_US32 extends BaseTestAdmin{

    @Test
    public void accessToManageTripsMenu() {
        AdminManageTripsPage adminManageTripsPage = new AdminManageTripsPage();

        // step 1 - login and check menu trips options are displayed
        adminManageTripsPage.adminLogin();

        // step 2 - Route Page and Route Configurations
        adminManageTripsPage.routeConfig();
    }
}
