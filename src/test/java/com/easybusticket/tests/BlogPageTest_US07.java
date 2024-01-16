package com.easybusticket.tests;

import com.easybusticket.pages.BlogPage;
import com.easybusticket.pages.HomePage;
import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class BlogPageTest_US07 extends BaseTest{

    @Test
    public void blogPageTest(){



        //The user can access all blogspots via blog link in the homepage

        BlogPage blogPage = new HomePage().clickToBlogTitle();

    }
}

