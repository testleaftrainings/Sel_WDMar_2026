package com.leaftaps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.base.ProjectSpecifcMethods;

import io.cucumber.java.en.When;

public class MyLeadPage extends ProjectSpecifcMethods {

    public MyLeadPage(RemoteWebDriver driver) {
          this.driver=driver;
    }
    @When("I click Create Lead link")
    public CreateLeadPage clickCreateLead(){
        driver.findElement(By.linkText("Create Lead")).click();
        return new CreateLeadPage(driver);
    }
     public void clickFindLead(){
        
    }
     public void clickMergeLead(){
     }
        

}
