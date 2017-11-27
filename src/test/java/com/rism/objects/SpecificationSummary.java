package com.rism.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.rism.runner.Hooks;

public class SpecificationSummary {
	
	private static SpecificationSummary _instance;
	private WebDriver driver;
	@FindBy(how = How.XPATH, using ="//*[@id='s-sub-nav']/div[3]/span")
	private WebElement successMessage;
	
	private SpecificationSummary(){
		
		driver = Hooks.driver;
		PageFactory.initElements(driver, this);
	}
	
	public static SpecificationSummary getInstance(){

		if (_instance==null)
			_instance = new SpecificationSummary();
		return _instance;
	}

	public boolean saveSpecification(String message){

		String saveMessage = successMessage.getText();
		if(message.contains(saveMessage)){
			return true;	
		}else
			return false;		
	}


}
