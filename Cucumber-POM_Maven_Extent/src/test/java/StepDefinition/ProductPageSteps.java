package StepDefinition;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import enums.Context;
import pageObjects.ProductListingPage;

public class ProductPageSteps {
	TestContext testContext;
	 ProductListingPage productListingPage;
	 
	 
	 public ProductPageSteps(TestContext context) {
		 testContext = context;
		 productListingPage = testContext.getPageObjectManager().getProductListingPage();
		 }
	 
	 @When("^choose to buy the first item$")
	 public void choose_to_buy_the_first_item() throws Exception {
		 String productName = productListingPage.getProductName(0);
		 System.out.print("productpagesteps"+productName);
		 testContext.scenarioContext.setContext(Context.PRODUCT_NAME, productName);
		 String productName1 = (String)testContext.scenarioContext.getContext(Context.PRODUCT_NAME);
		 System.out.print("product context"+productName1);
	 productListingPage.select_Product(0);
	 productListingPage.selectColor();
	 productListingPage.selectSize();
	 productListingPage.clickOn_AddToCart(); 
	 }
	

}
