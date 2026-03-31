package com.testng.sample;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethods{

// data-driven Testing
@DataProvider(name="fetchData")
public String[][] getTestData(){
	String[][] data = new String[3][4]; //2d array --> 0-->NULL,1-->NULL,2-->NULL
	// [LS]-->ROW [3] [RS]--> COLUMN/FIELD[4]

	// DAT SET NO.1
	data[0][0]="Testleaf";
	data[0][1]="Bhuvanesh";
	data[0][2]="Moorthy";
	data[0][3]="98127";

	// DAT SET NO.2
	data[1][0]="Qeagle";
	data[1][1]="Vinoth";
	data[1][2]="Shanmugam";
	data[1][3]="98128";

	// DAT SET NO.3
	data[2][0]="TCS";
	data[2][1]="Harrish";
	data[2][2]="A";
	data[2][3]="98129";
	return data;

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
