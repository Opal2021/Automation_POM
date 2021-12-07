package pagesClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class HomePage {

	
	
	public HomePage() {
		
		PageFactory.initElements(Driver.getDriver(), this);
		
		
	}
	
	@FindBy(id="twotabsearchtextbox")
	
	public WebElement searchField;
	
     @FindBy(id="nav-search-submit-button")
	
	public WebElement SearchButton;
	
	public void searchItem(String item) {
		
		searchField.clear();
		searchField.sendKeys(item);
	}
	
	
	
   public void click() {
		
	   SearchButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
