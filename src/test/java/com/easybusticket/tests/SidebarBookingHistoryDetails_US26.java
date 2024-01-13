package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.pages.AdminTicketPage;
import com.easybusticket.pages.HomePage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;


@Slf4j
public class SidebarBookingHistoryDetails_US26 extends BaseTestAdmin {

    @Test
            public void sidebarBookingHistoryDetails() {

        //The admin can manage the admin dashboard page after successful login.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in admin dashboards");

        //The admin reach all details of "Booking History" in the sidebar
        adminDashboardPage = new AdminDashboardPage();
        log.info("Booking History dropdown menu opens");

        //The admin visualize content of "Pending Ticket"
//        AdminTicketPage adminTicketPage = new AdminTicketPage();
//        adminTicketPage.pendingTest();

    }
}
