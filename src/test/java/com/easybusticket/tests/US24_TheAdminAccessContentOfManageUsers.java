package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class US24_TheAdminAccessContentOfManageUsers extends BaseTestAdmin{
    @Test
            public void sidebarManageUsers() {

        // The admin can manage the admin dashboard page after successful login.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();

        //The admin opens the manage users dropdown
        adminDashboardPage.manageUsersDropdown();

    }



}
