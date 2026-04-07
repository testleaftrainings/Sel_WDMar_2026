package steps;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClass extends AbstractTestNGCucumberTests {
public static RemoteWebDriver driver;

@BeforeMethod
public void preCondition(){
ChromeOptions chromeOption = new ChromeOptions();
      chromeOption.addArguments("--guest");
      driver= new ChromeDriver(chromeOption);
      System.out.println("driver value near hooks is "+driver);
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       driver.get("http://leaftaps.com/opentaps/control/login");
    }

@AfterMethod
public void postCondition(){
        driver.close();
    }


}
