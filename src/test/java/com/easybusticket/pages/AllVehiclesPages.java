package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class AllVehiclesPages {
    public AllVehiclesPages() {
        PageFactory.initElements(Driver.get("stage"), this);
    }
}
