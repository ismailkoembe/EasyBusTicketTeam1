package com.easybusticket.tests;

import com.easybusticket.pages.BlogPage;
import com.easybusticket.pages.HomePage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class US07_BlogPageTest extends BaseTest{

    @Test
    @Severity(value = SeverityLevel.MINOR)
    @Description("The user visualize blogspots")
    public void blogPageTest(){



        //The user can access all blogspots via blog link in the homepage

        BlogPage blogPage = new HomePage().clickToBlogTitle();

    }
}

