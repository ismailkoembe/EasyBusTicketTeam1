package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class MakeTheFullPageAdmin_US33 extends BaseTestAdmin{

    @Test
    public void makeTheFullPage(){

        //The admin can manage the admin dashboard page after successful login.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in admin dashboars");





    }
}
