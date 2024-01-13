package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


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
    public WebElement aboutButton;

    //FAQs Title Button
    @FindBy(xpath = "(//a[text()='FAQs'])")
    public WebElement faqsTitle;

    //Blog Title Button
    @FindBy(xpath = "(//a[text()='Blog'])")
    public WebElement blogTitle;

    // Contact Title Button.
    @FindBy(xpath = "(//a[text()='Contact'])")
    public WebElement contactTitle;

    //Buy Ticket ButtonLink
    @FindBy(xpath = "//div[@class='d-flex flex-wrap algin-items-center']")
    public WebElement buyTicketButtonLink;

    @FindBy (xpath = "/html/body/section[6]")
    public WebElement footerSection;

    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[2]/div/h4")
    public WebElement footerUsefulLinks;

    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[3]/div/h4")
    public WebElement footerPolicies;

    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[4]/div/h4")
    public WebElement footerContactInfo;

    //Footer Twitter Icon Link
    @FindBy(xpath = "(//a[@href='https://www.twitter.com'])[2]")
    public  WebElement getTwitterIconFooter;

    //Footer Facebook Icon Link
    @FindBy(xpath = "(//a[@href='https://www.facebook.com'])[2]")
    public WebElement getFacebookIconFooter;

    //Footer Youtube Icon Link
    @FindBy(xpath = "//a[@href='https://www.youtube.com']")
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
    public WebElement footerContactUsefulLinks;

    //Footer Privacy Policy Title Link
    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[3]/div/ul/li[1]/a")
    public WebElement getPrivacyPolicyTitleFooter;

    //Footer Terms and Conditions Title Link
    @FindBy (xpath = "/html/body/section[6]/div/div/div/div[3]/div/ul/li[2]/a")
    public WebElement getTermsAndConditionsTitleFooter;

    //Footer Ticket Policies Title Link
    @FindBy(xpath ="/html/body/section[6]/div/div/div/div[3]/div/ul/li[3]/a")
    public  WebElement getTicketPoliciesFooter;

    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[4]/div/ul/li[1]")
    public WebElement footerContactInfoAdresse;

    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[4]/div/ul/li[2]/a")
    public WebElement footerPhoneLink;

    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[4]/div/ul/li[3]/a")
    public WebElement footerEmailAdresseLink;

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

    public AboutPage clickToAboutButton(){
        acceptCookies();
        waitAndClick(aboutButton);
        return new AboutPage();

    }
    public ContactPage clickToContactTitle(){
        acceptCookies();
        waitAndClick(contactTitle);
        return new ContactPage();


    }
    public void clickToFAQsTitle(){
        acceptCookies();
        waitAndClick(faqsTitle);

    }
    public BlogPage clickToBlogTitle(){
        acceptCookies();
        waitAndClick(blogTitle);
        return new BlogPage();
    }

    public void clickToHomeTitle(){
        acceptCookies();
        waitAndClick(homeTitle);
    }
}







