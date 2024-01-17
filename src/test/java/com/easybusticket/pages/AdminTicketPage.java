package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.build.BuildLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.function.Function;

public class AdminTicketPage extends BasePage {


    public AdminTicketPage() {

        PageFactory.initElements(Driver.get("stage"), this);
    }

    @FindBy(xpath = "(//tr/th)[1]")
    WebElement allUsersDetailsColumn1;

    @FindBy(xpath = "(//*[@class='icon-btn'])[1]")
    WebElement allUsersFirstActionButton;


    /**
     * REYHAN  for Admin Pending Ticket
     */
    public void pendingTest() {
        //AdminTicketPage adminTicketPage = new AdminDashboardPage().pendingTickets();
        String expectedUrl = "https://qa.easybusticket.com/admin/ticket/pending";
        String actualUrl = Driver.get(env).getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        softAssert.assertAll();

    }

    /**
     * REYHAN  for Admin Booked Ticket
     */

    public void bookedTest() {
        AdminTicketPage adminTicketPage = new AdminDashboardPage().bookedTickets();
        String expectedUrl = "https://qa.easybusticket.com/admin/ticket/booked";
        String actualUrl = Driver.get(env).getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        softAssert.assertAll();

    }

    /**
     * REYHAN  for Admin Rejected Ticket
     */

    public void rejectedTest() {
        AdminTicketPage adminTicketPage = new AdminDashboardPage().rejectedTickets();
        String expectedUrl = "https://qa.easybusticket.com/admin/ticket/rejected";
        String actualUrl = Driver.get(env).getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        softAssert.assertAll();

    }

    /**
     * REYHAN  for Admin All Ticket
     */

    public void allTicketTest() {
        AdminTicketPage adminTicketPage = new AdminDashboardPage().allTickets();
        String expectedUrl = "https://qa.easybusticket.com/admin/ticket/list";
        String actualUrl = Driver.get(env).getCurrentUrl();
        softAssert.assertEquals(actualUrl, expectedUrl);
        softAssert.assertAll();

    }







}
