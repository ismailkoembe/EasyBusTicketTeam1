package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.pages.FleetTypePage;
import org.testng.annotations.Test;

public class US31_FleetType extends BaseTestAdmin {


    @Test
    public void ManageFleets() {
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        adminDashboardPage.manageFleets1();
    }

    @Test
    public void AddNewFleetType(){

        ManageFleets();
        FleetTypePage fleetTypePage = new FleetTypePage();
        fleetTypePage.addFleetType();

    }

    @Test
    public void UpdateFleetType(){
        ManageFleets();

        FleetTypePage fleetTypePage = new FleetTypePage();
        fleetTypePage.updateFleetType();
    }


}