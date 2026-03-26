package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitlyWait {
    public static void main(String[] args) {

         RemoteWebDriver driver = new ChromeDriver();
        driver.navigate().to("https://leafground.com/window.xhtml");
        driver.manage().window().maximize();
        // syntax : explicit wait 
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement button = driver.findElement(By.xpath("//span[contains(text(),'delay')]"));
        String title = (String) ((JavascriptExecutor) driver).executeScript("return document.title;");
        System.out.println(title);
        driver.executeScript("arguments[0].click()", button);
        // Expected condition 
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        driver.quit();
    }
}
