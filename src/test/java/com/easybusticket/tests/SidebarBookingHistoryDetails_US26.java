package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.pages.AdminTicketPage;
import com.easybusticket.pages.HomePage;
import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;


@Slf4j
public class SidebarBookingHistoryDetails_US26 extends BaseTestAdmin {

    @Test
            public void sidebarBookingHistoryDetails() {

        /**
         * REYHAN
         */

        //The admin can manage the admin dashboard page after successful login.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in admin dashboards");

        //The admin reach all details of "Booking History" in the sidebar
        adminDashboardPage.bookingHistories();
        log.info("Booking History dropdown menu opens");

        adminDashboardPage.bookingHistoryDropdown();

        //The admin visualize content of "Pending Ticket"
         AdminTicketPage adminTicketPage = new AdminTicketPage();
         adminTicketPage.pendingTest();
         Driver.get(env).navigate().back();

        //The admin visualize content of "Booked Ticket"
       // adminTicketPage = new AdminTicketPage();
        adminTicketPage.bookedTest();
        Driver.get(env).navigate().back();

        //The admin visualize content of "Rejected Ticket"
        //adminTicketPage = new AdminTicketPage();
        adminTicketPage.rejectedTest();;
        Driver.get(env).navigate().back();

        //The admin visualize content of "All Ticket"
        //adminTicketPage = new AdminTicketPage();
        adminTicketPage.allTicketTest();
        Driver.get(env).navigate().back();



    }
}
