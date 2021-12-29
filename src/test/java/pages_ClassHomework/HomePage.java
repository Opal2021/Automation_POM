package pages_ClassHomework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigurationReader;
import utilities.Driver;

public class HomePage {

	public HomePage() {

		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//*[@id=\"Main\"]/section[1]/div/div/div[3]/div/div/div[2]/div/div/div[1]/div/a")

	public WebElement linkButton;
	
   
	//OrangeHRM
	
	@FindBy(id="twotabsearchtextbox")
	
	public WebElement searchField;
	
     @FindBy(id="nav-search-submit-button")
	
	public WebElement SearchButton;

	@FindBy(id = "txtUsername")

	public WebElement userName;

	@FindBy(id = "txtPassword")

	public WebElement passWord;

	@FindBy(id = "btnLogin")

	public WebElement loginButton;

    public void searchItem(String item) {
		
		searchField.clear();
		searchField.sendKeys(item);
	}
	
	
	
	public void click() {

		linkButton.click();
		loginButton.click();
	}
	
	public void login() {
		
		
		userName.sendKeys(ConfigurationReader.getProperty("orangeUsername"));
		passWord.sendKeys(ConfigurationReader.getProperty("orangePassword"));
		loginButton.click();
		
		
	}

}
