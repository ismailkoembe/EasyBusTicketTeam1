package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.function.Function;

public class AdminTicketPage extends BasePage{
    public AdminTicketPage() {

        PageFactory.initElements(Driver.get("stage"), this);
    }
    public void pendingTest(){
        AdminTicketPage adminTicketPage = new AdminDashboardPage().pendingTickets();
        String expectedUrl = "https://qa.easybusticket.com/admin/ticket/pending";
        String actualUrl = Driver.get(env).getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl);
        softAssert.assertAll();

    }



}
