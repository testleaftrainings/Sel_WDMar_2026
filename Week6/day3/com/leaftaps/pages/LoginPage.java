package com.leaftaps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.base.ProjectSpecifcMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage  extends  ProjectSpecifcMethods{

    public LoginPage(RemoteWebDriver driver) {
       this.driver=driver; //TC // LOCAL
    }
    @Given("I enter the username as")
    public LoginPage enterUserName(){
    // PSM //GLOBAL  
     System.out.println("driver value From [Login Page] is "+driver); 
    driver.findElement(By.id("username")).sendKeys("DemoCsr");
    return this;
    }
    @Given("I enter the password as")
    public LoginPage enterPassword(){
    driver.findElement(By.id("password")).sendKeys("crmsfa");
     return this;
    }
    @When("I click login button")
    public HomePage clickLoginButton(){
    driver.findElement(By.className("decorativeSubmit")).click();
     return new HomePage(driver);
    }
}
