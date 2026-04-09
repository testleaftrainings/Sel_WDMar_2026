package com.leaftaps.pages;

import org.openqa.selenium.By;

import com.leaftaps.base.ProjectSpecifcMethods;

import io.cucumber.java.en.Then;

public class ViewLeadPage extends  ProjectSpecifcMethods {


    @Then("I should view The Lead created with the Company as {string}")
    public void verifyLead(String verifyCompanyName){

        String text = getDriver().findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(verifyCompanyName)){
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
        
    }

}
