package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserChangePasswordPage;
import com.easybusticket.pages.UserDashboardPage;
import com.easybusticket.pages.UserLoginPage;
import com.easybusticket.utilities.PropManager;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Slf4j
public class US18_UserChangePasswordNegativeTest extends BaseTest {
    @Test
    @Severity(value = SeverityLevel.NORMAL)
    @Description("User change password negative tests")
    public void changePasswordNegativeTest() {
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();
        UserDashboardPage userDashboardPage = userLoginPage.login(PropManager.getProperties(env, "usernameRegistered"), PropManager.getProperties(env, "passwordRegistered"));
        log.info("Logged in");
        UserChangePasswordPage userChangePasswordPage = userDashboardPage.getToChangePasswordPage();
        log.info("Navigated to the change password page");
        userChangePasswordPage.inputCurrentPassword.sendKeys(PropManager.getProperties(env, "passwordRegistered"));
        userChangePasswordPage.inputNewPassword.sendKeys("LOGIN.testi10");
        userChangePasswordPage.inputConfirmPassword.sendKeys("LOGINtesti.10");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        userChangePasswordPage.buttonChangePassword.click();

    }

    @DataProvider(name = "changePassword")
    public Object[][] changeData() {
        return new Object[][]{
                {"", ""},
                {"567788K.k", "243085Asd."},
                {"", "567788K.k"},
        };
    }

    @Test(dataProvider = "changePassword")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("User change password negative tests")
    public void userChangePasswordNegativeTest(String currentPassword, String newPassword) {
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();
        UserDashboardPage userDashboardPage = userLoginPage.login(PropManager.getProperties(env, "usernameRegistered"), PropManager.getProperties(env, "passwordRegistered"));
        log.info("Logged in");
        UserChangePasswordPage userChangePasswordPage = userDashboardPage.getToChangePasswordPage();
        log.info("Navigated to the change password page");
        userChangePasswordPage.clickToChangePasswordButton(currentPassword, newPassword);

    }

}


