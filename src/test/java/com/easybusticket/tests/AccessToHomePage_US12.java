package com.easybusticket.tests;


import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserDashboardPage;
import com.easybusticket.pages.UserLoginPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class AccessToHomePage_US12 extends BaseTest{

    @Test
    public void accessToHomePage(){
        // navigate to the login page
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();

        //navigate to the dashboard page
        UserDashboardPage userDashboardPage = userLoginPage.login();
        log.info("userdashboard should be presented");

        //After logging in as a user, click on the site logo on the left,
        //access the home page and see the Dashboard link on the right side of the header on the home page
        HomePage homePage=new UserDashboardPage().logoEasyBusTicket();
        log.info("firma logosuna tiklar ve anasayfaya yonelir");

        //Click on the Dashboard link on the home page and access the Dashboard page
        //"Dashboard" is displayed as the title on the Dashboard page
        userDashboardPage.linkDashboard();
        log.info("ana sayfadaki dashboard linkine tiklar ve userdashboarde gider");











    }
}