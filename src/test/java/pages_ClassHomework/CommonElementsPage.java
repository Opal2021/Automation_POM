package pages_ClassHomework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class CommonElementsPage {

	public CommonElementsPage() {

		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id="menu_admin_viewAdminModule")

	public WebElement adminTab;
	
	@FindBy(id="menu_admin_nationality")

	public WebElement nationalitiesTab;
	
	
	public void click() {

		adminTab.click();
		nationalitiesTab.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
