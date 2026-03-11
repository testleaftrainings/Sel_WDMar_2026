package week2.day3;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomateLeaftaps {
    /*test steps :
    1)enter username as "demosalesmanager"
    2)enter password as "crmsfa"
    3)click the login button 
     */
    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        //driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        /*acceptance criteria : 
-> using valid credentials, system should allow the user to enter the application, by redirecting the user to the home page
-> using invalid credentials, system should not allow the user to access the application
         */
        driver.close();
    }

}
