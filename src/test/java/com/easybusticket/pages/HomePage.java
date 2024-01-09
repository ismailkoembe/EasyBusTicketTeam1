package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Ismail Koembe
 */
public class HomePage extends BasePage{

    public HomePage(){
        PageFactory.initElements(Driver.get("stage"),this);
    }

    //Cookie Allow Button
    @FindBy(xpath = "//a[text()='Allow']")
    public WebElement cookies;

    //Phone Button
    @FindBy(xpath = "//a[@href=''][1]")
    public WebElement phoneLink;

    //Twitter Icon Button.
    @FindBy(xpath = "//a[@href='https://www.twitter.com']")
    public WebElement twitterIcon;

    //Facebook Icon Button
    @FindBy(xpath = "//a[@href='https://www.facebook.com']")
    public WebElement facebookIcon;


    //Youtube Icon Button
    @FindBy(xpath = "//a[@href='https://www.youtube.com']")
    public WebElement youtubeIcon;

    //Instagram Icon Button
    @FindBy(xpath = "//a[@href='https://www.instagram.com']")
    public WebElement instagramIcon;

    //SignIn Button
    @FindBy(xpath = "//*[@class='sign-in']")
    public WebElement signInLink;

    //SignUp Button
    @FindBy(xpath = "//*[@class='sign-up']")
    public WebElement signUpLink;


    //Logo ButtonLink
    @FindBy(xpath = "//div[@class='logo']")
    public WebElement logoButton;

    //Home Title Button
    @FindBy(xpath = "(//a[text()='Home'])")
    public WebElement homeTitle;

    //About Title Button
    @FindBy(xpath = "(//a[text()='About'])")
    public WebElement aboutTitle;

    //FAQs Title Button
    @FindBy(xpath = "(//a[text()='FAQs'])")
    public WebElement faqsTitle;

    //Blog Title Button
    @FindBy(xpath = "(//a[text()=Blog])")
    public WebElement blogTitle;

    // Contact Title Button
    @FindBy(xpath = "(//a[text()='Contact'])")
    public WebElement contactTitle;

    //Buy Ticket ButtonLink
    @FindBy(xpath = "//div[@class='d-flex flex-wrap algin-items-center']")
    public WebElement buyTicketButtonLink;



    public void acceptCookies(){
        waitAndClick(cookies);
    }

    public Register clickSignUp (){
            waitAndClick(signUpLink);
            return new Register();

    }

}
