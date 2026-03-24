package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

    public static void main(String[] args) throws InterruptedException {
        
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://leafground.com/alert.xhtml");
        // simple modal alert 
        // NoAlertPresentException
         driver.findElement(By.xpath("//span[@id='simple_result']/preceding-sibling::button")).click();
         Alert alert = driver.switchTo().alert();
        // model cannot be ignored --> UnhandledAlertException
        alert.accept();
        //Thread.sleep(2000);
        // confirm modal alert
        driver.findElement(By.xpath("//span[@id='result']/preceding-sibling::button")).click();
        //Thread.sleep(2000);
        alert.dismiss();
        // prompt alert
        driver.findElement(By.xpath("//span[@id='confirm_result']/preceding-sibling::button")).click();
        //Thread.sleep(2000);
        // get information displaying in the alert
        System.out.println(alert.getText());
        // send the user data to the alert 
        alert.sendKeys("Bhuvanesh");
        // Accept the alert
        alert.accept();
        driver.quit();
    }

}
