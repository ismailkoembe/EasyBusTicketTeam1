package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.ProfilePage;
import com.easybusticket.pages.UserLoginPage;
import org.testng.annotations.Test;

public class US17_UserProfileSetting extends BaseTest {

    @Test
    public void LoginPage() {

        // navigate to the login page
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();

        ProfilePage profilePage = new ProfilePage();

        userLoginPage.login();

        profilePage.profileSetting();

        profilePage.updateProfileSettings();

    }
}