package com.easybusticket.tests;

import com.easybusticket.pages.AdminManageTripsPage;
import org.testng.annotations.Test;

public class US32_AdminManageTripsPageTest extends BaseTestAdmin{

    @Test
    public void accessToManageTripsMenu() {
        AdminManageTripsPage adminManageTripsPage = new AdminManageTripsPage();

        // step 1 - login and check menu trips options are displayed
        adminManageTripsPage.adminLogin();

        // step 2 - Route Page and Route Configurations
        adminManageTripsPage.routeConfig();
    }
}
