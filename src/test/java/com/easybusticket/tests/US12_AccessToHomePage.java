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
public class US12_AccessToHomePage extends BaseTest{

    @Test
    @Severity(value = SeverityLevel.TRIVIAL)
    @Description("Clicks dashboard link on home page, page refreshes")
    public void accessToHomePage(){
        // navigate to the login page
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();

        //navigate to the dashboard page
        UserDashboardPage userDashboardPage = userLoginPage.login();
        log.info("userdashboard should be presented");

        //After logging in as a user, click on the site logo on the left,
        //access the home page and see the Dashboard link on the right side of the header on the home page
        HomePage homePage=new UserDashboardPage().logoEasyBusTicket();
        log.info("Clicks on the company logo and navigates to the homepage");

        //Click on the Dashboard link on the home page and access the Dashboard page
        //"Dashboard" is displayed as the title on the Dashboard page
        userDashboardPage.linkDashboard();
        log.info("Clicks the dashboard link on the home page and goes to userdashboard");
    }
}
