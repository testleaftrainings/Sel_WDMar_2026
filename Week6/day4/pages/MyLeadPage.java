package com.leaftaps.pages;

import org.openqa.selenium.By;
import com.leaftaps.base.ProjectSpecifcMethods;

import io.cucumber.java.en.When;

public class MyLeadPage extends ProjectSpecifcMethods {

    
    @When("I click Create Lead link")
    public CreateLeadPage clickCreateLead(){
        getDriver().findElement(By.linkText("Create Lead")).click();
        return new CreateLeadPage();
    }
     public void clickFindLead(){
        
    }
     public void clickMergeLead(){
     }
        

}
