package com.easybusticket.tests;

import com.easybusticket.pages.*;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;
@Slf4j
public class US34_ChangeAdminPasswordTest extends BaseTestAdmin {

    @Test
    public void changingPasswordAdmin() {

        //The admin can manage the admin dashboard page after successful login.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in admin dashboards " );

        //Select 'profile' option, from the admin icon dropdown menu
        adminDashboardPage.adminPageSettings();
        log.info("Profile is selected ");

        //Clicks on the Password Settings button
        AdminProfilePage adminProfilePage = new AdminProfilePage();
        adminProfilePage.changePasswordAdmin();
        log.info("'Change Password' form is opened ");

        //navigate to the login page
        adminDashboardPage.logout();
        log.info(" logout test ");
    }

}





