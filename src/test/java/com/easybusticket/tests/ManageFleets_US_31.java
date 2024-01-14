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

        SeatLayoutsPage seatLayoutsPage = new SeatLayoutsPage();

        seatLayoutsPage.addSeatLayouts();

        seatLayoutsPage.successfulMessage();

        seatLayoutsPage.updateLayout();

        seatLayoutsPage.successfulMessage();

    }
}
