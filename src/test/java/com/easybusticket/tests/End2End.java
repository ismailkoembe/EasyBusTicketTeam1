package com.easybusticket.tests;

import com.easybusticket.pages.*;
import org.testng.annotations.Test;

public class End2End extends BaseTest{

    @Test
    public void end2endScenario(){

        RegisterPage registerPage = new HomePage().clickSignUp();

        UserDashboardPage userDashboardPage = registerPage.signUp();

        BuyTicketsPage buyTicketsPage = userDashboardPage.clickToBuyTicketsButton();

        buyTicketsPage.fillTheFindTicketsForm();

        buyTicketsPage.selectSeat();

        buyTicketsPage.selectGender();

        buyTicketsPage.payNow();

        buyTicketsPage.fillTheCardInformations();

        buyTicketsPage.printTicket();

        userDashboardPage.logout();




    }
}
