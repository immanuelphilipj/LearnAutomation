package com.rism.objects;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.rism.runner.Hooks;
import com.rism.utils.Common;

import cucumber.api.DataTable;

public class SpecificationStepTwo {

	private static SpecificationStepTwo _instance;
	private WebDriver driver;
	private WebDriverWait wait;
	
	private SpecificationStepTwo(){
		
		driver = Hooks.driver;
		wait = new WebDriverWait(driver, 20);
		PageFactory.initElements(driver, this);
	}
	
	public static SpecificationStepTwo getInstance(){

		if (_instance==null)
			_instance = new SpecificationStepTwo();
		return _instance;
	}

     public boolean pricingMultipier(DataTable data){
		
		String sellPrice =null, uom =null,  pieces=null,multiple=null ,itemMultiplier=null;
		  
		
		for(Map<String,String> map : data.asMaps(String.class, String.class)) {  
			sellPrice = map.get("SellPrice");
			uom = map.get("UOM");
			pieces = map.get("Pieces");
			multiple = map.get("Multiple");
			itemMultiplier = map.get("ItemMultiplier");
    	}
	   System.out.println(sellPrice+uom +pieces+multiple+itemMultiplier);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sellPrice']/input")));	
	    
	    /*driver.findElement(By.xpath("//*[@id='sellPrice']/input")).click();
	    driver.findElement(By.xpath("//*[@id='sellPrice']/input")).sendKeys(sellPrice);*/
	  
	    driver.findElement(By.xpath("//*[@id='uom']/span/div/div")).click();	
	    Common.selectDropdown(driver, "//*[@id='ui-id-9']/li/a", uom);
	    
	    
	    driver.findElement(By.xpath("//*[@id='uomUnits']/input")).click();
	    driver.findElement(By.xpath("//*[@id='uomUnits']/input")).sendKeys(pieces);
	    
	    driver.findElement(By.xpath("//*[@id='multiple']/input")).click();
	    driver.findElement(By.xpath("//*[@id='multiple']/input")).sendKeys(multiple);
	    
	    
	    driver.findElement(By.xpath("//*[@id='storeCategories']/span/div/div")).click();	
	    Common.selectDropdown(driver, "//*[@id='ui-id-10']", itemMultiplier);
	    
	    driver.findElement(By.xpath("//*[@id='edit-item-spec']/div[1]/div[2]/div[6]/ul/li[1]/button")).click();
	    return true;
}
	
	
}
