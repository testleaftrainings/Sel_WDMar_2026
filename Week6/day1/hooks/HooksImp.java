package hooks;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import steps.BaseClass;

/*

common configuration :
launching browser profile, launching application, automatically closing the brower
 */
public class HooksImp extends BaseClass {



    @Before
    public void preCondition(){
ChromeOptions chromeOption = new ChromeOptions();
      chromeOption.addArguments("--guest");
      driver= new ChromeDriver(chromeOption);
      System.out.println("driver value near hooks is "+driver);
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       driver.get("http://leaftaps.com/opentaps/control/login");
    }
    @After
    public void postCondition(){
        driver.close();
    }




}
