package week7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExpectionHandling {
    public static void main(String[] args) {
        //surround with try/catch block
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.get("https://leafground.com/checkbox.xhtml");
     By checkbox =By.xpath("//span[@class='ui-chkbox-']");
     try {
        driver.findElement(checkbox).click();     
     } catch (ElementClickInterceptedException e){
        System.out.println("exception which struck at runtime in catch1 is "+e);
        WebElement element =driver.findElement(checkbox);
        wait.until(ExpectedConditions.visibilityOf(element));
        driver.executeScript("arguments[0].click()", element);
     }catch(NoSuchElementException e){
        System.out.println("exception which struck at runtime in catch2 is "+e);
        By locator = By.xpath("//span[text()='Basic']");
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
         //An expectation for checking that an element is present on the DOM of a page
        WebElement element =driver.findElement(locator);
        driver.executeScript("arguments[0].click()", element);
       
     }
     finally {
         System.out.println("--Finally block executed---");
         boolean basicCbSelected = driver.findElement(By.xpath("//span[text()='Basic']/preceding::input[@type='checkbox']")).isSelected();
         System.out.println("Selected status of the checkbox : "+basicCbSelected);
         driver.close();
     }    
    }


}
