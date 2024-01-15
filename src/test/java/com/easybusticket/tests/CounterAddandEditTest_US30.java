package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.utilities.Driver;
import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.security.PublicKey;

@Slf4j
public class CounterAddandEditTest_US30 extends BaseTestAdmin{

    @Test
    public void counterAddandEditTest(){
        //The admin can manage the admin dashboard page after successful login.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();

        //Counter title Displayed and click
        softAssert.assertTrue(adminDashboardPage.counterTitle.isDisplayed());
        adminDashboardPage.counterTitle.click();

        //All counter information on the counter page is displayed.
        softAssert.assertTrue(adminDashboardPage.allCounterTitle.isDisplayed());
        softAssert.assertTrue(adminDashboardPage.nameTitle.isDisplayed());
        softAssert.assertTrue(adminDashboardPage.mobileNumberTitle.isDisplayed());
        softAssert.assertTrue(adminDashboardPage.cityTitle.isDisplayed());
        softAssert.assertTrue(adminDashboardPage.locationTitle.isDisplayed());
        softAssert.assertTrue(adminDashboardPage.statusTitle.isDisplayed());
        softAssert.assertTrue(adminDashboardPage.actionTitle.isDisplayed());
        softAssert.assertTrue(adminDashboardPage.nameTitle.isDisplayed());
        softAssert.assertTrue(adminDashboardPage.addNewButtonLink.isEnabled());
        softAssert.assertAll();

        //New counter information is added.
        adminDashboardPage.addNewButtonLink.click();
        Faker faker=new Faker();
        actions.click(adminDashboardPage.namesection)
                .sendKeys(faker.country().capital())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().cityName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().cityName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().subscriberNumber())
                .sendKeys(Keys.TAB)
                .perform();
         adminDashboardPage.submitButton.click();

         //The newly added information is displayed in the list.
    }
}
