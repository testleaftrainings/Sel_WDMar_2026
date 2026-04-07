package com.leaftaps.testcases;

import org.testng.annotations.Test;

import com.leaftaps.base.ProjectSpecifcMethods;
import com.leaftaps.pages.LoginPage;

public class TC001_LoginTest extends ProjectSpecifcMethods {

    @Test
    public void runLoginTest(){
        // Builder Pattern
        // LoginPage user = new LoginPage();
        // user.enterUserName();
        // user.enterPassword();
        // user.clickLoginButton();
        // HomePage user1 = new HomePage();
        // user1.clickCRMSFAlink();

        //singleton design pattern
        LoginPage user = new LoginPage();
        user.enterUserName()
            .enterPassword()
            .clickLoginButton()
            .clickCRMSFAlink();
        


    }

}
