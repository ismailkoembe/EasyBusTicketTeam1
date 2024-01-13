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

<<<<<<< HEAD
=======
        //com.easybusticket.pages.BlogPage blogPage = new BlogPage();
>>>>>>> 9f42d9273ed60923cf68efb2e8e20ea3624fc377
        BlogPage blogPage = new HomePage().clickToBlogTitle();

    }
}

