package runner;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;


@CucumberOptions(features={"src/test/java/features/FN002_CreateLead.feature"},
glue = {"steps","hooks"},
publish=true,
dryRun=false)
public class BddRunner extends BaseClass{

}
