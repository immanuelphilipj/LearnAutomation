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

public class SpecificationStepOne {

	private static SpecificationStepOne _instance;
	private WebDriver driver;
	private WebDriverWait wait;;
	
	private SpecificationStepOne(){
		driver = Hooks.driver;
		wait = new WebDriverWait(driver, 20);
		PageFactory.initElements(driver, this);
	}
	
	public static SpecificationStepOne getInstance(){

		if (_instance==null)
			_instance = new SpecificationStepOne();
		return _instance;
	}

	
	public boolean printSpecification(DataTable data){
		
		String category=null,productType=null,printMethod=null,substrate=null ,color=null,inlineFinishing =null, offflineFinishing=null, width = null, height =null, depth = null;
		
		
		for(Map<String,String> map : data.asMaps(String.class, String.class)) {  
			category = map.get("Category");
			productType = map.get("ProductType");
			printMethod = map.get("PrintMethod");
			substrate = map.get("Substrate");
			color = map.get("Color");
			inlineFinishing = map.get("InlineFinishing");
			offflineFinishing = map.get("OfflineFinishing");
			width = map.get("Width");
			height = map.get("Height");
			depth = map.get("Depth");
    	}
	   
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='category']/span/div/div")));	
	    
	    driver.findElement(By.xpath("//*[@id='category']/span/div/div")).click();	
	    Common.selectDropdown(driver, "//*[@id='ui-id-1']/li/a", category);
	    
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	    
	    driver.findElement(By.xpath("//*[@id='productType']/span/div/div")).click();
	    Common.selectAjaxDropdown(driver, "productType", productType);
	    
	    driver.findElement(By.xpath("//*[@id='printMethod']/span/div/div")).click();
	    Common.selectDropdown(driver, "//*[@id='ui-id-3']/li/a", printMethod);
	    
	   
	    driver.findElement(By.xpath("//*[@id='finishSize']/input[1]")).click();
	    driver.findElement(By.xpath("//*[@id='finishSize']/input[1]")).sendKeys(width);
	    
	    driver.findElement(By.xpath("//*[@id='finishSize']/input[2]")).click();
	    driver.findElement(By.xpath("//*[@id='finishSize']/input[2]")).sendKeys(height);
	    
	    driver.findElement(By.xpath("//*[@id='finishSize']/input[3]")).click();
	    driver.findElement(By.xpath("//*[@id='finishSize']/input[3]")).sendKeys(depth);
	    
	    driver.findElement(By.xpath("//*[@id='substrate']/span/div/div")).click();
	    Common.selectDropdown(driver, "//*[@id='ui-id-4']/li/a", substrate);
	    
	    driver.findElement(By.xpath("//*[@id='color']/span/div/div")).click();
	    Common.selectDropdown(driver, "//*[@id='ui-id-5']/li/a", color);
	    
	    driver.findElement(By.xpath("//*[@id='inlineFinish']/span/div/div")).click();
	    Common.selectDropdown(driver, "//*[@id='ui-id-6']/li/a", inlineFinishing);
	    
	    driver.findElement(By.xpath("//*[@id='offlineFinish']/span/div/div")).click();	    
	    Common.selectDropdown(driver, "//*[@id='ui-id-7']/li/a", offflineFinishing);
	    
	    
	    driver.findElement(By.xpath("//*[@id='edit-item-spec']/div[1]/div[1]/div[15]/ul/li[1]/button")).click();
	    
		return true;		
		
	}

	
	
	
}
