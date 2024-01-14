package com.easybusticket.tests;

import com.easybusticket.pages.*;
import com.easybusticket.utilities.Driver;
import com.easybusticket.utilities.PropManager;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Slf4j

public class US21_TC01_TC02 extends BaseTestAdmin {

    @Test

    public void AdminLogin1(){

        //The admin can manage the admin dashboard page after successful login.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in admin dashboars");


    }


}

