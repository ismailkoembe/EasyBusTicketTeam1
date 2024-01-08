package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Ismail Koembe
 */
public class TermsAndConditions extends BasePage {
    public TermsAndConditions(){
        PageFactory.initElements(Driver.get("stage"),this);
    }
}
