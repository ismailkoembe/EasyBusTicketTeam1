// US06_TC01.java

package com.easybusticket.tests;

import com.easybusticket.pages.FaqPage;
import com.easybusticket.pages.HomePage;
//import com.easybusticket.pages.FaqPage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class US06_FAQPageAndContent extends BaseTest {

    @Test
    public void accessFaqPageAndVerifyContent() {
        // 1. Navigate to the homepage
        // 2. Click on a link/button to access the FAQ page
        FaqPage faqPage =new HomePage().clickToFaqTitle();

        // 3. Verify that the FAQ page is displayed
        faqPage.faqItemExistTest();

        log.info("FAQ item is exist and env is: " + env);
        // 4. Verify the content of FAQ questions and answers

        faqPage.faqItemContentTest();

        log.info("FAQ item has item and content: " + env);

    }
}
