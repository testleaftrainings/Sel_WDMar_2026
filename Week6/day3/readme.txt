
POM Parallel Execution
======================

---

OBJECTIVE

To pass driver from Testcase → All Page classes
To maintain same browser session across page transitions
To support clean POM and parallel execution

---

STEP 1 – Prepare Base Class

1. Declare driver at class level as non-static variable.
2. Initialize driver inside setup method.
3. Ensure driver is accessible to test class.

Purpose:
Driver should be created only once per test execution.

---

STEP 2 – Modify LoginPage (First Page)

1. Go to LoginPage inside pages package.
2. Create a constructor that accepts driver as parameter.
3. Assign received driver to class variable.

Purpose:
LoginPage now uses driver passed from Testcase.

---

STEP 3 – Handle Methods Returning Same Page

1. For actions that do not navigate (like enter username, enter password):
2. Perform action using driver.
3. Return current page object using this keyword.

Purpose:
Allows method chaining and stays in same page.

---

STEP 4 – Handle Methods Returning Next Page

1. Identify methods that navigate to next page (example: click login).
2. After performing action, create next page object.
3. While creating next page object, pass same driver in constructor.
4. Ensure next page class also has parameterized constructor.

Purpose:
Maintain same driver session across page transitions.

---

STEP 5 – Repeat for All Page Classes

For every page class:

1. Create parameterized constructor receiving driver. 
2. Assign driver to class variable.
3. Whenever returning another page object, pass driver through constructor. 

Flow example:

LoginPage
→ HomePage
→ MyHomePage
→ MyLeadsPage
→ CreateLeadPage
→ ViewLeadPage

Driver must travel through constructor in every transition.

---

STEP 6 – Modify Testcase Class

1. Ensure driver is initialized before test method runs.
2. Inside test method, create LoginPage object.
3. Pass driver while creating LoginPage object.
4. Call page methods sequentially.

Execution Flow:

Testcase creates driver
→ Pass driver to LoginPage
→ LoginPage performs actions
→ clickLoginButton returns HomePage with same driver
→ Further navigation continues

---

STEP 7 – Understand Complete Execution Flow

Testcase
→ Creates driver
→ Passes driver to first Page
→ Page methods execute
→ Next page created with same driver
→ Browser session continues
→ Test completes
→ Driver closed

---

WHY THIS STRUCTURE IS IMPORTANT

* No static driver usage
* Avoids NullPointerException
* Maintains single browser session
* Supports parallel execution
* Clean separation of concerns

---


--------------------------------------------------------------
PROJECT STRUCTURE CREATION FOR POM WITH CUCUMBER
================================================

---

STEP 1 – Create Maven Project

1. Open IDE (VS Code).
2. Choose Create New Maven Project.
3. Provide project name as PageObjectModel.
4. Keep default Maven folder structure.
5. Finish project creation.

Now you will see:
src/main/java
src/test/java

---

STEP 2 – Create Base Package

1. Expand src/test/java.
2. Right click → New Package.
3. Name it com.leaftaps.base.
4. Inside this package create a class named ProjectSpecificMethods.

Purpose:
This class will contain driver setup, teardown, and common reusable methods.

---

STEP 3 – Create Features Package

1. Right click src/test/java.
2. Create new Package.
3. Name it com.leaftaps.features.
4. Inside this package create a feature file.
5. Name it FN001_LoginFunction.feature.

Purpose:
This will contain Cucumber scenarios written in Gherkin format.

---

STEP 4 – Create Page Package

1. Right click src/test/java.
2. Create new Package.
3. Name it com.leaftaps.pages.
4. Inside this package create page classes:

   * LoginPage
   * HomePage
   * MyHomePage
   * MyLeadsPage
   * CreateLeadPage
   * ViewLeadPage
5. Map steps in the feature file with the java methods inside all the page classes

Purpose:
Each class represents one application page.
Each class contains page-specific actions.

---

STEP 5 – Create Runner Package

1. Right click src/test/java.
2. Create new Package.
3. Name it com.leaftaps.runner.
4. Inside this package create a class named CucumberRunner.

Purpose:
This class controls execution of feature files.
It will define feature path, glue path, and reporting configuration.

---

STEP 6 – Create Testcases Package (Optional – Hybrid Structure)

1. Expand src/main/java.
2. Right click → New Package.
3. Name it com.leaftaps.testcases.
4. Inside this package create test classes:

   * TC001_VerifyLogin
   * TC002_CreateLead

Purpose:
These classes are used if combining TestNG-based execution along with Cucumber or for separate POM execution.

---

FINAL STRUCTURE SHOULD LOOK LIKE

Project
│
├── src/test/java
│   ├── com.leaftaps.base
│   ├── com.leaftaps.features
│   ├── com.leaftaps.pages
│   ├── com.leaftaps.runner
│   ├── com.leaftaps.testcases

---

EXECUTION FLOW UNDERSTANDING

CucumberRunner
→ Reads Feature file
→ Executes Steps (mapped in page package)
→ Page classes interact with application
→ ProjectSpecificMethods manages driver

====================================================
