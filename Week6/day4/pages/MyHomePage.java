package com.leaftaps.pages;

import org.openqa.selenium.By;

import com.leaftaps.base.ProjectSpecifcMethods;

import io.cucumber.java.en.When;

public class MyHomePage extends  ProjectSpecifcMethods {
 
    
    @When("I click Leads link")
    public MyLeadPage clickLeads(){
        getDriver().findElement(By.linkText("Leads")).click();
        return new MyLeadPage();
    
    }
     public void clickAccounts(){
        
    }
     public void clickContacts(){
        
    }
}
