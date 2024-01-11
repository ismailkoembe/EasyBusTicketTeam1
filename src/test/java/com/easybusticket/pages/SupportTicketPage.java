package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class SupportTicketPage extends BasePage{
    public SupportTicketPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }
}
