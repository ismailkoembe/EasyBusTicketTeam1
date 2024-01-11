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
    public void LoginPage() throws InterruptedException {

        // navigate to the login page
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();
        ProfilePage profilePage = new ProfilePage();
        Faker faker = new Faker();

        String username= "pacal63";
        String password= "omerfarukP5*";

        userLoginPage.username_login.sendKeys(username);
        userLoginPage.password_login.sendKeys(password);
        userLoginPage.waitAndClick(userLoginPage.button_login);

        String expectedTitle = "Easy Bus Ticket - Dashboard";
        String actualTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualTitle, expectedTitle);
        softAssert.assertAll();

        //Asli'nin credentials lari ile giris
        //userLoginPage.login();

        UserDashboard userDashboard = new UserDashboard();

        userDashboard.dropDownProfile.click();
        wait(2000);

        userDashboard.dropDownProfileOption.click();
        wait(2000);

        //Clear address input
        profilePage.address.clear();

        String fakeAddress ="Exocet" + faker.letterify("??");
        profilePage.address.sendKeys(fakeAddress);
        wait(2000);


        //Scrolling down
        Actions action =new Actions(driver);

        action.sendKeys(Keys.PAGE_DOWN).perform();

        wait(2000);
        profilePage.buttonUpdateProfile.click();



        /*JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTodocument.body.scrollHeight");

         */


    }
}