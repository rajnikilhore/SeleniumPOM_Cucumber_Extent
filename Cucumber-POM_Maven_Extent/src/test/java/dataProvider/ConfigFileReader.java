package dataProvider;



import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;

public class ConfigFileReader {
	private Properties prop;
	
	private final String propertyFilePath= "C:\\Users\\RajniKilhore\\eclipse-workspace\\coneptNeerajLink\\src\\main\\java\\com\\qa\\configs\\configuration.properties";
	
	 public ConfigFileReader(){
		 BufferedReader reader;
		 try {
		 reader = new BufferedReader(new FileReader(propertyFilePath));
		 prop = new Properties();
		 try {
		 prop.load(reader);		
		 reader.close();
		 } catch (IOException e) {
		 e.printStackTrace();
		 }
		 } catch (FileNotFoundException e) {
		 e.printStackTrace();
		 throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		 } 
		 }
//	public ConfigFileReader() {
//		try {
//			  prop =  new Properties();
//			  FileInputStream fis =new FileInputStream (propertyFilePath);
//			  prop.load(fis);
//		  }catch(IOException e) {
//			  e.getMessage();
//		  }
//	FileInputStream fis =new FileInputStream(propertyFilePath);
//	prop.load(fis);	
//	}
	
	public String getDriverPath() {
		String driverpath= prop.getProperty("driverPath");
		 if(driverpath!=null) return driverpath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
		
	}
	
	
	public long getImplicitwait() {
		String implicitlyWait = prop.getProperty("implicitwait");
		 if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
		 else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file."); 
		 }
	
	public String getApplicationUrl() {
		
		 String url = prop.getProperty("URL");
		 if(url != null) return url;
		 else throw new RuntimeException("url not specified in the Configuration.properties file.");
		 }
	
	public DriverType getBrowser() {
		String browserName=prop.getProperty("browser");
		 if(browserName == null || browserName.equals("chrome")) return DriverType.CHROME;
		 else if(browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
		 else if(browserName.equals("iexplorer")) return DriverType.INTERNETEXPLORER;
		 else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
		 }
	
	public Boolean getBrowserWindowSize() {
		String windowsize=prop.getProperty("windowMaximize");
		if(windowsize != null) return Boolean.valueOf(windowsize);
		 return true;
	}
	
	public String getReportConfigPath()  {
		 String reportConfigPath = prop.getProperty("reportConfigPath");
		 if(reportConfigPath!= null) return reportConfigPath;
		 else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
		}
		
	}
		

	
	

	
	


