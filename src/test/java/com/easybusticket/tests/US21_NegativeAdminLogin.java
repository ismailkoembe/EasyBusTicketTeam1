package com.easybusticket.tests;


    import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.utilities.Driver;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
    import org.testng.annotations.Test;

    @Slf4j
    public class US21_NegativeAdminLogin extends BaseTestAdmin{



        /**
         * REYHAN for negative login with uncorrect credentials
         */
        @Test
        @Severity(value = SeverityLevel.CRITICAL)
        @Description("The admin can't login with uncorrect or empty crediantials")
        public void uncorrectUsername(){
            // The admin can't login the admin dashboard page
            AdminDashboardPage adminDashboardPage = new AdminPage().negativeAdminLoginWithUncorrectUsername();
            log.info("Admin can't login admin dashboard with uncorrect username");
            Driver.get(env).navigate().refresh();


            // The admin can't manage the admin dashboard page
            adminDashboardPage = new AdminPage().negativeAdminLoginWithUncorrectPassword();
            log.info("Admin can't login admin dashboard with uncorrect password");
            Driver.get(env).navigate().refresh();

            // The admin can't manage the admin dashboard page
            adminDashboardPage = new AdminPage().negativeAdminLoginWithUncorrectPassword();
            log.info("Admin can't login admin dashboard with uncorrect password");
            Driver.get(env).navigate().refresh();

            // The admin can't manage the admin dashboard page
            adminDashboardPage = new AdminPage().negativeAdminLoginWithUncorrectCredintial();
            log.info("Admin can't login admin dashboard with uncorrect credentials");
            Driver.get(env).navigate().refresh();

            // The admin can't manage the admin dashboard page
            adminDashboardPage = new AdminPage().negativeAdminLoginWithEmptyCredintial();
            log.info("Admin can't login admin dashboard with uncorrect password");
            // Driver.get(env).navigate().back();




        }


}
