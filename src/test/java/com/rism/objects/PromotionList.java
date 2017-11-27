package com.rism.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.rism.runner.Hooks;

public class PromotionList {

	private static PromotionList _instance;
	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(how = How.XPATH, using ="//*[@id='nav-items']/a")
	private WebElement itemManagement;
	
	@FindBy(how = How.XPATH, using ="//*[@id='tabs-item-specs-v2']/a")
	private WebElement Specs;
	
	private PromotionList(){
		driver = Hooks.driver;
		wait = new WebDriverWait(driver, 20);
		
		PageFactory.initElements(driver, this);
	}
	
	public static PromotionList getInstance(){

		if (_instance==null)
			_instance = new PromotionList();
		return _instance;
	}

	public boolean ItemManagement(){
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='nav-items']/a")));
		
		
		if(itemManagement.isEnabled()){
		  
			itemManagement.click();
			//Reporter.addStepLog("User successfully navigates to Item Management module");
		    return true;		
		}
		else{
			//Reporter.addStepLog("User could not navigate to Item Management Module");
			return false;
		}
	}
	
	public boolean specificationLink(){
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tabs-item-specs-v2']/a")));
		
		if(Specs.isEnabled()){
			Specs.click();
			return true;
		} else
			return false;
	}
	
}



