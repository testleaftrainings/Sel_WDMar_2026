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
System.out.println("Driver instance value IN TCOO1"+driver);//INSTANCE NO 1
        //singleton design pattern
        LoginPage user = new LoginPage(driver);// Parameterized constructor
        user.enterUserName()
            .enterPassword()
            .clickLoginButton()
            .clickCRMSFAlink();
    }
}
