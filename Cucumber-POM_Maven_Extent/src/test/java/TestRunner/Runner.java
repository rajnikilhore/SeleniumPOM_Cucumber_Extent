package TestRunner;
	
	import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

import managers.FileReaderManager;

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "C:\\Users\\RajniKilhore\\eclipse-workspace\\Cucumber-POM_Maven_Extent\\src\\test\\java\\Features\\feat.feature", // the // path// of // the  // feature // files
																																			
			glue = { "StepDefinition" }, // the path of the step definition files
			plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target\\cucumber-reports\\report.html"},					
			format = { "pretty", "html:test-ouput" }, 
			monochrome = true,
			dryRun = false,
			strict = false)

	public class Runner {
		 @AfterClass
		 public static void writeExtentReport() {
		 Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
		 }

	}



