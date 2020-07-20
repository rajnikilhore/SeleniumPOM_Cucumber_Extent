package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import pageObjects.HomePage;

public class HomePageSteps {
	
//	HomePage homePage;
//	PageObjectManager pageObjectManager;
//	WebDriver driver;
	 
	 TestContext testContext;
	 HomePage homePage;
	 
	public HomePageSteps(TestContext context) {
	 testContext = context;
	 try {
		homePage =  testContext.getPageObjectManager().getHomePage();
	} catch (IOException e) {
		System.out.println("testcontext failed");
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	 }
	 
	 @Given("^user is on Home Page$")
	 public void user_is_on_Home_Page() throws IOException{
//		 pageObjectManager = new PageObjectManager(driver);
//		 homePage = pageObjectManager.getHomePage();
	 homePage.navigateTo_HomePage(); 
	 }
	 
	 @When("^he search for \"([^\"]*)\"$")
	 public void he_search_for(String product)  {
	 homePage.perform_Search(product);
	 }
	 
}
