package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.ProfilePage;
import com.easybusticket.pages.UserLoginPage;
import org.testng.annotations.Test;

public class ProfileSettingsUpdate_US_17 extends BaseTest {

    @Test
    public void LoginPage() throws InterruptedException {

        // navigate to the login page
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();

        ProfilePage profilePage = new ProfilePage();

        userLoginPage.login();

        profilePage.profileSetting();

        profilePage.titleCheckTest();

        profilePage.updateProfileSettings();

    }
}