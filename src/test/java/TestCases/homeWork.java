package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilities.Driver;
import Utilities.testDataReader;

public class homeWork {

	// Homework

	// go on amazon
	// search for "macbook pro"
	// get the text of search Results on top left corner of the page
	// make sure to store all test data and xpath/locators in the .properties file

	// note : utilize Driver.java and testDataReader.java classes to do these tasks

	@BeforeMethod
	public void setUp() {

		Driver.getDriver();

	}
	
	
	@Test
	public void task1() throws InterruptedException {
		
		
		String searchKeyWord = "macbook pro";
		
		Driver.getDriver().findElement(
				By.id(testDataReader.getProperty("searchField"))).sendKeys(searchKeyWord,Keys.ENTER);
		
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
		
		
		wait.until(ExpectedConditions.visibilityOf(Driver.getDriver().findElement(By.xpath(testDataReader.getProperty("searchResultText")))));	
		
		
		
		
		String searchResultVar = Driver.getDriver().findElement(By.xpath(testDataReader.getProperty("searchResultText"))).getText();
		System.out.println(searchResultVar);
		
	}
	
	
	
	
	

}
