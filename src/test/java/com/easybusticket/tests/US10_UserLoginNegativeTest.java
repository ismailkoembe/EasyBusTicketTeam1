package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserLoginPage;
import com.easybusticket.utilities.Driver;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Slf4j
public class US10_UserLoginNegativeTest extends BaseTest {

    @DataProvider(name = "loginData")
    public Object[][] getLoginData(){
        return new Object[][] {
                {"ayse", "243085Asd."},
                {"asliekm", "567788K.k"},
                {"ayse","567788K.k"},
                {"",""}
        };
    }
    @Test (dataProvider = "loginData")
    @Severity(value = SeverityLevel.CRITICAL)
    @Description("User log in negative tests")
    public void loginAttemptWithInvalidInformationTest(String username, String password){
        UserLoginPage userLoginPage = new HomePage().clickToSignIn();
        userLoginPage.username_login.sendKeys(username);
        userLoginPage.password_login.sendKeys(password);
        userLoginPage.button_login.click();

        String expectedTitle = "Easy Bus Ticket - Sign In";
        String actualTitle = Driver.get(env).getTitle();
        softAssert.assertEquals(actualTitle, expectedTitle);
        softAssert.assertAll();

    }
}
