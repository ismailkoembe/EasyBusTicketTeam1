package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.support.PageFactory;

@Slf4j
public class BlogPage extends BasePage{

    public BlogPage(){
        PageFactory.initElements(Driver.get("stage"),this);
    }

    public void blogPageTest(){
        BlogPage blogPage = new HomePage().clickToBlogTitle();
        blogPage.titleBlogPage();


    }

    public void titleBlogPage(){

        String expectedBlogTitle = " Easy Bus Ticket - Blog";
        String actualBlogTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualBlogTitle,expectedBlogTitle);
        softAssert.assertAll();
        log.info("Blog page pages downloaded ");
    }

}
