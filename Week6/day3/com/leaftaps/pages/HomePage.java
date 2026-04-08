package com.leaftaps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.leaftaps.base.ProjectSpecifcMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage extends  ProjectSpecifcMethods{

    public HomePage(RemoteWebDriver driver) {
         this.driver=driver;
    }

    @Then("I should be redirected to the home page")
public HomePage i_should_be_redirected_to_the_home_page() {
    String expectedValue="Leaftaps - TestLeaf Automation Platform";
    String actualValue = driver.getTitle();
    Assert.assertEquals(actualValue, expectedValue);
    return this;
}

    @When("I click CRM\\/SFA link")
    public MyHomePage clickCRMSFAlink(){
    driver.findElement(By.linkText("CRM/SFA")).click();
    return new MyHomePage(driver);
    }
}
