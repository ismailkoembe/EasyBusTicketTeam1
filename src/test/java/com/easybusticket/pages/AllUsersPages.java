package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Slf4j
public class AllUsersPages extends BasePage {

    public AllUsersPages() {
        PageFactory.initElements(Driver.get("stage"), this);
    }

    @FindBy(xpath = "//*[@id='sidebar__menuWrapper']/ul/li[2]/div/ul/li[1]/a/span[1]")
    public WebElement allUsersLink;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[1]/div[2]/form/div/input")
    public WebElement emailOrUsernameLink;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[1]/div[2]/form/div/div/button")
    public WebElement searchButtonLink;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div[2]/form/div/input")
    public WebElement usernameOrEmailText;

    @FindBy(xpath = "/html/body/div[1]/div[2]")
    public WebElement manageUsersLink;

    public void allUsersTest() {
        // Click on the "All Users" link
        waitAndClick(allUsersLink);

        // Perform a search with an email
        performSearch("wilburn.green@gmail.com");

        // Delete the email (replace this with the actual logic to delete the email)
        deleteEmail("wilburn.green@gmail.com");

        // Perform a search with a username
        performSearch("ugurcan");

        // Asserts will be collected when the method is called in the test class
        softAssert.assertAll();
    }

    private void performSearch(String searchText) {
        // Click on the email or username text box
        waitAndClick(emailOrUsernameLink);

        // Assert that the usernameOrEmailText is displayed
        softAssert.assertTrue(usernameOrEmailText.isDisplayed());

        // Enter the search text and click the search button
        emailOrUsernameLink.sendKeys(searchText);
        waitAndClick(searchButtonLink);

        // Clear the email or username text box
        emailOrUsernameLink.clear();
    }

    private void deleteEmail(String email) {
        // Implement the logic to delete the email associated with the given email address
        // This might involve navigating to the user's profile, deleting the email, etc.
        // For demonstration purposes, you can print a log message.
        log.info("Deleted email: {}", email);
    }
}