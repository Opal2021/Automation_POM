package pages_ClassHomework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class UserDashboard {

	public UserDashboard() {

		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/ul/li[3]/a")

	public WebElement addFunds;
	
	@FindBy(xpath = "//*[@id=\"gateway_bank-transfer\"]")

	public WebElement radioBtn;
	
	@FindBy(xpath = "/html/body/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div/div[2]/div/button")

	public WebElement payNowBtn;
	
	@FindBy(xpath = "/html/body/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div/div[2]/div/button/text()")

	public WebElement payNowText;
	

	
	public void click() {

		addFunds.click();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
