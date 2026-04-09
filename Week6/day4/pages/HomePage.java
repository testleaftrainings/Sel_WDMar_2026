package com.leaftaps.pages;


import org.openqa.selenium.By;
import org.testng.Assert;

import com.leaftaps.base.ProjectSpecifcMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage extends  ProjectSpecifcMethods{


    @Then("I should be redirected to the home page")
public HomePage i_should_be_redirected_to_the_home_page() {
    String expectedValue="Leaftaps - TestLeaf Automation Platform";
    String actualValue = getDriver().getTitle();
    Assert.assertEquals(actualValue, expectedValue);
    return this;
}

    @When("I click CRM\\/SFA link")
    public MyHomePage clickCRMSFAlink(){
    getDriver().findElement(By.linkText("CRM/SFA")).click();
    return new MyHomePage();
    }
}
