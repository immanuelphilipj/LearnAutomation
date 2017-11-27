package com.rism.given;



import org.junit.Assert;

import com.rism.objects.LoginPageObject;

import cucumber.api.java.en.Given;

public class Login {

	
	@Given("^User login to the retail application with URL$")
	public void user_login_to_the_retail_application_with_URL(String url) throws Throwable {
	 
		Assert.assertTrue("User login successfully", LoginPageObject.getInstance().loginApplication(url));
	 
	}
}
