package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.ProfilePage;
import com.easybusticket.pages.UserDashboard;
import com.easybusticket.pages.UserLoginPage;
import com.easybusticket.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static com.easybusticket.pages.BasePage.driver;

public class US17_TC_01_02_03 extends BaseTest {

    @Test
    public void LoginPage(){

        // navigate to the login page
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();

        ProfilePage profilePage = new ProfilePage();

        userLoginPage.login();

        profilePage.profileSetting();

        profilePage.updateProfileSettings();

    }
}