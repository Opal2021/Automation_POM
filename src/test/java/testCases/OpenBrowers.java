package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ConfigurationReader;
import utilities.Driver;

public class OpenBrowers {

	
//	WebDriver driver;

	@BeforeMethod

	public void setUp() {

//		WebDriverManager.chromedriver().setup();
//		
//		driver = new ChromeDriver();
//				
//		//driver.get("https://www.usshortcodes.com/csca/#/login");
//		
//		driver.get(ConfigurationReader.getProperty("url"));
//		
//		driver.manage().window().maximize();
//		
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	Driver.getDriver();

	}

	@Test

	public void test1() {

		String popularDealText = Driver.getDriver().findElement(By.xpath(ConfigurationReader.getProperty("popularDeal"))).getText();

		System.out.println(popularDealText); 
		
	//	System.out.println(ConfigurationReader.getProperty("url"));

	}

	@AfterMethod

	public void tearDown() {

	}

}
