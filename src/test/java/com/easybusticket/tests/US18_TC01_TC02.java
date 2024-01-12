package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserDashboardPage;
import com.easybusticket.pages.UserLoginPage;
import org.testng.annotations.Test;

public class US18_TC01_TC02 extends BaseTest{
    @Test
    public void changePasswordTest(){
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();
        UserDashboardPage userDashboard = userLoginPage.login("logintesti","LoginTesti!1");

    }
}
