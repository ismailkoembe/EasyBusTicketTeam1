package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class US33_MakeTheFullPageAdmin extends BaseTestAdmin{

    @Test
    @Severity(value = SeverityLevel.TRIVIAL)
    @Description("Clicks button full screen page,makes the dashboard screen full screen and brings it back to normal")
    public void makeTheFullPage(){

        //The admin can manage the admin dashboard page after successful login.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in admin dashboars");

        //Makes the dashboard screen full screen and brings it back to normal
        adminDashboardPage.clickButtonFullScreenPage();
        log.info("Makes the dashboard screen full screen and brings it back to normal");

    }
}
