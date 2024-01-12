package com.easybusticket.pages;

import com.easybusticket.utilities.Driver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Slf4j
public class BlogPage extends BasePage{

    public BlogPage(){
        PageFactory.initElements(Driver.get("stage"),this);
    }

    public void BlogPageTest(){
        BlogPage blogPage = new HomePage().clickToBlogTitle();
        blogPage.titleBlogPage();

        log.info("Blog page pages downloaded "+env);
    }

    public void titleBlogPage(){

        String expectedBlogTitle = " Easy Bus Ticket - Blog";
        String actualBlogTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualBlogTitle,expectedBlogTitle);
        softAssert.assertAll();

    }

}
