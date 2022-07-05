package TestNG;

import org.testng.annotations.Test;

public class sampleTestCase {

	//**************To make a test case to run in a specific order use
	//PRIORITY as a attribute for TEST Annotation*******************
	
	@Test(priority = 0)
	public void firstTestcase() {
		System.out.println("This is my first test case");
	}
	@Test(priority = 1)
	public void secondTestcase() {
		System.out.println("This is my second test case");
	}
	@Test(priority = 2)
	public void thirdTestcase() {
		System.out.println("This is my third test case");
	}
	
	//**************To SKIP the test case, make the ENABLE Attribute To FALSE************************ 
	
	@Test(priority = 3,enabled = false)
	public void fourthTestcase() {
		System.out.println("This is my fourth test case");
	}
	@Test(priority = 4)
	public void fifthTestcase() {
		System.out.println("This is my fifth test case");
	}
	@Test(priority = 5)
	public void sixthTestcase() {
		System.out.println("This is my sixth test case");
	}
	
	
	
}
