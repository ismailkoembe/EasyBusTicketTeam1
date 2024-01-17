package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.pages.VehiclePage;
import org.testng.annotations.Test;

public class Vehicle_US_31 extends BaseTestAdmin {


    @Test
    public void ManageFleets() {
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        adminDashboardPage.manageFleets2();
    }


    @Test
    public void Vehicle() {

        ManageFleets();
        VehiclePage vehiclePage = new VehiclePage();
        vehiclePage.Vehicles();

    }

    @Test
    public void AddNewVehicle() {

        ManageFleets();
        VehiclePage vehiclePage = new VehiclePage();
        //vehiclePage.addNewVehicles();

    }
}