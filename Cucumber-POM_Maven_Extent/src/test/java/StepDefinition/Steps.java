//package StepDefinition;
//
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import dataProvider.ConfigFileReader;
//import managers.PageObjectManager;
//import managers.WebDriverManager;
//import pageObjects.CartPage;
//import pageObjects.CheckoutPage;
//import pageObjects.HomePage;
//import pageObjects.ProductListingPage;
//
//public class Steps {
//
//	WebDriver driver;
//	HomePage home;
//	ProductListingPage productListingPage;
//	CartPage cartPage;
//	CheckoutPage checkoutPage;
//	PageObjectManager pageObjectManager;
//	ConfigFileReader config;
//	WebDriverManager webDriverManager;
//	 
//	
//	@Given("^user is on Home Page$")
//	public void user_is_on_Home_Page() throws IOException {
//		webDriverManager = new WebDriverManager();
//		driver = webDriverManager.getDriver();
////		config = new ConfigFileReader();
////		System.setProperty("webdriver.chrome.driver", config.getDriverPath());
////
////		driver = new ChromeDriver();
////		driver.manage().window().maximize();
////		driver.manage().timeouts().implicitlyWait(config.getImplicitwait(), TimeUnit.SECONDS);
//		pageObjectManager = new PageObjectManager(driver);
//		home = pageObjectManager.getHomePage();
//		home.navigateTo_HomePage();
//	}
//
//	@When("^he search for \"([^\"]*)\"$")
//	public void he_search_for(String product) throws IOException {
//
//		home.perform_Search(product);
//	}
//
//	@Then("^choose to buy the first item$")
//	public void choose_to_buy_the_first_item() throws InterruptedException {
//		productListingPage = pageObjectManager.getProductListingPage();
//		productListingPage.select_Product(0);
//		productListingPage.selectColor();
//		productListingPage.selectSize();
//		productListingPage.clickOn_AddToCart();
//	}
//
//	@Then("^moves to checkout from mini cart$")
//	public void moves_to_checkout_from_mini_cart() {
//		cartPage = pageObjectManager.getCartPage();
//		cartPage.clickOn_Cart();
//		cartPage.clickOn_ContinueToCheckout();
//	}
//
//	@Then("^enter personal details on checkout page$")
//	public void enter_personal_details_on_checkout_page() throws InterruptedException {
//		checkoutPage = pageObjectManager.getCheckoutPage();
//		checkoutPage.fill_PersonalDetails();
//	}
//
//	// @Then("^select same delivery address$")
//	// public void select_same_delivery_address() throws InterruptedException{
//	// checkoutPage.check_ShipToDifferentAddress(false);
//	// }
//
//	// @When("^select payment method as \"([^\"]*)\" payment$")
//	// public void select_payment_method_as_payment(String arg1){
//	// checkoutPage.select_PaymentMethod("CheckPayment");
//	// }
//
//	@Then("^place the order$")
//	public void place_the_order() throws InterruptedException {
//		checkoutPage.check_TermsAndCondition(true);
//		checkoutPage.clickOn_PlaceOrder();
//		webDriverManager.closeDriver();
//
//		//driver.quit();
//	}
//}