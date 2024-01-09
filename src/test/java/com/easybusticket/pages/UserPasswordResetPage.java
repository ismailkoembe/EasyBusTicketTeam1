package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class UserPasswordResetPage extends BasePage {
    public UserPasswordResetPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }
}
