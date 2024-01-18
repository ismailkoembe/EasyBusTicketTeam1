package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.bouncycastle.crypto.digests.Kangaroo;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
@Slf4j
public class ContactPage extends BasePage {
    public ContactPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }

    // Contact Us title
    @FindBy(xpath = "//h2[@class='title']")
    public WebElement titleContactUs;

    //Our Adress
    @FindBy(xpath = "//div[@class='info-item active']")
    public WebElement titleOurAdres;

    //Call Us
    @FindBy(xpath = "//*[text()='Call Us']")
    public WebElement titleCallUs;

    //Phone Number
    @FindBy(linkText = "+1 (603) 624-1800")
    public WebElement linkPhoneNumber;
    // Email Us
    @FindBy(xpath = "//*[text()='Email Us']")
    public WebElement titleEmailUs;

    //Email Link
    @FindBy(xpath = "(//a[@href='mailto:info@easybusticket.com'])[1]")
    public WebElement linkEmail;

    //=======================Dashboard Page - Have Any Questions===============================
    @FindBy(xpath = "//h4[@class='title mb-4']")
    public WebElement labelHaveAnyQuestion;

    //Name
    @FindBy(xpath="//input[@id='name']")
    public WebElement textOfBoxName;

    //Subject
    @FindBy(xpath = "(//input[@class='form--control'])[3]")
    public WebElement textOfBoxSubject;

    //Email
    @FindBy(xpath = "(//input[@class='form--control'])[2]")
    public WebElement textOfBoxEmail;

    //Your Message
    @FindBy(xpath = "(//input[@class='form--control'])[4]")
    public WebElement textOfBoxYourMessage;

    //Send Us Message
    @FindBy(xpath = "//*[text()='Send Us Message']")
    public WebElement sendUsMessageButton;
    //Map
    @FindBy(xpath = "/html/body/section[2]/div/div[3]/div[2]/div/iframe")
    public WebElement labelMap;

    @Step(" Confirms that they are on the Contact page by seeing the 'Contact Us' banner on the opening page.")
    public void titleContactTest() {
        String expectedContactTitle = "Easy Bus Ticket - Contact Us";
        String actualContactTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualContactTitle,expectedContactTitle);
        softAssert.assertAll();
    }

    @Step("Filling in the Form und click the Send Us Message button")
    public  void fillTheContactForm(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        waitAndClick(textOfBoxName);
        actions.sendKeys(faker.name().firstName())
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.letterify("bag"))
                .sendKeys(Keys.TAB)
                .sendKeys(faker.letterify("loss"))
                .sendKeys(Keys.PAGE_DOWN)
                .perform();
                  sendUsMessageButton.click();

        }
}




