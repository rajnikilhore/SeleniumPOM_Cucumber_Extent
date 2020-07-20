package StepDefinition;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.CheckoutPage;

public class CheckoutPageSteps {
	
	 TestContext testContext;
	 CheckoutPage checkoutPage;
	 
	 public CheckoutPageSteps(TestContext context) {
	 testContext = context;
	 checkoutPage = testContext.getPageObjectManager().getCheckoutPage();
	 }
	 
	 @When("^enter personal details on checkout page$")
	 public void enter_personal_details_on_checkout_page(){
	 checkoutPage.fill_PersonalDetails(); 
	 }
	 
	 
	 @When("^place the order$")
	 public void place_the_order() {
	 checkoutPage.check_TermsAndCondition(true);
	 checkoutPage.clickOn_PlaceOrder(); 
	 //testContext.getWebDriverManager().closeDriver();;
	 } 

}
