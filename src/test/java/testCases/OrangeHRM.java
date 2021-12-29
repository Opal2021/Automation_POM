package testCases;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.CommonMethods;
import utilities.ConfigurationReader;
import utilities.Driver;

public class OrangeHRM extends CommonMethods {

	
	
	
//	@BeforeMethod
//	
//	public void setUp() {
//		
//		Driver.getDriver();
//		
//	}
//	
//	
//	@Test
//	
//	public void loginToHRM() {
//		
////		homepage.userName.sendKeys(ConfigurationReader.getProperty("orangeUsername"));
////		homepage.passWord.sendKeys(ConfigurationReader.getProperty("orangePassword"));
////		homepage.loginButton.click();
//		
//		homepage.login();
//	//	dashpage.welcomeText.getText().contains(ConfigurationReader.getProperty("verifyWelcomeText"));
//		AssertJUnit.assertTrue(dashpage.welcomeText.getText().contains(ConfigurationReader.getProperty("verifyWelcomeText")));
//	
//	
//		comElPage.adminTab.click();
//		comElPage.nationalitiesTab.click();
//		
//		CommonMethods.wait(3);
//		CommonMethods.scrollDown(600);
//		CommonMethods.wait(3);
//		
//	}
//	
//	@AfterMethod
//	public static void closeDriver() {
//		if (driver != null) {
//			driver.close();
//			driver = null;
//		}
//	
//	}	
	
	@BeforeMethod(alwaysRun=true)
    public void setUp() {
        Driver.getDriver();
        
    }
    
                                                  //some company dont allow you to comments so you need this !!!
    @Test(groups = { "smokeTest", "functionalTest","Regression" },description = "Test summary")
    public void loginToHRM() {
        homepage.login();
        
        AssertJUnit.assertTrue(dashpage.welcomeText.getText().
                contains(ConfigurationReader.getProperty("verifyWelcomeText")));
                
    }
    
    
    @Test
    public void deleteNationality() {
        homepage.login();
        
        AssertJUnit.assertTrue(dashpage.welcomeText.getText().
                contains(ConfigurationReader.getProperty("verifyWelcomeText")));
        
        comElPage.adminTab.click();
        comElPage.nationalitiesTab.click();
        
        CommonMethods.wait(3);
        
        CommonMethods.scrollDown(600);
        
        CommonMethods.wait(3);

                
    }
    
    

    @Test(groups = { "smokeTest" })
    public void loginToHRM2() {
        System.out.println("login 2");
        homepage.login();
        
        AssertJUnit.assertTrue(dashpage.welcomeText.getText().
                contains(ConfigurationReader.getProperty("verifyWelcomeText")));
                
    }
    
    
    
    @AfterMethod(alwaysRun=true)
    public void tearDown() {
        Driver.closeDriver();
    }
    

    @Test
    public void loginToHRM3() {
        System.out.println("login 3");
        homepage.login();
        
        AssertJUnit.assertTrue(dashpage.welcomeText.getText().
                contains(ConfigurationReader.getProperty("verifyWelcomeText")));
                
    }
    
    
    

    @Test(groups = { "smokeTest" })
    public void loginToHRM4() {
        System.out.println("login 4");
        homepage.login();
        
        AssertJUnit.assertTrue(dashpage.welcomeText.getText().
                contains(ConfigurationReader.getProperty("verifyWelcomeText")));
                
    }
    
    
    
}
