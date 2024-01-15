package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UserSupportTicketFormPage extends BasePage{
    public UserSupportTicketFormPage(){
        PageFactory.initElements(Driver.get("stage"),this);
    }
    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameFormInput;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailFormInput;

    @FindBy(xpath = "//input[@name='subject']")
    public WebElement subjectFormInput;

    @FindBy(xpath = "//select[@name='priority']")
    public WebElement dropdownPriorityForm;

    @FindBy(xpath = "//textarea[@id='inputMessage']")
    public WebElement inputMessageForm;

    @FindBy(xpath = "//input[@id='inputAttachments']")
    public WebElement inputAttachmentsForm;

    @FindBy(xpath = "//button[@id='recaptcha']")
    public WebElement buttonSubmitForm;

    public SupportTicketPage fillTheRestOfForm() {
        subjectFormInput.sendKeys("Deneme");
        Select slc = new Select(dropdownPriorityForm);
        slc.getFirstSelectedOption();
        inputMessageForm.sendKeys("Deneme Request olusturuldu");

        String path= System.getProperty("user.dir") +
                "\\src\\test\\java\\com\\easybusticket\\testResources\\attachment.png";
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        inputAttachmentsForm.sendKeys(path);
        waitAndClick(buttonSubmitForm);
        return new SupportTicketPage();

    }


}
