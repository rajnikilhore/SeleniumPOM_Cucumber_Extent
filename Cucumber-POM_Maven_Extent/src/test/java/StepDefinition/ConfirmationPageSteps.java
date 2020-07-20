package StepDefinition;

import org.junit.Assert;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import enums.Context;
import pageObjects.ConfirmationPage;

public class ConfirmationPageSteps {
	 TestContext testContext;
	 ConfirmationPage confirmationPage;
	 
	 public ConfirmationPageSteps(TestContext context) {
		 testContext = context;
		 confirmationPage=testContext.getPageObjectManager().getconfirmPage();
	 }
	 
	 @Then("^verify the order details$")
	 public void verify_the_order_details(){
	 String productName = (String)testContext.scenarioContext.getContext(Context.PRODUCT_NAME);
	 System.out.print("confirpagesteps"+productName);
	 Assert.assertTrue(confirmationPage.getProductNames().stream().filter(x -> x.contains(productName)).findFirst().get().length()>0); 
	 }

}
