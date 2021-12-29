package utilities;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import pages_ClassHomework.CommonElementsPage;
import pages_ClassHomework.HomePage;
import pages_ClassHomework.UserDashboard;

public class PageInitializer extends Driver{

	public static HomePage homepage;
	public static UserDashboard dashpage;
	public static CommonElementsPage comElPage;
	
	public static void initialize() {
		
		homepage = new HomePage() ;
		dashpage = new UserDashboard();
		comElPage = new CommonElementsPage();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
