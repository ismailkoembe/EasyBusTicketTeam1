package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserChangePasswordPage;
import com.easybusticket.pages.UserDashboardPage;
import com.easybusticket.pages.UserLoginPage;
import com.easybusticket.utilities.PropManager;
import org.testng.annotations.Test;

public class UserChangePasswordTest_US18 extends BaseTest {
    @Test
    public void changePasswordTest() {
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();
        UserDashboardPage userDashboardPage = userLoginPage.login(PropManager.getProperties(env,"usernameRegistered"),PropManager.getProperties(env,"passwordRegistered"));
        userDashboardPage.getToChangePasswordPage();
        new UserChangePasswordPage().clickToChangePasswordButton();
    }
}
