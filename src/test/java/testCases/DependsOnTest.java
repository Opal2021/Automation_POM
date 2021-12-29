package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnTest {

	 @Test(dependsOnMethods = { "initEnvironmentTest" })
	    public void test1() {

	     System.out.println("this is test1 -- depends on initEnvironmentTest");
	    }

	    @Test
	    public void test2() {
	         System.out.println("this is test2 -- independent");

	    }

	    @Test
	       public void initEnvironmentTest() {
	          System.out.println("This is initEnvironmentTest");
	          //intend to make it fail
	          Assert.assertTrue(false);
	       }


	    //  dependsOnMethods = { "initEnvironmentTest" }

}
