package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnXpath {
public static void main(String[] args) {
    FirefoxDriver driver = new FirefoxDriver();
    driver.navigate().to("http://leaftaps.com/opentaps/control/login");
    String labelName = driver.findElement(By.xpath("//label[@for='username']")).getText();
    System.out.println(labelName);
    // text based xpath
    String labelName2 = driver.findElement(By.xpath("//label[text()='Password']")).getText();
    System.out.println(labelName2);
    // attribute based xpath
    driver.findElement(By.xpath("//input[@class='inputLogin']")).sendKeys("demosalesmanager");
    // collection based xpath
    driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
    // partial match based xpath
    driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
}
}
