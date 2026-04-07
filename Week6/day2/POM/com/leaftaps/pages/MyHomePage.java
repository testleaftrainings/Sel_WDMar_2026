package com.leaftaps.pages;

import org.openqa.selenium.By;

import com.leaftaps.base.ProjectSpecifcMethods;

public class MyHomePage extends  ProjectSpecifcMethods {
 
    public MyLeadPage clickLeads(){
        driver.findElement(By.linkText("Leads")).click();
        return new MyLeadPage();
    
    }
     public void clickAccounts(){
        
    }
     public void clickContacts(){
        
    }
}
