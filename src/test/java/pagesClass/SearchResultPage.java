package pagesClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class SearchResultPage {

	
    public SearchResultPage() {
		
		PageFactory.initElements(Driver.getDriver(), this);
		
		
	}
	
	
   @FindBy(xpath ="//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div")
	
	public WebElement searchResultText;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
