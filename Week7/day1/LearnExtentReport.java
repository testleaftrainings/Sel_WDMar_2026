package week7;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

/*
Steps to Generate Extent Report

Step 1: Set Physical Report Path
Example Path: Right-click the project → New → Folder → Name it as "reports".
Step 2: Create ExtentReports Object
Step 3: Attach Reporter to ExtentReports
Step 4: Create a Test & Assign Details
Step 5: Add Test Logs (Pass/Fail Status)
Step 6: Flush the Report (Mandatory)
*/
public class LearnExtentReport {
/*
-Extenthtmlreporter--> used to create physical HTML report
         -ExtentReports-----> to capture the automation data and attach to physical file
                  -ExtentTest---> To create TC in report and capture TC status
                        -MediaEntityBuilder----> To attach Screenshot to report
*/
public static void main(String[] args) throws IOException {
      // timestamping --> 
      String fileName = LocalDateTime.now().format(DateTimeFormatter.ofPattern("EEE_dd-MMM_HH_mm_ss_a"));
      //Step 1: Set Physical Report Path
      // Example Path: Right-click the project → New → Folder → Name it as "reports".
      ExtentHtmlReporter report = new ExtentHtmlReporter("./reports/"+fileName+"-result.html");
      //report.setAppendExisting(true);
      // Step 2: Create ExtentReports Object
      ExtentReports extent = new ExtentReports();
      // Step 3: Attach Reporter to ExtentReports
      extent.attachReporter(report);
      //Step 4: Create a Test & Assign Details
     ExtentTest test = extent.createTest("Login Test", "Verify the user authorization of the application");
      //Step 5: Add Test Logs (Pass/Fail Status)
     test.assignAuthor("Bhuvanesh");
     test.assignCategory("Sanity");
     test.pass("Username entered successfully");
     test.pass("Password enterd successfully");
     test.fail("Login button not clicked", MediaEntityBuilder.createScreenCaptureFromPath("./../snap/myntra.png").build());

     ExtentTest test1 = extent.createTest("Login Test", "Verify the user authorization of the application");
      //Step 5: Add Test Logs (Pass/Fail Status)
     test1.assignAuthor("Harrish");
     test1.assignCategory("Regression");
     test1.pass("Username entered successfully");
     test1.pass("Password enterd successfully");
     test1.pass("Login button Clicked clicked", MediaEntityBuilder.createScreenCaptureFromPath("./../snap/myntra.png").build());
      //Step 6: Flush the Report (Mandatory)
      extent.flush();
}
}
