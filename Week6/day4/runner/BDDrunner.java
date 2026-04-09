package com.leaftaps.runner;

import org.testng.annotations.DataProvider;

import com.leaftaps.base.ProjectSpecifcMethods;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/test/java/com/leaftaps/features"},
glue = {"com/leaftaps/pages"},
publish = true,
dryRun=false,
tags = "@Smoke or @Regression")
public class BDDrunner extends ProjectSpecifcMethods {

    @DataProvider(parallel= true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
