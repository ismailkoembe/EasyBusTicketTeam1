package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class AllCounterPage {
    public AllCounterPage() {
        PageFactory.initElements(Driver.get("stage"), this);
    }
}
