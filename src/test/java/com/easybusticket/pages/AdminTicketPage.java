package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AdminTicketPage {
    public AdminTicketPage() {

        PageFactory.initElements(Driver.get("stage"), this);
    }

    public void pendingTest(){
        AdminTicketPage adminTicketPage = new AdminDashboardPage().pendingTicket();
        String expectedUrl = "https://qa.easybusticket.com/admin/ticket/pending";
        String actualUrl = Driver.get("stage").getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
    }
}
