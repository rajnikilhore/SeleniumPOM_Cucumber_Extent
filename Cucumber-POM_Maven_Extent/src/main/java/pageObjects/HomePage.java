package pageObjects;


	import java.io.IOException;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;

import dataProvider.ConfigFileReader;
import managers.FileReaderManager;
	 
	public class HomePage {
	 WebDriver driver;
	// ConfigFileReader cReader;
	 
	 public HomePage(WebDriver driver) throws IOException {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
	 //cReader= new ConfigFileReader();
	 }
	 
	 public void perform_Search(String search) {
	 //driver.navigate().to(cReader.getApplicationUrl()+"/?s=" + search + "&post_type=product");
		 
		 driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getApplicationUrl()+"/?s=" + search + "&post_type=product");
	 }
	 
	 public void navigateTo_HomePage() {
	// driver.get(cReader.getApplicationUrl());
		 System.out.println("test"+FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
		 driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	 }
	 
	}