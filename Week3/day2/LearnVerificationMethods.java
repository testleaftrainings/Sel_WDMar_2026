package week3.day2;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnVerificationMethods{
    public static void main(String[] args) throws InterruptedException {
       // ChromeDriver driver = new ChromeDriver();
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://leafground.com/checkbox.xhtml;");
       boolean basicCb = driver.findElement(By.xpath("//span[text()='Basic']/preceding::input[@type='checkbox']")).isEnabled();
       if(basicCb){
        driver.findElement(By.xpath("//span[text()='Basic']")).click();
       }
       boolean basicCbSelected = driver.findElement(By.xpath("//span[text()='Basic']/preceding::input[@type='checkbox']")).isSelected();
       System.out.println("Selected status of the checkbox : "+basicCbSelected);
       Thread.sleep(3000);
       driver.close();
    }

}
