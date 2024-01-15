package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserDashboardPage;
import com.easybusticket.pages.UserLoginPage;
import com.easybusticket.pages.UserSupportTicketFormPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class UserCreateSupportTicketTest_US15 extends BaseTest{
    @Test
    public void createSupportTicketTest(){
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();
        UserDashboardPage userDashboardPage = userLoginPage.login();
        UserSupportTicketFormPage userSupportTicketFormPage = userDashboardPage.getToSupportTicketFormPage();

    }
}
