package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnBasicLocators {
    public static void main(String[] args) {
        String expectedTitleOfPage ="Leaftaps - TestLeaf Automation Platform";
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
        //driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        String titleOfPage = driver.getTitle();
        if(titleOfPage.equals(expectedTitleOfPage)){
            System.out.println("Title is same");
        }else{
            System.out.println("Title is not same");
        }
        driver.findElement(By.partialLinkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        WebElement createLeadFormPage = driver.findElement(By.linkText("Create Lead"));
        String subMenuName =createLeadFormPage.getText();
        System.out.println(subMenuName);
        createLeadFormPage.click();
         // way 2 : if we see the <select> tag --> selectByIndex(int index),selectByValue(String value)
         WebElement selectSourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
         Select selectObj = new Select(selectSourceDD);
       //selectObj.selectByValue("LEAD_EMPLOYEE");//selectByValue(String value)
         selectObj.selectByIndex(4);
         WebElement selectmarketingCampaignDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
         Select selectMcdd = new Select(selectmarketingCampaignDD);
         selectMcdd.selectByVisibleText("Automobile"); 
         //org.openqa.selenium.NoSuchElementException: Cannot locate option with text: Automobile
        driver.close();

    }
}
