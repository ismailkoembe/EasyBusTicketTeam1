package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    public GatewayPage automaticGatewayVerifyTest(){

        softAssert.assertTrue(labelAutomaticGateway.isDisplayed());
        softAssert.assertTrue(searchBox.isDisplayed());
        softAssert.assertTrue(columnGateway.isDisplayed());
        softAssert.assertTrue(columnSupportedCurrency.isDisplayed());
        softAssert.assertTrue(columnEnabledCurrency.isDisplayed());
        softAssert.assertTrue(columnGateway.isDisplayed());
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

        return new GatewayPage();

    }











}
