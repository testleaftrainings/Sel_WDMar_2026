package com.testng.sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnAnnotations {

    @Test(priority=2)  //5th
    public void runCreateLeadTest(){
        System.out.println("lead created successfully");
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
    @BeforeMethod// 4th
    public void runBeforeMethod(){
        System.out.println("BeforeMethod executed here");
    }
    @AfterMethod ////6th
    public void runAfterMethod(){
        System.out.println("AfterMethod executed here");
    }
     @Test(priority=1) 
    public void runDeleteLeadTest(){
        System.out.println("lead deleted successfully");
    }




}
