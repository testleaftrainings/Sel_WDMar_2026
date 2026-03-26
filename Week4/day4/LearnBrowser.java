package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnBrowser {
    public static void main(String[] args) {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("guest");
    options.addArguments("--headless");
    ChromeDriver driver = new ChromeDriver(options);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.manage().window().maximize();
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
    driver.findElement(By.partialLinkText("CRM/SFA")).click();
    System.out.println(driver.getTitle());
    System.out.println("The execution completed successfully in the headless mode");
     driver.close();
    }

}
