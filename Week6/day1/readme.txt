Static Parameterization IMPLEMENTATION – STEPS in Cucumber
=========================================================

1.Open an existing  .feature file 
2.Pass fixed values directly in the scenario steps
ex:---
 Given user enters username as 'DemoSalesManager'
3.In Step Definition File ,Use parameter placeholders {string}
4.Capture values as method arguments
ex:---
 @Given("user enters username as {string}")
	public void user_enters_username(String userName) {
		driver.findElement(By.id("username")).sendKeys(userName);
	}


=========================================================
Dynamic Parameterization IMPLEMENTATION – STEPS in Cucumber 
---------------------------------------------------------
Scenario Outline with Examples
---

Feature File – Steps to Follow

1. Change Scenario to Scenario Outline
2. Replace hardcoded values with angle-bracket placeholders
3. Create an Examples table
4. Add multiple rows of test data
5. Ensure column names match placeholders

for reference :----
Scenario Outline: User tries to create a new Lead by filling the mandatory fields

    Given user enters Company Name as '<cname>'
    And user enters First name as '<fname>'
    And user enters Last name as '<lname>'
    
  Examples: 
   |cname|fname|lname|
   |Qeagle|Bhuvanesh|M|
   |Testleaf|Harrish|A|
   |Qualitest|Vineeth|R|
---

Step Definition File – Steps to Follow

1. Use the same step definition used for static Parameterization 
2. Capture values using string placeholders
3. Receive different values for each execution
4. No change required in step definition logic


---------------------------------------------------------
HOOK IMPLEMENTATION – STEPS in Cucumber
=========================================================

1.Create a HooksImplementation class inside hooks package
2.Mark the class as part of Cucumber execution
ex :---
@CucumberOptions(features = {"src/test/java/features"}, 
glue = {"steps","hooks"})
3.Add a Before & After Hook annotation inside  HooksImplementation class 
4.Decide what action should run before every scenario & should run after every scenario
(example: launch browser, open application , close browser)
5.Create CommonBase class  inside steps package, move the driver declaration from StepDefinition Class to CommonBase Class
6.Make driver variable as static
7.StepDefinition Class and HooksImplementation class should inherit CommonBase


---------------------------------------------------------
TestNG IMPLEMENTATION – STEPS in Cucumber
=========================================================


1.Exclude the hooks package from  Cucumber execution
ex :--- 
@CucumberOptions(features = {"src/test/java/features"}, 
glue = {"steps"})
2.In CommonBase Class Declare two methods precondition and postCondition with TestNG annotations @BeforeMethod and @AfterMethod move common actions here (example: launch browser, open application , close browser)
3.Runner class should inherit CommonBase
4.CommonBase should inherit AbstractTestNGCucumberTests


=========================================================