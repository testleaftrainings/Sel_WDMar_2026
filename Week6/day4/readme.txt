Title: POM + Cucumber + TestNG + Excel Framework Setup

Objective
step-by-step instructions to set up and execute the Selenium automation framework using Page Object Model, Cucumber, TestNG, and Excel data-driven approach.

Prerequisites

* Java JDK 17 or above
* Maven installed and configured
* IDE (VS Code / IntelliJ / Eclipse)
* Chrome / Firefox browsers


Project Setup Steps

1. Create Maven Project

* Create a new Maven project named PageObjectModel
* Default folder structure will be created:
  src/main/java
  src/test/java

2. Package Structure

Under src/test/java create:

* com.leaftaps.base → Base class (driver setup, teardown, DataProvider)
* com.leaftaps.features → Cucumber feature files
* com.leaftaps.pages → Page Object classes
* com.leaftaps.runner → Cucumber runner class
(optional hybrid):
* com.leaftaps.testcases → TestNG test classes

3. Feature File

* Location: com.leaftaps.features
* File: FN001_LoginFunction.feature
* Contains Gherkin scenarios (Given, When, Then)

4. Page Classes

* Location: com.leaftaps.pages
* Classes: LoginPage, HomePage, MyHomePage, MyLeadsPage, CreateLeadPage, ViewLeadPage
* Each class represents one page and contains actions

5. Base Class (ProjectSpecificMethods)

Responsibilities:

* Driver initialization (Chrome/Firefox)
* Thread-safe driver using ThreadLocal
* URL launch
* Teardown after execution
* DataProvider for Excel

Key Methods:

* @BeforeMethod → Launch browser + navigate URL
* @AfterMethod → Close browser
* @DataProvider(fetchData) → Read data from Excel

Example Usage:
@DataProvider(name="fetchData")
public String[][] getTestData() throws IOException{
return DataLibrary.readDataFromExcel(filename);
}

6. Runner Class

* Location: com.leaftaps.runner
* Purpose: Execute feature files
* Configures:

  * Feature path
  * Glue code (step definitions)
  * Reporting

7. Excel Data-Driven Setup

Steps:

* Create a package: com.leaftaps.utils
* Add DataLibrary class (Excel reader)
* Create a data folder → store Excel files
* Declare filename in base class
* Use @DataProvider to fetch data

Flow:
TestNG → DataProvider → DataLibrary → Excel → Test

================================================================================
                    PARAMETERIZATION STEPS (TestNG + Excel)
================================================================================

SEQUENTIAL STEPS:
--------------------------------------------------------------------------------

STEP 1: Create utils package and add DataLibrary class

STEP 2: Create data folder and Excel file

STEP 3: Declare filename globally in base class in PSM Class

STEP 4: Create @DataProvider method in PSM Class

STEP 5: Use dataProvider in @Test annotation in Testcase Classes

STEP 6: Replace hardcoded values with parameters in Testcase Classes

STEP 7: Use @BeforeClass to set Excel file name in Testcase Classes

================================================================================

Example:
@BeforeClass
public void setFile(){
filename = "CreateLead";
}

@Test(dataProvider="fetchData")
public void runTest(String name, String company){
// use inputs instead of hardcoded values
}

8. Execution Steps

* Run using TestNG XML 
* Pass parameters:
  url
  browserName (chrome/firefox)
  profile

Example:
mvn test

9. Cross Browser Support

* Supported browsers: Chrome, Firefox
* Controlled via TestNG parameters

10. Reporting

* Cucumber reports generated after execution
* Testng reports generated under surefire-reports folder

Common Issues & Fixes

* Driver not launching → Check browser setup
* Excel not read → Verify file path and sheet
* NullPointerException → Ensure filename is set
* Browser closes immediately → Check TestNG flow

Summary

This framework combines:

* POM → Maintainability
* Cucumber → Readability (BDD)
* TestNG → Execution control
* Excel → Data-driven testing

================================================================================
                          COMPLETE IMPLEMENTATION
================================================================================

Project Structure:
--------------------------------------------------------------------------------
project-root/
│
├── src/test/java/com/leaftaps
│   │── base/
│   │   └── ProjectSpecificMethods.java
│   │── utils/
│   │   └── DataLibrary.java
│   │── testcases/
│   │    └── LoginTest.java
│   │── features/
│   │    └── FNOO1_VerifyLogin.java
│   │── pages/
│   │    └── WebPage.java
│   │── runner/
│       └── BDDTestRunner.java
│
├── data/
│   └── testdata.xlsx
│
└── pom.xml (with Apache POI dependencies)


Next Steps

* Add Extent Reports / Allure
* Integrate with CI/CD (Jenkins/GitHub Actions)
* Add logging (Log4j)
* Implement reusable Selenium wrappers
