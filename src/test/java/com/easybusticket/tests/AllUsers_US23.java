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

        AllUsersPage allUsersPage = new AllUsersPage();
        allUsersPage.allUsersTest();

    }
}
