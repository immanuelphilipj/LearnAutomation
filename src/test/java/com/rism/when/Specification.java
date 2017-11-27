package com.rism.when;

import com.rism.objects.SpecificationStepOne;
import com.rism.objects.SpecificationStepTwo;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;

public class Specification {

	@When("^User enter mandatory field details in Print Specification and click Next$")
	public void user_enter_mandatory_field_details_in_Print_Specification_and_click_Next(DataTable arg1) throws Throwable {
		SpecificationStepOne.getInstance().printSpecification(arg1);
	}

	@When("^User enter all mandatory fields in the Pricing and Multipiers and click Finish$")
	public void user_enter_all_mandatory_fields_in_the_Pricing_and_Multipiers_and_click_Finish(DataTable arg1) throws Throwable {

		SpecificationStepTwo.getInstance().pricingMultipier(arg1);
	}
}
