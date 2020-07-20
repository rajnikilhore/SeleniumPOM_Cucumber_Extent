package managers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import enums.DriverType;

public class WebDriverManager {
private WebDriver driver;
private static DriverType driverType;
private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
//ConfigFileReader config = new ConfigFileReader();

public WebDriverManager() {
	//config = new ConfigFileReader();
	//driverType = config.getBrowser();
	driverType= FileReaderManager.getInstance().getConfigReader().getBrowser();
	
	}

public WebDriver getDriver() {
	if(driver == null) driver=createLocalDriver();	
	return driver;
}

private WebDriver createLocalDriver() {
    switch (driverType) {     
    case FIREFOX : driver = new FirefoxDriver();
 	break;
    case CHROME : 
    	DesiredCapabilities capability = DesiredCapabilities.chrome();
    	ChromeOptions chromeOptions = new ChromeOptions();
    	chromeOptions.addArguments("ignore-certificate-errors");
    	capability.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
    	//System.setProperty(CHROME_DRIVER_PROPERTY, config.getDriverPath());
    	System.setProperty(CHROME_DRIVER_PROPERTY,FileReaderManager.getInstance().getConfigReader().getDriverPath());
    	driver = new ChromeDriver(capability);
    	//driver.navigate().to ("javascript:document.getElementById('details-button').click()");
 break;
    case INTERNETEXPLORER : driver = new InternetExplorerDriver();
 break;
    }


//if(config.getBrowserWindowSize()) driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(config.getImplicitwait(), TimeUnit.SECONDS);
    if(FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize()) driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitwait(), TimeUnit.SECONDS);
return driver;

}

public void closeDriver() {
	 driver.close();
	 driver.quit();
	 }
}
