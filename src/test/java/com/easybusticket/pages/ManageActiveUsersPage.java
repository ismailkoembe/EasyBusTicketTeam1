package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class ManageActiveUsersPage {
    public ManageActiveUsersPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }
}
