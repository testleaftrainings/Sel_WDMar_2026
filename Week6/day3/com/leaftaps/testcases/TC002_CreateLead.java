package com.leaftaps.testcases;

import org.testng.annotations.Test;

import com.leaftaps.base.ProjectSpecifcMethods;
import com.leaftaps.pages.LoginPage;

public class TC002_CreateLead  extends ProjectSpecifcMethods{

    @Test
    public void runCreateLead(){
        System.out.println("Driver instance value IN TCOO2"+driver); //INSTANCE NO 2
        //singleton design pattern
        LoginPage user = new LoginPage(driver);
        user.enterUserName()
            .enterPassword()
            .clickLoginButton()
            .clickCRMSFAlink()
            .clickLeads()
            .clickCreateLead()
            .enterCompanyName()
            .enterFirstName()
            .enterLastName()
            .clickCreateLeadButton()
            .verifyLead();
    }

}
