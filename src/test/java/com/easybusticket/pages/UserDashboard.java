package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Ismail Koembe
 */
@Slf4j
public class UserDashboard extends BasePage {
    public UserDashboard(){
        PageFactory.initElements(Driver.get("stage"),this);
    }



}
