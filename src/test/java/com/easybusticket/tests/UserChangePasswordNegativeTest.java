package com.easybusticket.tests;

import com.easybusticket.pages.HomePage;
import com.easybusticket.pages.UserLoginPage;
import com.easybusticket.utilities.Driver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserChangePasswordNegativeTest {

    @DataProvider(name = "changePassword")
    public Object[][] changeData(){
        return new Object[][] {
                {"567788K.k", "243085Asd."},
                {"", "243085Asd."},
                {"ayse","567788K.k"},
                {"",""}
        };
    }
    @Test(dataProvider = "changePassword")
    public void userChangePasswordNegativeTest(String currentPassword, String newPassword){
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

}
