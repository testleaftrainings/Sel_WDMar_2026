package week4.day3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseAction {

    public static void main(String[] args) throws IOException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://www.myntra.com");
        // mouse event : hovering action
        Actions action = new Actions(driver);
        // Moves the mouse to the middle of the element.
        action
        .moveToElement(driver.findElement(By.xpath("//a[text()='Men']")))
        .pause(1000)
        .moveToElement(driver.findElement(By.xpath("//a[text()='Women']")))
        .pause(1000)
        .click(driver.findElement(By.xpath("//a[text()='Kurtas & Suits']")))
        .perform();
        // Scroll to the bottom of the page - keyboard event
        // action
        // .keyDown(Keys.PAGE_DOWN)//Performs a modifier key press
        // .keyUp(Keys.PAGE_DOWN) //Performs a modifier key release
        // .pause(1000)
        // .keyDown(Keys.PAGE_DOWN)//Performs a modifier key press
        // .keyUp(Keys.PAGE_DOWN) //Performs a modifier key release
        // .pause(1000)
        // .keyDown(Keys.PAGE_DOWN)//Performs a modifier key press
        // .keyUp(Keys.PAGE_DOWN) //Performs a modifier key release
        // .pause(1000)
        // .perform();
        // Scroll to the bottom of the page - Mouse event
        action.scrollToElement(driver.findElement(By.xpath("//a[text()=' Contact Us ']"))).perform();


        // requirement : to capture the screen while the mouse focus is at the bottom of the page
        // take a screenshot during the execution of the automation script 
        // step 1 : we have to choose our file type 		
        File src = driver.getScreenshotAs(OutputType.FILE); //Capture the screenshot and store it in the specified location temp/cache.
        // step 2 : we have to create a folder provided the extension for the target file 
        // File class-- . name of the folder / name of the snapshot . image format		
        File target = new File("./snap/myntra.png");
        // step 3 : we are merging the source file with the destination file using the Apache.commons.io
        FileUtils.copyFile(src, target); //This method copies the contents of the specified source file to the specified destination file.

        driver.close();


    }

}
