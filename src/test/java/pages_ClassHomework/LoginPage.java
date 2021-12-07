package pages_ClassHomework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class LoginPage {

	
	public LoginPage() {

		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/form/div[1]/div/input")

	public WebElement emailField;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/form/div[2]/div[1]/input")
	
	public WebElement passwordField;
	
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button")
	
	public WebElement loginBtn;
    
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/div/h5")
	
	public WebElement loginText;
    
    
	
	public void emailBox(String item) {

		emailField.clear();
		emailField.sendKeys(item);
		
	}
	public void passwordBox(String item) {

		passwordField.clear();
		passwordField.sendKeys(item);
		
	}
	
	
	public void click() {

		loginBtn.click();
		
	}

	
		
	
	
	
	
	
	
	
	
	
	
	
	
}
