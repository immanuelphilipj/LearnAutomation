package com.rism.given;

import com.rism.objects.PromotionList;
import com.rism.objects.SpecificationList;

import cucumber.api.java.en.Given;

public class Specification {

	@Given("^User login and navigate to Item Management module$")
	public void user_login_and_navigate_to_Item_Management_module() throws Throwable {
	 
		PromotionList.getInstance().ItemManagement();
	
	}
	
	@Given("^User navigates to Specification module and click New Specification$")
	public void user_navigates_to_Specification_module_and_click_New_Specification() throws Throwable {
	   
		PromotionList.getInstance().specificationLink();
		SpecificationList.getInstance().specificationLink();
	}

}
