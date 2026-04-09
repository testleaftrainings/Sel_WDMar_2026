package com.leaftaps.testcases;

import org.testng.annotations.Test;

import com.leaftaps.base.ProjectSpecifcMethods;
import com.leaftaps.pages.LoginPage;

public class TC001_LoginTest extends ProjectSpecifcMethods {

    @Test
    public void runLoginTest(){
        System.out.println("Driver instance value IN TCOO1"+getDriver());//INSTANCE NO 1
        //singleton design pattern
        LoginPage user = new LoginPage();
        user.enterUserName("demosalesmanager")
            .enterPassword("crmsfa")
            .clickLoginButton()
            .clickCRMSFAlink();
    }
}
