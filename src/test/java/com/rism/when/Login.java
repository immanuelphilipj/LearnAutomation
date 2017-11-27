package com.rism.when;

import org.junit.Assert;

import com.rism.objects.LoginPageObject;

import cucumber.api.java.en.When;

public class Login {

	Boolean state;

	@When("^User enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_the_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	Assert.assertTrue("User Login Successfully", LoginPageObject.getInstance().loginHome(arg1, arg2));
	}


}
