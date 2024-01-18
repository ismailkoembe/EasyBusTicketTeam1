package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserDashboardPage;
import com.easybusticket.pages.UserLoginPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;
@Slf4j
public class US19_UserLogoutTest extends BaseTest{

    @Test
    @Severity(value = SeverityLevel.CRITICAL)
    @Description(" User should be able to log out of the system and access the user login page")
    public void userLogoutTest(){
        // navigate to the login page
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();

        //navigate to the dashboard page
        UserDashboardPage userDashboardPage = userLoginPage.login();

        //navigate to the login page
        UserLoginPage userLogout = new UserDashboardPage().logout();
        log.info(" logout test ");
    }
}
