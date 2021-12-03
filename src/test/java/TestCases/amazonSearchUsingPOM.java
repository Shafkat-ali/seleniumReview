package TestCases;

import org.testng.annotations.Test;

import PageClass.HomePage;
import PageClass.SearchResultPage;
import Utilities.Driver;
import Utilities.testDataReader;

public class amazonSearchUsingPOM {
	
	HomePage homePage = new HomePage();
	SearchResultPage searchResultPage = new SearchResultPage();
	
	@Test
	public void task1() {
		
		Driver.getDriver();
		//homePage.searchField.sendKeys(testDataReader.getProperty("searchKeyWord"));
		homePage.searchItem(testDataReader.getProperty("searchKeyWord"));
		homePage.searchItem(testDataReader.getProperty("searchKeyWord2"));
		homePage.click();
		
		
		String text = searchResultPage.searchResultText.getText();
		System.out.println(text);
		
	}
	
	
	
	

}
