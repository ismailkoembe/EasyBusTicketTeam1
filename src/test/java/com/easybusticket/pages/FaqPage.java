package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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

    @FindBy (xpath = "/html/body/section[2]/div/div[2]/div[1]/div")
    public WebElement faqItemContent;

    @FindBy (xpath = "/html/body/section[2]/div/div[2]/div[1]/div/div[2]/div[2]/p")

    public WebElement FaqItemContentAnswers;

    public void faqItemContentTest(){

        boolean isDisplayed = faqItemContent.isDisplayed();

        softAssert.assertTrue(isDisplayed, "FAQ item content should be displayed");

        softAssert.assertAll();

    }
}
