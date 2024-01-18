package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserChangePasswordPage;
import com.easybusticket.pages.UserDashboardPage;
import com.easybusticket.pages.UserLoginPage;
import com.easybusticket.utilities.PropManager;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class US18_UserChangePasswordTest extends BaseTest {
    @Test
    @Severity(value = SeverityLevel.NORMAL)
    @Description("User change password test")
    public void changePasswordTest() {
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();
        UserDashboardPage userDashboardPage = userLoginPage.login(PropManager.getProperties(env,"usernameRegistered"),PropManager.getProperties(env,"passwordRegistered"));
        userDashboardPage.getToChangePasswordPage();
        new UserChangePasswordPage().clickToChangePasswordButton();
    }
}
