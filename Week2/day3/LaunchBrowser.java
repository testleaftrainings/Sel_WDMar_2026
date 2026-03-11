package week2.day3;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        // Command Executable Request[CER]
        // Set the path for the ChromeDriver executable
       // ChromeDriver driver = new ChromeDriver();
       FirefoxDriver driver = new FirefoxDriver();
        // webdriver methods
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
        driver.close();
    }
}
