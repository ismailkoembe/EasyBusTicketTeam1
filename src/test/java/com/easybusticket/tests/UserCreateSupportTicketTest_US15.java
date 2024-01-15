package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserDashboardPage;
import com.easybusticket.pages.UserLoginPage;
import com.easybusticket.pages.UserSupportTicketFormPage;
import com.easybusticket.utilities.Driver;
import com.easybusticket.utilities.PropManager;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;

@Slf4j
public class UserCreateSupportTicketTest_US15 extends BaseTest{
    @Test
    public void createSupportTicketTest(){
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();
        UserDashboardPage userDashboardPage = userLoginPage.login(PropManager.getProperties(env,"usernameRegistered"),PropManager.getProperties(env,"passwordRegistered"));
        UserSupportTicketFormPage userSupportTicketFormPage = userDashboardPage.getToSupportTicketFormPage();
        log.info("navigated to the support ticket page");
        Assert.assertEquals(userSupportTicketFormPage.nameFormInput.getAttribute("value"),"login Testi");
        Assert.assertEquals(userSupportTicketFormPage.emailFormInput.getAttribute("value"),"logintesti@proton.me");
        userSupportTicketFormPage.fillTheRestOfForm();

        String expectedTitle = "Easy Bus Ticket - Support Tickets";
        String actualTitle = Driver.get(env).getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
