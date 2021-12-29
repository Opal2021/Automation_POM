package testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTest {
	@DataProvider(name = "batch8")
	   public static Object[][] primeNumbers() {
	      return new Object[][] {{2, true}, {6, false}, {19, true}, {22, false}, {23, true},{200, false}};
	   }
	   
	   
	   @DataProvider(name = "batch9")
	   public static Object[][] primeNumbers2() {
	      return new Object[][] {{2, true}, {6, false}, {19, true}, {22, false}, {23, true}};
	   }
	   
	  	   
	   @Test(dataProvider = "batch8")
	   public void testPrimeNumberChecker(Integer inputNumber, Boolean expectedResult) {
	      System.out.println(inputNumber + " = " + expectedResult);
	   }

}
	
	

