package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	WebDriver driver;
	long startTime ;
	long endTime;
	long totalTime;

	@BeforeSuite
	
	public void launchBrowser() {
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void openGoogle() {

		driver.navigate().to("http://www.google.co.in");
	}

	@Test
	public void openBing() {

		driver.navigate().to("http://www.bing.com");
	}

	@Test
	public void openYahoo() {
		driver.navigate().to("http://www.yahoo.com");
	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		endTime = System.currentTimeMillis();
		totalTime = endTime-startTime;
		System.out.println("Total time taken"+totalTime);

	}

}



	

	