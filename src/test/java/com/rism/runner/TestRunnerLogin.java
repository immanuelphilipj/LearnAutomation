package com.rism.runner;


import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import com.rism.utils.Common;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features =".",
		glue ={""},
		plugin = {"pretty:STDOUT","html:C:\\ISMAutomation\\Reports\\Cucmber-Pretty",
		   "com.cucumber.listener.ExtentCucumberFormatter:C:\\ISMAutomation\\Reports\\Cucumber-Extents\\report.html"},
		monochrome = true,
		dryRun = false		
		)

public class TestRunnerLogin {

	    
		@BeforeClass
	    public static void setup() {
			Hooks.pro = Common.readConfig("configurations.properties");
			Hooks.driver = Common.getDriver(Hooks.pro.getProperty("BrowserType"));			
			 
		}
	 
    	 @AfterClass
	    public static void teardown() {
    		 
 	        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
 	        Reporter.setSystemInfo("user", System.getProperty("user.name"));
 	        Reporter.setSystemInfo("os", "Windows");
 	        Reporter.setTestRunnerOutput("Retail Team Report");
 	        
 	        
		    Hooks.driver.quit();
	    }

}
