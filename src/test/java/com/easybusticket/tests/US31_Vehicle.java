package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.pages.VehiclePage;
import org.testng.annotations.Test;

public class US31_Vehicle extends BaseTestAdmin {


    @Test
    public void ManageFleets() {
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        adminDashboardPage.manageFleets2();
    }


    @Test
    public void Vehicles() {

        ManageFleets();
        VehiclePage vehiclePage = new VehiclePage();
        vehiclePage.Vehicles();

    }

    @Test
    public void AddVehicle() {

        ManageFleets();
        VehiclePage vehiclePage = new VehiclePage();
        vehiclePage.AddVehicle();

    }

    @Test
    public void UpdateVehicle() {

        ManageFleets();
        VehiclePage vehiclePage = new VehiclePage();
        vehiclePage.UpdateVehicle();

    }

}