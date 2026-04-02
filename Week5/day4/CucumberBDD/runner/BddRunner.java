package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features={"src/test/java/features/FN001_LoginTest.feature"},
glue = {"steps"},
publish=true,
dryRun=false)
public class BddRunner extends AbstractTestNGCucumberTests{

}
