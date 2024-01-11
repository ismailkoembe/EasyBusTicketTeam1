package com.easybusticket.tests;

import com.easybusticket.pages.AboutPage;
import com.easybusticket.pages.BlogPage;
import com.easybusticket.pages.HomePage;
import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class US07_TC01 extends BaseTest{

    @Test
    public void titleBlogPage(){

        String expectedBlogTitle = " Easy Bus Ticket - Blog";
        String actualBlogTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualBlogTitle,expectedBlogTitle);


    }
}




