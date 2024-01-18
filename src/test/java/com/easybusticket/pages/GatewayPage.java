package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import com.easybusticket.utilities.GetAbsolutePath;
import com.easybusticket.utilities.HardWait;
import com.easybusticket.utilities.PropManager;
import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;


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

    @FindBy(xpath = "//*[text()='Manual Gateways']")
    public WebElement manualGatewaysButton;

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


    /** Ayca Ovali */
    @Step("Admin clicked the automaticGatewayVerifyTest method and verified all page information")
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
        softAssert.assertAll();
        log.info("The information on the page was viewed");

    }
    @Step("Admin searched payment method in automatic gateway menu searchbox")
    public void automaticGatewaySearchBoxTest(){
        waitAndClick(searchBox);
        String expectedSearch = "Blockchain";
        searchBox.sendKeys(expectedSearch);
        String actualSearch = rowFirstValueGateway.getText();
        Assert.assertEquals(actualSearch,expectedSearch);
        log.info("Searched in automatic gateway search box");

        waitAndClick(paymentGatewaysButton);
        waitAndClick(automaticGatewaysButton);
        log.info("Returned to Automatic Gateway Page");
    }
    /**========MANUAL GATEWAY METHODS========*/
    @Step("Admin clicked the manualGatewayMenuVerifyTest method and verified all page information")
    public void manualGatewayMenuVerifyTest(){

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
        softAssert.assertAll();
        log.info("The information on the page was viewed");

    }

    @Step("Clicked the manualGatewaySearchBoxTest and searched in manual gateway page")
    public void manualGatewaySearchBoxTest(){

        String expectedIcerik = "hello";
        searchBox.sendKeys(expectedIcerik);
        String actualIcerik = rowFirstValueGateway.getText();
        Assert.assertEquals(actualIcerik,expectedIcerik);
        log.info("Searched in manual gateway search box");
        waitAndClick(paymentGatewaysButton);
        waitAndClick(manualGatewaysButton);
        log.info("Returned to Manual Gateway Page");

    }

    @Step("Clicked the manualGatewayNewAddPaymentTest and added a new manual payment method")
    public void manualGatewayNewAddPaymentTest(){
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
        textOfBoxMessage.sendKeys("New Manual Payment Method");
        log.info("new payment method information has been entered");
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        waitAndClick(addNewUserDataButton);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        HardWait.hardWait(1000);
        softAssert.assertTrue(textOfBoxFieldName.isDisplayed());
        softAssert.assertTrue(dropDownUserDataInput.isDisplayed());
        softAssert.assertTrue(dropDownUserDataValue.isDisplayed());
        softAssert.assertAll();
        waitAndClick(userDataRemove);

        HardWait.hardWait(2000);

        saveMethodButton.submit();
        log.info("Clicked the Save Method Button");

        WebElement popupMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iziToast-message")));
        Assert.assertTrue(popupMessage.isDisplayed(), "popup message is not displayed.");
        String messageText = popupMessage.getText();
        Assert.assertEquals(messageText, "hello Manual gateway has been added.", "popup message text does not match.");
        log.info("hello Manual gateway has been added. message is displayed");

        HardWait.hardWait(2000);

        goBackButton.click();
        log.info("Returned Manual gateway page");

    }
    @Step("Clicked the manualGatewayPaymentUpdateTest and updated and saved method information")
    public void manualGatewayPaymentUpdateTest(){

        waitAndClick(firstElementEditButton);
        waitAndClick(textOfBoxCurrency);
        textOfBoxCurrency.clear();
        textOfBoxCurrency.sendKeys("dolar");

        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

        HardWait.hardWait(2000);

        updateSaveMethod.submit();
        log.info("Saved Changed");

        HardWait.hardWait(2000);

        goBackButton.click();
        log.info("Returned Manual gateway page");

    }

    @Step("Clicked the manualGatewayActivationTest and checked buttons")
    public void manualGatewayActivationTest(){

        waitAndClick(firstElementActivationButton);
        waitAndClick(methodActivateButton);
        waitAndClick(methodDeactivatedButton);
        waitAndClick(methodDisabledButton);
        log.info("Activate and Desibled buttons checked");

        HardWait.hardWait(2000);

        String expectedStatus = "Disabled";
        String actualStatus = rowFirstValueStatus.getText();
        Assert.assertEquals(actualStatus,expectedStatus);
        log.info("method status is disabled");
    }

}
