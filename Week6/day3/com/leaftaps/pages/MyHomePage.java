package com.leaftaps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.base.ProjectSpecifcMethods;

import io.cucumber.java.en.When;

public class MyHomePage extends  ProjectSpecifcMethods {
 
    public MyHomePage(RemoteWebDriver driver) {
        this.driver=driver;
    }
    @When("I click Leads link")
    public MyLeadPage clickLeads(){
        driver.findElement(By.linkText("Leads")).click();
        return new MyLeadPage(driver);
    
    }
     public void clickAccounts(){
        
    }
     public void clickContacts(){
        
    }
}
