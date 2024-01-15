package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserChangePasswordPage;
import com.easybusticket.pages.UserDashboardPage;
import com.easybusticket.pages.UserLoginPage;
import com.easybusticket.utilities.PropManager;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Slf4j
public class UserChangePasswordNegativeTest_US18 extends BaseTest {
    @Test
    public void changePasswordNegativeTest (){
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();
        UserDashboardPage userDashboardPage = userLoginPage.login(PropManager.getProperties(env,"usernameRegistered"),PropManager.getProperties(env,"passwordRegistered"));
        log.info("Logged in");
        UserChangePasswordPage userChangePasswordPage = userDashboardPage.getToChangePasswordPage();
        log.info("Navigated to the change password page");
        userChangePasswordPage.inputCurrentPassword.sendKeys(PropManager.getProperties(env,"passwordRegistered"));
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
    public void userChangePasswordNegativeTest(String currentPassword, String newPassword) {
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();
        UserDashboardPage userDashboardPage = userLoginPage.login(PropManager.getProperties(env,"usernameRegistered"),PropManager.getProperties(env,"passwordRegistered"));
        log.info("Logged in");
        UserChangePasswordPage userChangePasswordPage = userDashboardPage.getToChangePasswordPage();
        log.info("Navigated to the change password page");
        userChangePasswordPage.clickToChangePasswordButton(currentPassword,newPassword);

    }

}


