package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class TotalSMSUnverifiedUsers extends BasePage{
    public TotalSMSUnverifiedUsers() {
        PageFactory.initElements(Driver.get("stage"), this);
    }
}

