package com.leaftaps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.base.ProjectSpecifcMethods;

import io.cucumber.java.en.Then;

public class ViewLeadPage extends  ProjectSpecifcMethods {

    public ViewLeadPage(RemoteWebDriver driver) {
          this.driver=driver;
    }

    @Then("I should view The Lead created with the Company")
    public void verifyLead(){

        String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
        
    }

}
