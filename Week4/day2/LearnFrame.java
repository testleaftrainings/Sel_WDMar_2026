package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://leafground.com/frame.xhtml");// html 
        // NoSuchElementException:
        // frame() --> method name is same, but arugment type is differing ?
        // Method overloading : early binding / compile time polymorphism
        // type 1 : int index
        // type 2 : String idOrName
        // type 3 : WebElement locator
        driver.switchTo().frame(0);
        WebElement frame1 = driver.findElement(By.xpath("//button[@id='Click']"));
        frame1.click();
        Thread.sleep(1000);
        System.out.println(frame1.getText());
        // a) text will be changed to "Hurray! You Clicked Me."
        // b) Exception
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='page.xhtml']")));
        driver.switchTo().frame("frame2");//frame4
        driver.findElement(By.id("Click")).click();
        Thread.sleep(1000);
        String textOfFrame4 = driver.findElement(By.id("Click")).getText();
        System.out.println("changed text is :"+textOfFrame4);
        // a) text will be changed to "Hurray! You Clicked Me."
        // b) Exception --> NoSuchFrameException:
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        driver.close();
    }
}
