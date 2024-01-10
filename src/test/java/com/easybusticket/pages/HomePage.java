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
    public WebElement linkSignIn;

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

    // Contact Title Button.
    @FindBy(xpath = "(//a[text()='Contact'])")
    public WebElement contactTitle;

    //Buy Ticket ButtonLink
    @FindBy(xpath = "//div[@class='d-flex flex-wrap algin-items-center']")
    public WebElement buyTicketButtonLink;

    //Footer Twitter Icon Link
    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[1]/div/ul/li[1]/a/svg")
    public  WebElement getTwitterIconFooter;

    //Footer Facebook Icon Link
    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[1]/div/ul/li[2]/a/svg")
    public WebElement getFacebookIconFooter;

    //Footer Youtube Icon Link
    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[1]/div/ul/li[3]/a/svg")
    public WebElement getYoutubeIconFooter;

    //Footer Instagram Icon Link
    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[1]/div/ul/li[4]/a")
    public WebElement getInstagramIconFooter;

    //Footer About Title Link
    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[2]/div/ul/li[1]/a")
    public  WebElement  getAboutTitleFooter;

    //Footer FAQs Title Link
    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[2]/div/ul/li[2]/a")
    public WebElement getFaqsTitleFooter;

    //Footer Blog Title Link
    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[2]/div/ul/li[3]/a")
    public WebElement getBlogTitleFooter;

    //Footer Contact Title Link
    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[2]/div/ul/li[4]/a")
    public WebElement getContactTitleFooter;

    //Footer Privacy Policy Title Link
    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[3]/div/ul/li[1]/a")
    public WebElement getPrivacyPolicyTitleFooter;

    //Footer Terms and Conditions Title Link
    @FindBy (xpath = "/html/body/section[6]/div/div/div/div[3]/div/ul/li[2]/a")
    public WebElement getTermsAndConditionsTitleFooter;

    //Footer Ticket Policies Title Link
    @FindBy(xpath ="/html/body/section[6]/div/div/div/div[3]/div/ul/li[3]/a")
    public  WebElement getTicketPoliciesFooter;

    public RegisterPage register = new RegisterPage();

    public void acceptCookies() {
        waitAndClick(cookies);
    }

    public RegisterPage clickSignUp() {
        waitAndClick(signUpLink);
        String expectedText = "Sign Up your Account";
        String actualText = register.textOfSignUpyourAccount.getText();
        softAssert.assertEquals(actualText,expectedText);

        return new RegisterPage();
    }

    public UserLoginPage clickToSignIn() {
        waitAndClick(linkSignIn);

        return new UserLoginPage();
    }


    }


