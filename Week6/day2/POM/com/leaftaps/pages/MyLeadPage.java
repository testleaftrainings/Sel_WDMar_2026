package com.leaftaps.pages;

import org.openqa.selenium.By;

import com.leaftaps.base.ProjectSpecifcMethods;

public class MyLeadPage extends ProjectSpecifcMethods {

    public CreateLeadPage clickCreateLead(){
        driver.findElement(By.linkText("Create Lead")).click();
        return new CreateLeadPage();
    }
     public void clickFindLead(){
        
    }
     public void clickMergeLead(){
     }
        

}
