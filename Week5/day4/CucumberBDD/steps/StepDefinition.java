package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
RemoteWebDriver driver ;
    // every feature step should be mapped here , as a individual java methods // 6
    // UndefinedStepException --> terminal
    @Given("I launch the browser")
public void i_launch_the_browser() {
      ChromeOptions chromeOption = new ChromeOptions();
      chromeOption.addArguments("--guest");
                driver= new ChromeDriver(chromeOption);
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
}
@Given("I load the application url")
public void i_load_the_application_url() {
    driver.get("http://leaftaps.com/opentaps/control/login");
}
@Given("I enter the username as demosalesmanager")
public void i_enter_the_username_as_demosalesmanager() {
    driver.findElement(By.id("username")).sendKeys("demosalesmanager");	
}
@Given("I enter the password as crmsfa")
public void i_enter_the_password_as_crmsfa() {
    driver.findElement(By.id("password")).sendKeys("crmsfa");
}
@When("I click login button")
public void i_click_login_button() {
    driver.findElement(By.className("decorativeSubmit")).click();
}
@Then("I should be redirected to the home page")
public void i_should_be_redirected_to_the_home_page() {
   String expectedValue="Leaftaps - TestLeaf Automation Platform";
   String actualValue = driver.getTitle();
   Assert.assertEquals(actualValue, expectedValue);
}

}
