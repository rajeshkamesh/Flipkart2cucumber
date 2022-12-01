package com.Woolworths.step;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//Resources//Wool.feature",
					glue = "com.Woolworths.step",
					plugin = "html:target",
					monochrome = true, //remove uwanted things  in console
					dryRun = false,
					tags = {"@wool"}) //~ignore , "1d" 0r "test"= operator 
				
public class TestRunner {
	

}
