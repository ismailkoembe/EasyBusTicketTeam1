package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.pages.AdminTicketPage;
import com.easybusticket.pages.ManageActiveUsersPage;
import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class TheAdminAccessContentOfManageUsers_US24 extends BaseTestAdmin{
    @Test
            public void sidebarManageUsers() {

        // The admin can manage the admin dashboard page after successful login.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();

        //The admin opens the manage users dropdown
        adminDashboardPage.manageUsersDropdown();

    }



}
