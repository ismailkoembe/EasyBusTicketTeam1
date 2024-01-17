package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailHistoryPage extends BasePage{
    public EmailHistoryPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }



        //Action title of Email History
        @FindBy(xpath = "//tbody/tr[1]/td[5]/a")
        public WebElement coloumnEmailHistoryAction;

   }





