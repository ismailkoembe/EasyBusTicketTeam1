package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.SupportTicketPage;
import com.easybusticket.pages.UserDashboardPage;
import com.easybusticket.pages.UserLoginPage;
//import com.easybusticket.pages.UserSupportTicketFormPage;
import com.easybusticket.utilities.Driver;
import com.easybusticket.utilities.PropManager;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.Keys;
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
        Assert.assertEquals(supportTicketPage.textBoxOfNameButton.getAttribute("value"), "login Testi");
        Assert.assertEquals(supportTicketPage.textBoxOfEmailButton.getAttribute("value"), "logintesti@proton.me");
        supportTicketPage.fillTheRestOfForm();

        String expectedTitle = "Easy Bus Ticket - Support Tickets";
        String actualTitle = Driver.get(env).getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test
    public void createSupportTicketTestNegative() {
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();
        UserDashboardPage userDashboardPage = userLoginPage.login(PropManager.getProperties(env, "usernameRegistered"), PropManager.getProperties(env, "passwordRegistered"));
        SupportTicketPage supportTicketPage = userDashboardPage.createNewRequestPage();
        log.info("navigated to the support ticket page");
        supportTicketPage.clickToSubmitButton();
        Assert.assertTrue(supportTicketPage.textBoxOfNameButton.isDisplayed());

    }

    @Test
    public void displayingRequestTicketTest() {
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();
        UserDashboardPage userDashboardPage = userLoginPage.login(PropManager.getProperties(env, "usernameRegistered"), PropManager.getProperties(env, "passwordRegistered"));
        SupportTicketPage supportTicketPage = userDashboardPage.createNewRequestPage();
        log.info("navigated to the support ticket page");
        supportTicketPage.clickToMyRequestButton();
        softAssert.assertTrue(supportTicketPage.columnSubject.isDisplayed());
        softAssert.assertTrue(supportTicketPage.columnStatus.isDisplayed());
        softAssert.assertTrue(supportTicketPage.columnPriority.isDisplayed());
        softAssert.assertTrue(supportTicketPage.columnLastReply.isDisplayed());
        softAssert.assertTrue(supportTicketPage.columnAction.isDisplayed());
        softAssert.assertTrue(supportTicketPage.newTicketButton.isDisplayed());
        softAssert.assertTrue(supportTicketPage.rowFirstRequest.isDisplayed());
        softAssert.assertTrue(supportTicketPage.actionButton.isDisplayed());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        supportTicketPage.actionButton.click();
        supportTicketPage.replyToRequest();
        softAssert.assertTrue(supportTicketPage.closeTicketButton.isDisplayed());
        softAssert.assertAll();
    }
}

