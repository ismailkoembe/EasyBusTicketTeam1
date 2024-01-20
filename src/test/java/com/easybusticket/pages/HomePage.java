package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

@Slf4j
public class HomePage extends BasePage {

    public HomePage() {
        PageFactory.initElements(Driver.get("stage"), this);
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

    @FindBy(xpath = "/html/body/section[6]")
    public WebElement footerSection;

    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[2]/div/h4")
    public WebElement footerUsefulLinks;

    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[3]/div/h4")
    public WebElement footerPolicies;

    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[4]/div/h4")
    public WebElement footerContactInfo;

    //Footer Twitter Icon Link

    @FindBy(xpath = "//a[@href='https://www.twitter.com']")
    public WebElement getTwitterIconFooter;

    //Footer Facebook Icon Link
    @FindBy(xpath = "//a[@href='https://www.facebook.com']")
    public WebElement getFacebookIconFooter;

    //Footer Youtube Icon Link
    @FindBy(xpath = "//a[@href='https://www.youtube.com']")
    public WebElement getYoutubeIconFooter;

    //Footer Instagram Icon Link
    @FindBy(xpath = "(//a[@href='https://www.instagram.com'])[2]")
    public WebElement getInstagramIconFooter;

    //Footer About Title Linkhttps://www.youtube.com
    @FindBy(xpath = "(//*[@href='https://qa.easybusticket.com/about-us'])[2]")
    public WebElement getAboutTitleFooter;

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
    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[3]/div/ul/li[2]/a")
    public WebElement getTermsAndConditionsTitleFooter;

    //Footer Ticket Policies Title Link
    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[3]/div/ul/li[3]/a")
    public WebElement getTicketPoliciesFooter;

    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[4]/div/ul/li[1]")
    public WebElement footerContactInfoAdresse;

    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[4]/div/ul/li[2]/a")
    public WebElement footerPhoneLink;

    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[4]/div/ul/li[3]/a")
    public WebElement footerEmailAdresseLink;

    //Body Section
    @FindBy(xpath = "/html/body")
    public WebElement bodySection;


    //Choose Your Ticket
    @FindBy(xpath = "/html/body/section[6]/div/div/div/div[2]/div/ul/li[3]/a")
    public WebElement chooseYourTicket;

    //Body Pickup Point Button
    @FindBy(xpath = "//*[@id=\"one-way\"]/form/div[2]/div/span/span[1]/span")
    public WebElement bodyPickupPointButton;

    //Body Dropping Point Button
    @FindBy(xpath = "//*[@id=\"one-way\"]/form/div[3]/div/span/span[1]/span")
    public WebElement bodyDroppingPointButton;


    //Body Departure Date Button
    @FindBy(xpath = "//*[@id=\"dp1705089140317\"]")
    public WebElement bodyDepartureDateButton;

    //Body Get Ticket Button
    @FindBy(xpath = "//html/body/section[1]/div[1]/div/div[2]/a")
    public WebElement bodyTicketButton;

    //Body Offered Facilities Title Text
    @FindBy(xpath = "//section[@class='amenities-section padding-bottom']")
    public WebElement bodyOfferedFacilitiesTitle;

    //Body Our Testemonials Title Text
    @FindBy(xpath = "//section[@class='padding-bottom padding-top testimonial-section']")
    public WebElement bodyOurTestemonialsTitle;
    //Body Recent Blog Post Title Text

    @FindBy(xpath = "//section[@class='blog-section padding-top padding-bottom']")
    public WebElement bodyRecentBlogPostTitle;


    public RegisterPage register = new RegisterPage();

    @Step("I clicked Cookies")
    public void acceptCookies() {
        waitAndClick(cookies);
    }

    @Step("I clicked SignUp link,I expect Sign Up your Account text")
    public RegisterPage clickSignUp() {
        waitAndClick(signUpLink);
        String expectedText = "Sign Up your Account";
        String actualText = register.textOfSignUpyourAccount.getText();

        softAssert.assertEquals(actualText, expectedText);

        return new RegisterPage();
    }

    public UserLoginPage clickToSignIn() {
        waitAndClick(linkSignIn);

        return new UserLoginPage();
    }


    public AboutPage clickToAboutButton() {

        acceptCookies();
        Assert.assertTrue(aboutButton.isDisplayed());
        waitAndClick(aboutButton);
        return new AboutPage();

    }

    public ContactPage clickToContactTitle() {
        acceptCookies();
        waitAndClick(contactTitle);
        return new ContactPage();

    }

    public void clickToFAQsTitle() {
        acceptCookies();
        waitAndClick(faqsTitle);

    }

    public FaqPage clickToFaqTitle() {
        acceptCookies();
        waitAndClick(faqsTitle);
        return new FaqPage();
    }


    /**
     * REYHAN Blog page control
     */
    public BlogPage clickToBlogTitle() {
        acceptCookies();
        waitAndClick(blogTitle);
        return new BlogPage();
    }

    public void clickToHomeTitle() {
        acceptCookies();
        waitAndClick(homeTitle);
    }

    @Step("Scroll down to the bottom of the Page")
    public void scrollToBottom() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    @Step("verify the visibility and enable of the footer")
    public void footerTestVisilibityTest() {

        //verify the visibility and enable of the footer
        softAssert.assertTrue(footerSection.isDisplayed());
        log.info(" Footer section is displayed and enabled " + env);
    }

    @Step(" verify the visibility of the social media items")
    public void footerSocialMediaItemsVisibilityAndEnable() {
        // verify the visibility of the social media items
        softAssert.assertTrue(getTwitterIconFooter.isEnabled());
        softAssert.assertTrue(getFacebookIconFooter.isEnabled());
        softAssert.assertTrue(getYoutubeIconFooter.isEnabled());
        softAssert.assertTrue(getInstagramIconFooter.isEnabled());
        log.info(" Social Media and social media icons are displayed and enabled " + env);
        softAssert.assertAll();
    }

    @Step("verify the visibility of Useful Links section")
    public void footerUsefulLinksItemsVisibilityAndEnable() {

        //verify the visibility of Useful Links section
        softAssert.assertTrue(footerUsefulLinks.isDisplayed());
        softAssert.assertTrue(getAboutTitleFooter.isEnabled());
        softAssert.assertTrue(getFaqsTitleFooter.isEnabled());
        softAssert.assertTrue(getBlogTitleFooter.isEnabled());
        softAssert.assertTrue(footerContactUsefulLinks.isEnabled());
        log.info("Useful Links are displayed and enabled " + env);

        softAssert.assertAll();
    }

    @Step("verify the visibility of footer policies section")
    public void footerPoliciesSectionVisibilityAndEnable() {
        //verify the visibility of footer policies section
        softAssert.assertTrue(footerPolicies.isEnabled());
        softAssert.assertTrue(getPrivacyPolicyTitleFooter.isEnabled());
        softAssert.assertTrue(getTermsAndConditionsTitleFooter.isEnabled());
        softAssert.assertTrue(getTicketPoliciesFooter.isEnabled());
        log.info("Policies Section are displayed and enabled " + env);
        softAssert.assertAll();
    }

    @Step("verify the visibility of contact Info section")
    public void footerContactInfoSectionVisibilityAndEnable() {
        //verify the visibility of contact Info section
        softAssert.assertTrue(footerContactInfo.isDisplayed());
        softAssert.assertTrue(footerContactInfoAdresse.isDisplayed());
        softAssert.assertTrue(footerPhoneLink.isEnabled());
        softAssert.assertTrue(footerEmailAdresseLink.isEnabled());
        log.info(" Contact Info Informatons are displayed, Phone and Email link are enabled" + env);
        softAssert.assertAll();
    }



    @FindBy(xpath = "//*[text()='Every Journey is an Adventure, Every Ticket is a Story']")
    public WebElement homePageText;
    @Step("Go to url and check text")
    public void websiteTest() {
        acceptCookies();
        String expectedTitle = "Every Journey is an Adventure, Every Ticket is a Story";
        String actualTitle = homePageText.getText();
        Assert.assertEquals(actualTitle,expectedTitle);
        log.info("text is visible");
    }
}











