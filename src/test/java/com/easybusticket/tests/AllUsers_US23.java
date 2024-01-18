package com.easybusticket.tests;

import com.easybusticket.pages.*;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class AllUsers_US23 extends BaseTestAdmin {

    @Test
    public void AllUsersTest() {
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        adminDashboardPage.manageUsersDropdown.click();

        AllUsersPages allUsersPage = new AllUsersPages();
        allUsersPage.allUsersTest();  // Call the updated allUsersTest method

    }
    }