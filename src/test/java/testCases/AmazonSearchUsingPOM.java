package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pagesClass.HomePage;
import pagesClass.SearchResultPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class AmazonSearchUsingPOM {
 
	
	HomePage homePage =new HomePage();
	
	SearchResultPage searchResultPage = new SearchResultPage();
	
	@Test
	
	public void task1() {
		
		
		Driver.getDriver();
		
		//homePage.searchField.sendKeys(ConfigurationReader.getProperty("searchKeyWord"));
	
		//1st one is taking the searchItem Method from  HomePage class and passing the value from the 
		homePage.searchItem(ConfigurationReader.getProperty("searchKeyWord"));
		
		//2nd one ,we are getting the searchbox Element and passing the String Key ourself
		
		//homePage.searchBox.SendKeys("macBook");
		
		homePage.searchItem(ConfigurationReader.getProperty("searchKeyWord2"));
		
		homePage.click();
		
	String text = searchResultPage.searchResultText.getText();
	
	System.out.println(text);
		
		
		
	}
	
}
