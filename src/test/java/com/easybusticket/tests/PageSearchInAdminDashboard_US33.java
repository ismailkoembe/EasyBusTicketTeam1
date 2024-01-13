package com.easybusticket.tests;

import com.easybusticket.pages.AdminDashboardPage;
import com.easybusticket.pages.AdminPage;
import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Slf4j
public class PageSearchInAdminDashboard_US33 extends BaseTestAdmin{

    @DataProvider(name="pages")
    public Object[][] getPages() {
        return new Object[][] {{"Blog"},{"FAQ"},{"About Us"},{"Contact"}};
    }

    @Test(dataProvider = "pages")
    public void pagesSearchAdminDashboard(String page){

        //The admin can manage the admin dashboard page after successful login.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
        log.info("Admin logged in admin dashboars");

        //Admin clicks the search button
        adminDashboardPage.clickButtonSearch();
        log.info("Clicked on the button search");

        //Clicks the search bar and searches the sent page
        adminDashboardPage.searchPage(page);

        String expectedUrl="/https://qa.easybusticket.com/admin/frontend/frontend-sections/blog";
        String actualUrl= Driver.get(env).getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl);

        expectedUrl="https://qa.easybusticket.com/admin/frontend/frontend-sections/faq";
        actualUrl=Driver.get(env).getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl);

        expectedUrl="https://qa.easybusticket.com/admin/frontend/frontend-sections/about";
        actualUrl=Driver.get(env).getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl);

        expectedUrl="https://qa.easybusticket.com/admin/frontend/frontend-sections/contact";
        actualUrl=Driver.get(env).getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl);

        log.info("Clicked on the bar search and  found the sent page");
    }
}
