package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import utilities.Driver;

public class ParallelTest {

	@Test
	public void method1() {
		Driver.getDriver();
		System.out.print("method1");
	}

	@Test
	public void method2() {
		Driver.getDriver();
		System.out.print("method2");
	}
	
}
