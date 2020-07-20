package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class ProductListingPage {
	WebDriverWait wait;
 public ProductListingPage(WebDriver driver) {
 PageFactory.initElements(driver, this);
  wait = new WebDriverWait(driver, 30);
 }
 
 @FindBy(how = How.CSS, using = "#pa_color") 
 private WebElement color;
 
 @FindBy(how = How.CSS, using = "#pa_size") 
 private WebElement size;
 
  
 @FindBy(how = How.CSS, using = "button.single_add_to_cart_button") 
 private WebElement btn_AddToCart;
 
 @FindAll(@FindBy(how = How.CSS, using = ".noo-product-inner"))
 private List<WebElement> prd_List; 
 
 
 public void selectColor() {
	 Select colorSelect =new Select((WebElement) color);
	 List<WebElement> coloritems = colorSelect.getOptions();
	 coloritems.get(1).click();
	 }
 public void selectSize() {
	 Select sizeSelect =new Select((WebElement) size);
	 List<WebElement> coloritems = sizeSelect.getOptions();
	 coloritems.get(1).click();
	 }
 
 public void clickOn_AddToCart() throws InterruptedException {
 
 wait.until(ExpectedConditions.elementToBeClickable(btn_AddToCart) );
 Thread.sleep(5000);
 btn_AddToCart.click();
 }
 
 public void select_Product(int productNumber) {
 prd_List.get(productNumber).click();
 }
 
 public String getProductName(int productNumber) {
	 return prd_List.get(productNumber).findElement(By.cssSelector("h3")).getText();
	 }
}