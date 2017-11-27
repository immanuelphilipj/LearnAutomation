package com.rism.then;

import org.junit.Assert;

import com.rism.objects.SpecificationSummary;

import cucumber.api.java.en.Then;

public class Specification {

	
	@Then("^User should successfully save see the message$")
	public void user_should_successfully_save_see_the_message(String arg1) throws Throwable {
	    
		Assert.assertTrue("User could create Specification successfully", SpecificationSummary.getInstance().saveSpecification(arg1));
	}


}
