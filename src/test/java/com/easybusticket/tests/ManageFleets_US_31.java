package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.pages.SeatLayoutsPage;
import org.checkerframework.checker.units.qual.A;
import org.testng.annotations.Test;

public class ManageFleets_US_31 extends BaseTestAdmin{

    @Test
    public void ManageFleets() {
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        adminDashboardPage.manageFleets();

    }

    @Test
    public void LayoutCreat(){

        //calling ManageFleets test above ---- precondition (on kosul)
        ManageFleets();
        SeatLayoutsPage seatLayoutsPage = new SeatLayoutsPage();
        seatLayoutsPage.addSeatLayouts();
        seatLayoutsPage.successfulMessage();

    }

    @Test
    public void LayoutUpdate(){

        ManageFleets();
        SeatLayoutsPage seatLayoutsPage = new SeatLayoutsPage();
        seatLayoutsPage.updateLayout();
        seatLayoutsPage.successfulMessage();
    }

    @Test
    public void LayoutDelete(){

        ManageFleets();
        SeatLayoutsPage seatLayoutsPage = new SeatLayoutsPage();
        seatLayoutsPage.deleteLayout();
        seatLayoutsPage.successfulMessage();
    }



}
