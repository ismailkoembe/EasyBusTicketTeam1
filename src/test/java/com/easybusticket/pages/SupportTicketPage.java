package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.support.PageFactory;
@Slf4j
public class SupportTicketPage extends BasePage{
    public SupportTicketPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }
}
