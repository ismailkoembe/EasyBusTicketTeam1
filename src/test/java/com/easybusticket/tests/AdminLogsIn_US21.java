package com.easybusticket.tests;

import com.easybusticket.pages.*;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j

public class AdminLogsIn_US21 extends BaseTestAdmin {

    @Test
    @Severity(value = SeverityLevel.BLOCKER)
    @Description("The admin logs in admin dashboard page")
    public void AdminLogin1(){


        // The admin can manage the admin dashboard page after successful login.

        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in admin dashboars");


    }


}

