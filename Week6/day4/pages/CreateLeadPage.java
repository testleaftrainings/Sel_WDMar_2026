package com.leaftaps.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.leaftaps.base.ProjectSpecifcMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class CreateLeadPage extends  ProjectSpecifcMethods {


    @Given("I enter Company Name as {string}")
    public CreateLeadPage enterCompanyName(String cname){
        getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
        return this;
    }
    @Given("I enter First name as {string}")
    public CreateLeadPage enterFirstName(String fname){
        getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
        
    }
    @Given("I enter Last name as {string}")
    public CreateLeadPage enterLastName(String lname){
        getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
        return this;
    }

    @Given("I enter Phone Number as {string}")
public CreateLeadPage i_enter_phone_number_as(String phno) {
    getDriver().findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);	
     return this;
}

@When("I should view error message as parameter is missing")
public CreateLeadPage i_should_view_error_message_as_parameter_is_missing() {
    String expectedValue="The Following Errors Occurred:";
   String actualValue = getDriver().findElement(By.className("errorMessageHeader")).getText();
   Assert.assertEquals(actualValue, expectedValue);
    return this;
}
@When("I click Create Lead button")
    public ViewLeadPage clickCreateLeadButton(){
        getDriver().findElement(By.name("submitButton")).click();
        return new ViewLeadPage();
        
    }

}
