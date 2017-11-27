package com.rism.objects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.rism.runner.Hooks;

public class SpecificationList {

	private static SpecificationList _instance;
	private WebDriver driver;
	@FindBy(how = How.XPATH, using ="//*[@id='pag-item-mgmt-spec-list-lnk-create-spec']/span[2]")
	private WebElement newSpecification;
	
	private SpecificationList (){
		
		driver = Hooks.driver;
		PageFactory.initElements(driver, this);
	}
	
	public static SpecificationList getInstance(){

		if (_instance==null)
			_instance = new SpecificationList();
		return _instance;
	}
	
	
	public boolean specificationLink(){
		
		if(newSpecification.isEnabled()){
			newSpecification.click();
			return true;
		} else
			return false;
	}

}
