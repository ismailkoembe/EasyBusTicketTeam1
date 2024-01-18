package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;
@Slf4j
public class US29_AdminDashboardPageReport extends BaseTestAdmin {
    @Test
    @Severity(value = SeverityLevel.NORMAL)
    @Description("In the dashboard page that opens, clicks the Report dropdown menu" +
            " in the side bar menu on the left side, displays and clicks the Login History " +
            "link in the dropdown that opens. Displays and clicks the Email History link. " +
            "By clicking the button under the action title on the page, " +
            "it displays the last written e-mail and details")
    public void reportTest() {
        //Login Page
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        //Click Report Menu
        adminDashboardPage.clickToReport();
        //Click Login History
        adminDashboardPage.clickLoginHistory();
        //Click Email History
        adminDashboardPage.clickEmailHistory();
        //Click Action Button
        adminDashboardPage.clickEmailHistoryActionButton();
    }

}

