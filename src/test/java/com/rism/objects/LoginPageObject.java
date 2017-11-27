package com.rism.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.rism.runner.Hooks;

@SuppressWarnings("unused")
public class LoginPageObject {

	private static LoginPageObject _instance;
	private WebElement j_username;
	private WebElement j_password;	
	@FindBy(how = How.ID, using ="login-button")
	private WebElement submit;
	//private WebDriver driver;
	
	private LoginPageObject() {
		PageFactory.initElements(Hooks.driver, this);
	}
	
	public static LoginPageObject getInstance(){
	
		if (_instance==null)
			_instance = new LoginPageObject();
		return _instance;
	}
	
	public boolean loginApplication(String url){
		Hooks.driver.get(url);
		return true;
	}
	
	public boolean loginHome(String uid, String loginpass) throws Exception{
		
		try{		
			j_username.sendKeys(uid);
			j_password.sendKeys(loginpass);
			submit.click();
			return true;
			
		  }catch(Exception e){
			System.out.println(e);
			return false;
		}
		//Handle the exception separatley.		
	}
}
