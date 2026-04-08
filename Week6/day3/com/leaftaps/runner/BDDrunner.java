package com.leaftaps.runner;

import com.leaftaps.base.ProjectSpecifcMethods;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/test/java/com/leaftaps/features"},
glue = {"com/leaftaps/pages"},
publish = true,
dryRun=false,
tags = "@Smoke")
public class BDDrunner extends ProjectSpecifcMethods {

}
