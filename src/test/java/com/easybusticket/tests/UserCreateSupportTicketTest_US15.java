package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.SupportTicketPage;
import com.easybusticket.pages.UserDashboardPage;
import com.easybusticket.pages.UserLoginPage;
//import com.easybusticket.pages.UserSupportTicketFormPage;
import com.easybusticket.utilities.Driver;
import com.easybusticket.utilities.PropManager;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;

@Slf4j
public class UserCreateSupportTicketTest_US15 extends BaseTest {
    @Test
    public void createSupportTicketTest() {
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();
        UserDashboardPage userDashboardPage = userLoginPage.login(PropManager.getProperties(env, "usernameRegistered"), PropManager.getProperties(env, "passwordRegistered"));
        SupportTicketPage supportTicketPage = userDashboardPage.createNewRequestPage();
        log.info("navigated to the support ticket page");
        Assert.assertEquals(supportTicketPage.textBoxOfNameButton.getAttribute("value"),"login Testi");
        Assert.assertEquals(supportTicketPage.textBoxOfEmailButton.getAttribute("value"),"logintesti@proton.me");
        supportTicketPage.fillTheRestOfForm();

        String expectedTitle = "Easy Bus Ticket - Support Tickets";
        String actualTitle = Driver.get(env).getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}

