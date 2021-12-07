package pages_ClassHomework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class LogoutPage {

	public LogoutPage() {

		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/ul/li[5]/a")

	public WebElement logoutButton;


	
	public void click() {

		logoutButton.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
