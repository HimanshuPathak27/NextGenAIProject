package com.nextgenai.driverscript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.nextgenai.utilities.ExcelReader;

public class TestBase {
	
	public static WebDriver driver;
	public static FileInputStream fis;
	public static ExcelReader excel = new ExcelReader("D:\\Future\\NextGenAIProject\\TestData\\RegisterDemoTestData.xlsx");
	public static WebDriverWait wait;	
	public static Properties config = new Properties();
	
	@BeforeSuite
	public WebDriver setup() throws IOException {

		try {
			fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\nextgenai\\driverscript\\Configuration.properties");
			config.load(fis);
			Reporter.log("Configuration File is loaded successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		if(config.getProperty("browser").equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			Reporter.log("Chrome Browser is launched successfully");
		}

		else if(config.getProperty("browser").equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			Reporter.log("Edge Browser is launched successfully");
		} 

		else if(config.getProperty("browser").equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			Reporter.log("Firefox Browser is launched successfully");
		}

		else{
			driver = new ChromeDriver();
			Reporter.log("Chrome Browser is launched successfully");
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(config.getProperty("implicitWait"))));
		driver.manage().window().maximize();
		driver.get(config.getProperty("url"));
		
		return driver;
	}
	
	@AfterSuite
	public void tearDown() {

		if(driver != null) {
			driver.quit();
			Reporter.log("Application Closed Successfully");
		}
	}
	
}
