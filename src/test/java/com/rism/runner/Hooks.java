package com.rism.runner;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;



@SuppressWarnings("unused")
public class Hooks {

	public static WebDriver driver;
	public static String driverPath = "C:\\Chrome\\chromedriver.exe";
	public static Properties pro;
	
	//Before Scenario 
	/*@Before
    public void init() throws Exception {
		if (Hooks.driver==null)
			Hooks.driver = getDriver(true);		
	}
	
	//After Scenario
    @After
    public void cleanup() throws Exception{
    	
        if(scenario.isFailed()) {
        	System.out.println("Failed scenario is "+scenario.getName());        		        
        }
        //closeBrowser();
 
    }

*/    
}
