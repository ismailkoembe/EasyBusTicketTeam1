package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import org.testng.annotations.Test;

public class ManageFleets_US_31 extends BaseTestAdmin{


    @Test
    public void ManageFleets(){

        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();

    }
}
