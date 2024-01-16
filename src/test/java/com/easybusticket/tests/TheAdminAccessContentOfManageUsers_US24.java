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
            public void sidebarManageUsers(){

        // The admin can manage the admin dashboard page after successful login.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();

        //The admin opens the manage users dropdown
        adminDashboardPage.manageUsersDropdown();

       /** =========INFO ABOUT ALL USERS======================*/
        /**details of all users under the manage users*/
        adminDashboardPage.allUsers();

        //The admin "All Users" a new page and reachs to its details
        AdminTicketPage adminTicketPage = new AdminTicketPage();
        adminTicketPage.detailsOfAllUsers1();
        adminTicketPage.detailsOfAllUser2();

        //Visibility of user actions
        ManageActiveUsersPage manageActiveUsersPage = new ManageActiveUsersPage();
        manageActiveUsersPage.userActionVisibility();

        //Turn back to Admin dashboard page
        Driver.get(env).navigate().back();


/** =========INFO ABOUT ACTIVE USERS======================*/
        /**details of active users under the manage users*/
        adminDashboardPage.activeUsers();

        //The admin "Active Users" a new page and reachs to its details
        adminTicketPage.detailsOfActiveUsers1();
        adminTicketPage.detailsOfActiveUser2();

        //Visibility of user actions
        manageActiveUsersPage.userActionVisibility();

        //Turn back to Admin dashboard page
        Driver.get(env).navigate().back();


/** =========INFO ABOUT BANNED USERS======================*/
        /**details of banned users under the manage users*/
        adminDashboardPage.bannedUsers();

        //The admin "Banned Users" a new page and reachs to its details
        adminTicketPage.detailsOfBannedUsers1();
        adminTicketPage.detailsOfBannedUser2();

        //Visibility of user actions
        manageActiveUsersPage.userActionVisibility();

        //Turn back to Admin dashboard page
        Driver.get(env).navigate().back();


        /** =========INFO ABOUT EMAIL UNVERIFIED======================*/
        /**details of email unverified under the manage users*/
        adminDashboardPage.emailUnverified();

        //The admin "Banned Users" a new page and reachs to its details
        adminTicketPage.detailsOfEmailUnverified1();
        adminTicketPage.detailsOfEmailUnverified2();

        //Visibility of user actions
        manageActiveUsersPage.userActionVisibility();

        //Turn back to Admin dashboard page
        Driver.get(env).navigate().back();


        /** =========INFO ABOUT SMS UNVERIFIED======================*/
        /**details of email unverified under the manage users*/
        adminDashboardPage.smsUnverified();



    }



}
