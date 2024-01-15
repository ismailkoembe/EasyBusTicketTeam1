package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

@Slf4j
public class GatewayPage extends BasePage{
    public GatewayPage(){
        PageFactory.initElements(Driver.get("stage"),this);
    }
    @FindBy(xpath = "//*[text()='Manual Gateways']")
    public WebElement manualGatewaysButton;
    @FindBy(xpath = "(//*[text()='Automatic Gateways'])[2]")
    public WebElement labelAutomaticGateway;

    @FindBy(xpath = "//input[@name='search_table']")
    public WebElement searchBox;

    @FindBy(xpath = "//*[text()='Gateway']")
    public WebElement columnGateway;

    @FindBy(xpath = "//*[text()='Supported Currency']")
    public WebElement columnSupportedCurrency;

    @FindBy(xpath = "//*[text()='Enabled Currency']")
    public WebElement columnEnabledCurrency;

    @FindBy(xpath = "//*[text()='Status']")
    public WebElement columnStatus;

    @FindBy(xpath = "(//*[@class='name'])[1]")
    public WebElement rowFirstValueGateway;

    @FindBy(xpath = "(//*[@data-label='Supported Currency'])[1]")
    public WebElement rowFirstValueSupportedCurrency;

    @FindBy(xpath = "(//*[@data-label='Enabled Currency'])[1]")
    public WebElement rowFirstValueEnabledCurrency;

    @FindBy(xpath = "(//*[@class='text--small badge font-weight-normal badge--warning'])[1]")
    public WebElement rowFirstValueStatus;

    @FindBy(xpath = "//*[text()='Payment Gateways']")
    public WebElement paymentGatewaysButton;

    @FindBy(xpath = "//*[text()='Automatic Gateways']")
    public WebElement automaticGatewaysButton;

/*-------------------------------------------------------------------------------------------------------------------*/
    @FindBy(xpath = "(//*[text()='Manual Gateways'])[2]")
    public WebElement labelManualGateway;
    @FindBy(xpath = "//a[@class='btn btn-sm btn--primary box--shadow1 text--small']")
    public WebElement manualGatewayAddNewButton;

    @FindBy(xpath = "//*[text()='Action']")
    public WebElement columnAction;

    @FindBy(xpath = "(//a[@class='icon-btn editGatewayBtn'])[1]")
    public WebElement firstElementEditButton;

    @FindBy(xpath = "//*[@class='la la-eye']")
    public WebElement firstElementActivationButton;

    @FindBy(xpath = "//*[@class='btn btn--primary']")
    public WebElement activationChangeButton;


    @FindBy(xpath = "//*[text()='New Manual Gateway']")
    public WebElement labelEditPageManualGateway;

    @FindBy(xpath = "//*[@class='profilePicPreview']")
    public WebElement imageProfile;

    @FindBy(xpath = "//*[@class='bg--primary']")
    public WebElement imageUploadButton;
    @FindBy(xpath = "//*[@name='name']")
    public WebElement textOfBoxGatewayName;

    @FindBy(xpath = "//*[@name='currency']")
    public WebElement textOfBoxCurrency;

    @FindBy(xpath = "//*[@name='rate']")
    public WebElement textOfBoxRate;

    @FindBy(xpath = "//*[text()='Range']")
    public WebElement labelRange;

    @FindBy(xpath = "//*[@name='min_limit']")
    public WebElement textOfBoxMinimumAmount;

    @FindBy(xpath = "//*[@name='max_limit']")
    public WebElement textOfBoxMaximumAmount;

    @FindBy(xpath = "//*[text()='Charge']")
    public WebElement labelCharge;

    @FindBy(xpath = "//*[@name='fixed_charge']")
    public WebElement textOfBoxFixedCharge;

    @FindBy(xpath = "//*[@name='percent_charge']")
    public WebElement textOfBoxPercentCharge;

    @FindBy(xpath = "//*[text()='Deposit Instruction']")
    public WebElement labelDepositInstruction;

    @FindBy(xpath = "//*[@contenteditable='true']")
    public WebElement textOfBoxMessage;

    @FindBy(xpath = "//*[text()='User data                                                ']")
    public WebElement labelUserData;

    @FindBy(xpath = "(//*[@type='button'])[7]")
    public WebElement addNewUserDataButton;

