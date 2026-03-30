package com.testng.sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ProjectSpecificMethods {
    ChromeDriver driver ; // global declaration

    @BeforeMethod
	public void precondtions(){
	    ChromeOptions options = new ChromeOptions();
        options.addArguments("guest");
        driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
    }

    @AfterMethod
    public void postConditions(){
        driver.close();
    }
    @BeforeSuite// 1st 
    public void runBeforeSuite(){
    System.out.println("BeforeSuite executed here");
    }
    @AfterSuite
      public void runAfterSuite(){
        System.out.println("AfterSuite executed here");
    }

    @AfterTest
      public void runAfterTest(){
        System.out.println("AfterTest executed here");

    }
    @BeforeTest //2nd
    public void runBeforeTest(){
        System.out.println("BeforeTest executed here");

    }
    @AfterClass
    public void runAfterClass(){
        System.out.println("AfterClass executed here");

    }
    @BeforeClass//3rd
    public void runBeforeClass(){
        System.out.println("BeforeClass executed here");

}
}