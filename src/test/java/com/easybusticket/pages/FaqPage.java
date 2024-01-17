package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class FaqPage extends BasePage {
    public FaqPage(){
        PageFactory.initElements(Driver.get("stage"),this);
    }

    @FindBy ( xpath = "/html/body/section[2]/div/div[2]/div[1]/div/div[1]")
    public WebElement faqItem;

    public void faqItemExistTest(){
        boolean isDisplayed = faqItem.isDisplayed();

        softAssert.assertTrue(isDisplayed, "FAQ item should be displayed");

        softAssert.assertAll();
    }

    @FindBy (xpath = "/html/body/section[2]/div/div[2]/div[1]/div/div[1]/div[1]")
    public WebElement faqItemContentQuestion;

    @FindBy (xpath = "/html/body/section[2]/div/div[2]/div[1]/div/div[1]/div[2]")

    public WebElement faqItemContentAnswers;

    public void faqItemContentTest(){
        // Scroll the element into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", faqItemContentQuestion);

        // Click on the question to reveal the answer
        waitAndClick(faqItemContentQuestion);

        // Give some time for the page to stabilize
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        boolean isDisplayedQuestion = faqItemContentQuestion.isDisplayed();

        boolean isDisplayedAnswer = faqItemContentAnswers.isDisplayed();

        softAssert.assertTrue((isDisplayedQuestion && isDisplayedAnswer), "FAQ item content should be displayed");

        softAssert.assertAll();

    }
}
