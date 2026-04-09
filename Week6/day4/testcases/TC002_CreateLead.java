package com.leaftaps.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.leaftaps.base.ProjectSpecifcMethods;
import com.leaftaps.pages.LoginPage;

public class TC002_CreateLead  extends ProjectSpecifcMethods{

    @BeforeClass
    public void enterFilePath(){
        filename="CreateLead";
        System.out.println("Excel file path is choosen as "+filename+".xlsx");
    }


    @Test(dataProvider="fetchData")
    public void runCreateLead(String uname, String pword,String cname, String fname,String lname,String verifyLead){
        System.out.println("Driver instance value IN TCOO2"+getDriver()); //INSTANCE NO 2
        //singleton design pattern
        LoginPage user = new LoginPage();
        user.enterUserName(uname)
            .enterPassword(pword)
            .clickLoginButton()
            .clickCRMSFAlink()
            .clickLeads()
            .clickCreateLead()
            .enterCompanyName(cname)
            .enterFirstName(fname)
            .enterLastName(lname)
            .clickCreateLeadButton()
            .verifyLead(verifyLead);
    }

}
