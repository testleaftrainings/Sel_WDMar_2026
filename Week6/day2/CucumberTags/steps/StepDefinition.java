package steps;


import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//InvalidMethodException: You're not allowed to extend classes that define Step Definitions or hooks
public class StepDefinition extends BaseClass{
//RemoteWebDriver driver ;
String cName; // declaration is done here // Global
    // every feature step should be mapped here , as a individual java methods // 6
    // UndefinedStepException --> terminal
// @Given("I launch the browser")
// public void i_launch_the_browser() {
//       ChromeOptions chromeOption = new ChromeOptions();
//       chromeOption.addArguments("--guest");
//       driver= new ChromeDriver(chromeOption);
//       driver.manage().window().maximize();
//       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
// }
// @Given("I load the application url")
// public void i_load_the_application_url() {
//     driver.get("http://leaftaps.com/opentaps/control/login");
// }
@Given("I enter the username as {string}")
public void i_enter_the_username_as_democsr(String userName) {
    System.out.println("driver value near steps is "+driver);
    driver.findElement(By.id("username")).sendKeys(userName);	
}
@Given("I enter the password as {string}")
public void i_enter_the_password_as_crmsfa(String password) {
    driver.findElement(By.id("password")).sendKeys(password);
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

@When("I click {string} link")
public void i_click_crm_sfa_link(String anchorText) {
    driver.findElement(By.linkText(anchorText)).click();	
}
@Given("I enter Company Name as {string}")
public void i_enter_company_name_as(String cName) { //local variable
    this.cName = cName;// initialization is done here
   driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
}
@Given("I enter First name as {string}")
public void i_enter_first_name_as(String fname) {
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
}
@Given("I enter Last name as {string}")
public void i_enter_last_name_as(String lname) {
    driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
}
@When("I click Create Lead button")
public void i_click_create_lead_button() {
   driver.findElement(By.name("submitButton")).click();
}
@Then("I should view The Lead created with the Company")
public void i_should_view_the_lead_created_with_the_company_as() {
    String expectedValue=cName;
    String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
    String[] actualValue = text.split(" ");
    Assert.assertEquals(actualValue[0], expectedValue);
}

@Given("I enter Phone Number as {string}")
public void enterPhNo(String phno){
    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);	
}

@Then("I should view error message as parameter is missing")
public void verifyTheErrorMessage(){
   String expectedValue="The Following Errors Occurred:";
   String actualValue = driver.findElement(By.className("errorMessageHeader")).getText();
   Assert.assertEquals(actualValue, expectedValue);
}


// @Given("I load the application url")
// public void i_load_application_url() {
//     driver.get("http://leaftaps.com/opentaps/control/login");
// }  DuplicateStepDefinitionException ---> terminal

}
