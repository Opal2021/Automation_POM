package pages_ClassHomework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class PaymentPage {

	public PaymentPage() {

		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//body/div[1]/div[2]/div[2]")

	public WebElement backBtn;

	@FindBy(xpath = "/html/body/div/div[2]/div[1]/a")

	public WebElement yesBtn;

	
	public void click() {

		backBtn.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
