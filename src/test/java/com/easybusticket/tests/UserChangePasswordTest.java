package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserChangePasswordPage;
import com.easybusticket.pages.UserDashboardPage;
import com.easybusticket.pages.UserLoginPage;
import org.testng.annotations.Test;

public class UserChangePasswordTest extends BaseTest {
    @Test
    public void changePasswordTest() {
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();
        UserDashboardPage userDashboard = userLoginPage.login("logintesti", "LoginTesti!2");
        userDashboard.getToChangePasswordPage();
        new UserChangePasswordPage().clickToChangePasswordButton();
    }
}
