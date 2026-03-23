package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LearnWindowHandling {

    public static void main(String[] args) throws InterruptedException {
        RemoteWebDriver driver = new ChromeDriver();
        driver.navigate().to("https://leafground.com/window.xhtml");
        driver.manage().window().maximize();
        // global waits  -->  findElement() and findElements() // flexible Selenium wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));// max timeout --> NoSuchElementException
        Thread.sleep(2000);// --> fixed java wait
        driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
        //The name of the window or the handle as returned by WebDriver.getWindowHandle()
        String parentWindowId = driver.getWindowHandle();// the current window handle
        System.out.println("parent Window Id is : "+parentWindowId); // the current window handle id
        Set<String> getWindow = driver.getWindowHandles();
         // convert set into list   
        List<String> fetchWindhow = new ArrayList<>(getWindow);
        // for (String windowHandlerId : getWindow) {
        //     System.out.println(windowHandlerId);
        //     if(windowHandlerId!=parentWindowId){
        //     driver.switchTo().window(windowHandlerId);
        //     }
        //  }
         //  parent id : 8C8BA0D0D6AFC0889405D0071EEF313B // 0
         //  child id :  CBFF7A93090CDC88C1E27E2F130BE37B // 1
        // the recently opened window handle id
        String childWindowId = fetchWindhow.get(1);
        driver.switchTo().window(childWindowId);
        // driver.switchTo().window("Title of the window") // NoSuchWindowException
        System.out.println(driver.getTitle());// dashboard
        // driver.close() --->  the current window will only be closed
        // //NoSuchWindowException
        // driver.switchTo().window(fetchWindhow.get(0)); --> Shifting driver focus back to parent window
        // System.out.println(driver.getTitle());// window
        driver.quit();// Quits this driver, closing every associated window.
    }
}
