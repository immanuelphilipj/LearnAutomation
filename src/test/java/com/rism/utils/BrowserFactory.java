package com.rism.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import gherkin.formatter.model.Feature;
/*
public class BrowserFactory {

	public static WebDriver driver;
	private String browser = "Chrome";
	public static String driverPath = "C:\\Chrome\\chromedriver.exe";
    
	@Before
    public void init(Scenario scenario) throws Exception {
		
		//Invoke my Browser Factory class and get the driver ready.
		BrowserFactory.driver = getDriver();
	}
	
	@After
    public void cleanup(Scenario scenario, Feature feature) throws Exception{
    	
        if(scenario.isFailed()) {
        	System.out.println("Failed scenario is "+scenario.getName());        		        
        }
	}
	

	
	//private static BrowserFactory _initBrowserFactory;
	private BrowserFactory(){
		
	}
	
	public static BrowserFactory getInst(){
		if(_initBrowserFactory==null)
			_initBrowserFactory = new BrowserFactory();
		return _initBrowserFactory;		
	}
	
	public WebDriver getDriver(){

		while(driver==null){
			
		
		if(browser.equals("Firefox")){
				
				//TBD include Gecko driver code for FireFox driver
				
			}
			else if (browser.equalsIgnoreCase("Chrome")){			
				System.setProperty("webdriver.chrome.driver", driverPath);
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			
			}
			
			
		}	
		return driver;
	}

	public void closeBrowser(){
		//driver.close();
		driver.quit();
	}
}
*/