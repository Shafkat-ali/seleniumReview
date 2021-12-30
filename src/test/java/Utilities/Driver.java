package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	private Driver() {

	}
//hello
	public static WebDriver driver;

	public static WebDriver getDriver() {

		if (driver == null) {

			switch (testDataReader.getProperty("browser")) {

			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.get(testDataReader.getProperty("url"));
				// Using get() method to open a webpage
				driver.manage().window().maximize();


				break;
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.get(testDataReader.getProperty("url"));
				// Using get() method to open a webpage
				driver.manage().window().maximize();

				
				break;
			case "ie/safari":
				// code

				break;
			case "headless":
				// code

				break;
			} //switch

		} //if else
		
		
		return driver;
	} //end of getDriver method
	
	
	

} //end of class