    @FindBy(xpath = "//*[@name='field_name[]']")
    public WebElement textOfBoxFieldName;

    @FindBy(xpath = "//*[@name='type[]']")
    public WebElement dropDownUserDataInput;

    @FindBy(xpath = "//*[@name='validation[]']")
    public WebElement dropDownUserDataValue;

    @FindBy(xpath = "//*[@class='btn btn--danger btn-lg removeBtn w-100']")
    public WebElement userDataRemove;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement saveMethodButton;

    @FindBy(xpath = "(//a[@class='icon-btn editGatewayBtn'])[1]")
    public WebElement goBackButton;

    public void automaticGatewayVerifyTest(){

        softAssert.assertTrue(labelAutomaticGateway.isDisplayed());
        softAssert.assertTrue(searchBox.isDisplayed());
        softAssert.assertTrue(columnGateway.isDisplayed());
        softAssert.assertTrue(columnSupportedCurrency.isDisplayed());
        softAssert.assertTrue(columnEnabledCurrency.isDisplayed());
        softAssert.assertTrue(columnStatus.isDisplayed());
        softAssert.assertTrue(rowFirstValueGateway.isDisplayed());
        softAssert.assertTrue(rowFirstValueSupportedCurrency.isDisplayed());
        softAssert.assertTrue(rowFirstValueEnabledCurrency.isDisplayed());
        softAssert.assertTrue(rowFirstValueStatus.isDisplayed());

        waitAndClick(searchBox);
        String expectedIcerik = "Blockchain";
        searchBox.sendKeys(expectedIcerik);
        String actualIcerik = rowFirstValueGateway.getText();
        softAssert.assertEquals(actualIcerik,expectedIcerik);
        softAssert.assertAll();
        log.info("Automatic gateway searchbox'da arama yapıldı");

        waitAndClick(paymentGatewaysButton);
        waitAndClick(automaticGatewaysButton);
        log.info("Automatic gateway page sayfasına dönüş yapıldı");

    }

    public void manualGatewayVerifyTest(){

        softAssert.assertTrue(labelManualGateway.isDisplayed());
        softAssert.assertTrue(manualGatewayAddNewButton.isDisplayed());
        softAssert.assertTrue(searchBox.isDisplayed());
        softAssert.assertTrue(columnGateway.isDisplayed());
        softAssert.assertTrue(columnStatus.isDisplayed());
        softAssert.assertTrue(columnAction.isDisplayed());
        softAssert.assertTrue(rowFirstValueGateway.isDisplayed());
        softAssert.assertTrue(rowFirstValueStatus.isDisplayed());
        softAssert.assertTrue(firstElementEditButton.isDisplayed());
        softAssert.assertTrue(firstElementActivationButton.isDisplayed());
        String expectedIcerik = "WISE PAY";
        searchBox.sendKeys(expectedIcerik);
        String actualIcerik = rowFirstValueGateway.getText();
        softAssert.assertEquals(actualIcerik,expectedIcerik);
        log.info("Manual gateway searchbox'da arama yapıldı");
        //waitAndClick(paymentGatewaysButton);
        waitAndClick(manualGatewaysButton);

        manualGatewayAddNewButton.click();
        //waitAndClick(imageUploadButton);
        //String dinamikDosyaYolu = System.getProperty("user.dir") +
                //"/Downloads/logo.png";
        //imageUploadButton.sendKeys(dinamikDosyaYolu + Keys.ENTER);

        textOfBoxGatewayName.sendKeys("hello");
        textOfBoxCurrency.sendKeys("euro");
        textOfBoxRate.sendKeys("0.80");
        textOfBoxMinimumAmount.sendKeys("10");
        textOfBoxMaximumAmount.sendKeys("1000");
        textOfBoxFixedCharge.sendKeys("10");
        textOfBoxPercentCharge.sendKeys("10");
        waitAndClick(textOfBoxMessage);
        textOfBoxMessage.sendKeys("new payment method");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        waitAndClick(addNewUserDataButton);
        waitAndClick(userDataRemove);
        log.info("buraya kadar çalıştı");
        waitAndClick(saveMethodButton);
        log.info("save butonuna tıkladı");
        //waitAndClick(goBackButton);



        softAssert.assertAll();





    }











}
