package com.testng.sample;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethods{

 @BeforeTest //2nd
    public void runBeforeTest(){
		filePath ="CreateLead";
		System.out.println("Excel file path is choosen as "+filePath+".xlsx");

	}

 @Test(dataProvider="fetchData")
    public void runCreateLead(String cname,String fname, String lname, String phno){// parameterization principle  local variable name can be changed
                             // sequencial order should not be changed
	
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cname)) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
	}
}
