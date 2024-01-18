package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Slf4j
public class US33_PageSearchInAdminDashboard extends BaseTestAdmin{

    @DataProvider(name="pages")
    public Object[][] getPages() {
        return new Object[][] {{"Blog"},{"FAQ"},{"About Us"},{"Contact"}};
    }

    @Test(dataProvider = "pages")
    @Severity(value = SeverityLevel.MINOR)
    @Description("Clicks button search, searches for a page and reaches the page")
    public void pagesSearchAdminDashboard(String page){

        //The admin can manage the admin dashboard page after successful login.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in admin dashboars");

        //Admin clicks the search button
        adminDashboardPage.clickButtonSearch();
        log.info("Clicked on the button search");

        //Clicks the search bar and searches the sent page
        adminDashboardPage.searchPage(page);
        log.info("Page searched with data provider");

        Assert.assertTrue(adminDashboardPage.labelBlog.isDisplayed());
        log.info("Clicked on the bar search and  found the sent page");

        Assert.assertTrue(adminDashboardPage.labelFaq.isDisplayed());
        log.info("Clicked on the bar search and  found the sent page");

        Assert.assertTrue(adminDashboardPage.labelAboutUs.isDisplayed());
        log.info("Clicked on the bar search and  found the sent page");

        Assert.assertTrue(adminDashboardPage.labelContact.isDisplayed());
        log.info("Clicked on the bar search and  found the sent page");
    }
}
