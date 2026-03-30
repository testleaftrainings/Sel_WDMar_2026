package com.testng.sample;

import org.testng.annotations.Test;

public class LearnAttributes {

     @Test(priority=1,invocationCount=10, threadPoolSize=5)  //5th
    public void runCreateLeadTest() throws InterruptedException{
        System.out.println("lead created successfully");
        Thread.sleep(500); // 0.5*2(10tc)=> 1sec
    }

     @Test(priority=-3,enabled = false)
    public void runDeleteLeadTest(){
        System.out.println("lead deleted successfully");
    }
 @Test(priority=2) 
    public void runEditLeadTest() throws Exception{
        System.out.println("lead edited successfully");
        throw new Exception("testng exception");
    }

    @Test(dependsOnMethods={"runEditLeadTest"},alwaysRun = true)
    public void mergeLead(){
    System.out.println("lead is merged successfully");
    }




}
