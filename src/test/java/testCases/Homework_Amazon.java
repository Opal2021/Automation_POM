package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.ConfigurationReader;
import utilities.Driver;

public class Homework_Amazon {

//java //Homework
    
    //go on amazon
    //search for "macbook pro"
    //get the text of search Results on top left corner of the page
    //make sure to store all test data and xpath/locators in the .properties file
    
    //note : utilize Driver.java and testDataReader.java classes to do these tasks
	
	@BeforeMethod
	
	public void OpenBrowser() {
		
		
		Driver.getDriver();
		//.get(ConfigurationReader.getProperty("url"));
		//Driver.getDriver().manage().window().maximize();
		//Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
	}
	
	
	@Test
	
	public void task() throws InterruptedException {
		
		Driver.getDriver().findElement(By.xpath(ConfigurationReader.getProperty("searchBox"))).sendKeys("macbook pro",Keys.ENTER);
		 
        Thread.sleep(3000);
        
	    String text = Driver.getDriver().findElement(By.xpath(ConfigurationReader.getProperty("textMacbook"))).getText();
	    
	    System.out.println(text);
		
	    

		
}
	
	@AfterMethod

	public void tearDown() {
		Driver.getDriver().close();

	}
	
	
}//end class
