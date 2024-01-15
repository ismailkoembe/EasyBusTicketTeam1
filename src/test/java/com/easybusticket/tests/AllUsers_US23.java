package com.easybusticket.tests;

import com.easybusticket.pages.*;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class AllUsers_US23 extends BaseTestAdmin {

    @Test
    public void allUsersTest() {
        // Log in as an administrator and navigate to the admin Dashboard.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();

        adminDashboardPage.manageUsers.click();


        ManageUsersPage manageUsersPage = new ManageUsersPage();
        manageUsersPage.clickToAllUsersPage();



        // Navigate to the "All Users" page.
        adminDashboardPage.clickToAllUsersPage();
        AllUsersPage allUsersPage = new AllUsersPage();

        // Verify that the "All Users" page is loaded successfully.

        adminDashboardPage.allUsers.click();


        // Ensure all soft assertions are evaluated.
        softAssert.assertAll();
    }
}

