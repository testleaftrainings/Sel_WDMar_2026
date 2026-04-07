package com.leaftaps.pages;

import org.openqa.selenium.By;

import com.leaftaps.base.ProjectSpecifcMethods;

public class HomePage extends  ProjectSpecifcMethods{

    public MyHomePage clickCRMSFAlink(){
    driver.findElement(By.linkText("CRM/SFA")).click();
    return new MyHomePage();
    }
}
