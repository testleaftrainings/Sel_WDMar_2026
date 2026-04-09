package com.leaftaps.base;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.leaftaps.utils.DataLibrary;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class ProjectSpecifcMethods extends AbstractTestNGCucumberTests {
    //public  RemoteWebDriver driver;//NULL
    public static String filename; //null
    private static final ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();// driver
    // setter
    public void setDriver(RemoteWebDriver lDriver){
        driver.set(lDriver);
    }
    // getter 
    public RemoteWebDriver getDriver(){
        return driver.get();
    }

@Parameters({"url","browserName","profile"})    
@BeforeMethod
public void preCondition(String url, String browserName, String profile){
        System.out.println("browser opted for this execution is "+browserName );                     
        System.out.println("browser profile opted for the execution is "+profile );
        System.out.println("Application url is "+url);

    // Cross browser Testing
     switch (browserName.toLowerCase()) {
            case "chrome":
               ChromeOptions chromeOption = new ChromeOptions();
                chromeOption.addArguments(profile);
                setDriver(new ChromeDriver(chromeOption));
                break;

            case "firefox":
                FirefoxOptions firefoxOption = new FirefoxOptions();
                firefoxOption.addArguments(profile); 
                setDriver(new FirefoxDriver(firefoxOption));
                break;
            
            default:
                ChromeOptions defaultOption = new ChromeOptions();
                defaultOption.addArguments(profile);
                setDriver(new ChromeDriver(defaultOption)); //default browser
                break;
        }
      System.out.println("driver value near [PSM] is "+getDriver());
      getDriver().manage().window().maximize();
      getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      getDriver().get(url);
    }

@AfterMethod
public void postCondition(){
        getDriver().quit();
    }

    // data-driven Testing
@DataProvider(name="fetchData")
public String[][] getTestData() throws IOException{
	
	return DataLibrary.readDataFromExcel(filename);

}
}


