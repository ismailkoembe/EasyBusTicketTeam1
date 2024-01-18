package com.easybusticket.tests;

import com.easybusticket.pages.*;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.easybusticket.pages.BasePage.driver;

@Slf4j
public class US23_AllUsers extends BaseTestAdmin {

    @Test
    public void allUsersTest() {
        // Log in as an administrator and navigate to the admin Dashboard.
        AdminDashboardPage adminDashboardPage = new AdminPage().adminLogin();
      
        // Navigate to the "All Users" page.
        AllUsersPage allUsersPage = new AllUsersPage();

        adminDashboardPage.manageUsersDropdown.click();


        // Verify that the "All Users" page is loaded successfully.

        adminDashboardPage.allUsersDropdown.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sidebar__menuWrapper']/ul/li[2]/div/ul/li[1]/a/span[1]")));
        element.click();

        WebElement searchBar = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div[2]/form/div/input"));
        searchBar.click();

        WebElement emailInput = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div[2]/form/div/input"));

        // Clear any existing text in the input field (optional, depending on your needs)
        emailInput.clear();

        // Enter the email using sendKeys
        emailInput.sendKeys("wilburn.green@gmail.com");

        WebElement searchIcon = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div[2]/form/div/div/button"));

        // Click the search icon
        searchIcon.click();
        // Optionally add waits or assertions after searching by email.

        // Clear the search bar
        allUsersPage.clearSearchBar();

        // Perform a new search by username
        allUsersPage.searchByUsername("ugurcan");

        // Optionally add waits or assertions after searching by username.


    }
}
