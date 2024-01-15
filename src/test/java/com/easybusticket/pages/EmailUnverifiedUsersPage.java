package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class EmailUnverifiedUsersPage extends BasePage{
    public EmailUnverifiedUsersPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }
}

