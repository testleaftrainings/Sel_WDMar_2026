package runner;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;


@CucumberOptions(features={"src/test/java/features"},
glue = {"steps","hooks"},
publish=true,
dryRun=false,
tags ="@Smoke or @Regression")
public class BddRunner extends BaseClass{

}
