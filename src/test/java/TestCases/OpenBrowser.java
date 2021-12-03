package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilities.Driver;
import Utilities.testDataReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {

	@BeforeMethod
	public void setUp() {

		Driver.getDriver();

	}

	@Test
	public void testUno() {

		String popularDealText = Driver.getDriver().findElement(By.xpath(testDataReader.getProperty("popularDealText")))
				.getText();

		System.out.println(popularDealText);
		

	}

	@AfterMethod
	public void tearDown() {

	}

}
