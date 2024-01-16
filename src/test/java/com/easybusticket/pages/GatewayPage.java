package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import com.easybusticket.utilities.GetAbsolutePath;
import com.easybusticket.utilities.PropManager;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import javax.swing.plaf.TableHeaderUI;


@Slf4j
public class GatewayPage extends BasePage{
    public GatewayPage(){
        PageFactory.initElements(Driver.get("stage"),this);
    }


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

    @FindBy(xpath = "//*[@class='profilePicUpload']")
    public WebElement imageUploadButton;
    @FindBy(xpath = "//*[@name='name']")
    public WebElement textOfBoxGatewayName;

    @FindBy(xpath = "//*[@name='currency']")
    public WebElement textOfBoxCurrency;

    @FindBy(xpath = "//*[@name='rate']")
    public WebElement textOfBoxRate;

    @FindBy(xpath = "//*[@name='min_limit']")
    public WebElement textOfBoxMinimumAmount;

    @FindBy(xpath = "//*[@name='max_limit']")
    public WebElement textOfBoxMaximumAmount;

    @FindBy(xpath = "//*[@name='fixed_charge']")
    public WebElement textOfBoxFixedCharge;

    @FindBy(xpath = "//*[@name='percent_charge']")
    public WebElement textOfBoxPercentCharge;

    @FindBy(xpath = "//*[@contenteditable='true']")
    public WebElement textOfBoxMessage;


    @FindBy(xpath = "(//*[@type='button'])[7]")

    public WebElement addNewUserDataButton;

    @FindBy(xpath = "//*[@name='field_name[]']")
    public WebElement textOfBoxFieldName;

    @FindBy(xpath = "//*[@name='type[]']")
    public WebElement dropDownUserDataInput;

    @FindBy(xpath = "//*[@name='validation[]']")
    public WebElement dropDownUserDataValue;

    @FindBy(xpath = "(//*[@type='button'])[8]")
    public WebElement userDataRemove;

    @FindBy(xpath = "//*[text()='Save Method']")
    public WebElement saveMethodButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div/form/div[2]/button")
    public WebElement updateSaveMethod;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div[2]/a")
    public WebElement goBackButton;

    @FindBy(xpath = "//*[@id=\"activateModal\"]/div/div/form/div[2]/button[2]")
    public WebElement methodActivateButton;

    @FindBy(xpath = "//*[@class='icon-btn bg--danger ml-1 deactivateBtn ']")
    public WebElement methodDeactivatedButton;

    @FindBy(xpath = "//*[@id=\"deactivateModal\"]/div/div/form/div[2]/button[2]")
    public WebElement methodDisabledButton;


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
        waitAndClick(manualGatewayAddNewButton);


        String path = GetAbsolutePath.getAbsolutePath(PropManager.getProperties(env, "imgPathLogo"));
        imageUploadButton.sendKeys(path);
        textOfBoxGatewayName.sendKeys("hello");
        textOfBoxCurrency.sendKeys("euro");
        textOfBoxRate.sendKeys("0.80");
        textOfBoxMinimumAmount.sendKeys("10");
        textOfBoxMaximumAmount.sendKeys("1000");
        textOfBoxFixedCharge.sendKeys("10");
        textOfBoxPercentCharge.sendKeys("10");
        textOfBoxMessage.sendKeys("yeni ödeme methodu eklendi");

        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        saveMethodButton.submit();
        log.info("Clicked the Save Method Button");


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        goBackButton.click();
        waitAndClick(firstElementEditButton);
        waitAndClick(textOfBoxCurrency);
        textOfBoxCurrency.sendKeys(Keys.DELETE);
        textOfBoxCurrency.sendKeys("dolar");

        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        updateSaveMethod.submit();
        log.info("Saved Changed");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        goBackButton.click();

        waitAndClick(firstElementActivationButton);
        waitAndClick(methodActivateButton);
        waitAndClick(methodDeactivatedButton);
        waitAndClick(methodDisabledButton);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String expectedStatus = "Disabled";
        String actualStatus = rowFirstValueStatus.getText();
        Assert.assertEquals(actualStatus,expectedStatus);



    }


}
