package com.easybusticket.tests;

import com.easybusticket.pages.BuyTicketsPage;
import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserDashboardPage;
import org.testng.annotations.Test;

public class BuyTicketsTest_US13 extends BaseTest{

    @Test
    public void BuyTicketTest() {

        UserDashboardPage userDashboardPage = new HomePage().clickToSignIn().login();
        BuyTicketsPage buyTicketsPage = userDashboardPage.clickToBuyTicketsButton();

        buyTicketsPage.fillTheFindTicketsForm();
        buyTicketsPage.fillTheCardInformations();

    }
}
