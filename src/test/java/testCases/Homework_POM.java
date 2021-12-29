package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages_ClassHomework.HomePage;
import pages_ClassHomework.LoginPage;
import pages_ClassHomework.LogoutPage;
import pages_ClassHomework.PaymentPage;
import pages_ClassHomework.UserDashboard;
import utilities.CommonMethods;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Homework_POM extends CommonMethods{

//	1. navigate to https://phptravels.com/demo
//		2. click and navigate to 'Agent Front-End' Page
//		3. Login with given valid credentials
//		4. Clinic on 'Add Funds' tab on left
//		5. Click on first radio button named 'Pay with bank transfer'
//		6. Click on 'Pay Now' button, and verify you are on 'pay now' page
//		7. Click on 'Back to Invoice', and user should get a message 'Are you sure?'
//		8. Click yes, and navigate back to 'Add Funds' so that user can logout
//		9. verify user logged out
//
//		make sure to use POM design pattern and store all your project data in properties file 

	HomePage homePage = new HomePage();
	
	LoginPage loginPage = new LoginPage();
	
	UserDashboard DB = new UserDashboard();
	
	PaymentPage PM = new PaymentPage();
	
	Actions act = new Actions(Driver.getDriver());
	
	LogoutPage LO = new LogoutPage();

	@Test

	public void login() throws InterruptedException {

		Driver.getDriver();

		homePage.linkButton.click();

		String parentTab = Driver.getDriver().getWindowHandle();

		Set<String> allTabs = Driver.getDriver().getWindowHandles();

		System.out.println(allTabs.size());

		Iterator<String> iterator = allTabs.iterator();

		while (iterator.hasNext()) {

			String childWindow = iterator.next();

			if (!parentTab.equalsIgnoreCase(childWindow)) {

				Driver.getDriver().switchTo().window(childWindow);
			}
		}
			String childTitle = Driver.getDriver().getTitle();

			System.out.println(childTitle);

//			Driver.getDriver().switchTo().window(parentTab);
//			
//			 System.out.println(Driver.getDriver().getTitle());
		 
		
		
			loginPage.emailField.sendKeys(ConfigurationReader.getProperty("Email"));
            loginPage.passwordBox(ConfigurationReader.getProperty("Password"));
		    loginPage.loginBtn.click();
		    
	
		
			DB.addFunds.click();
			DB.radioBtn.click();
			
			String expectResult = "Pay Now";
			String actualResult = DB.payNowBtn.getText();
			
			AssertJUnit.assertEquals(expectResult, actualResult);
            
			DB.payNowBtn.click();
			
			Thread.sleep(3000);
			
			act.moveToElement(PM.backBtn).doubleClick().perform();
			
			Thread.sleep(3000);
			
			PM.yesBtn.click();
			
			LO.logoutButton.click();
			
			String expectResultLogInText = "Login";
			String actualResultLogInText = loginPage.loginText.getText();
			
			AssertJUnit.assertEquals(expectResultLogInText, actualResultLogInText);
		} 

}
