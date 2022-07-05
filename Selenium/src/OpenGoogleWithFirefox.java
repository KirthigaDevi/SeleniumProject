import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleWithFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.Opening Google chrome in Firefox browser
		System.setProperty("webdriver.gecko.driver", "C:\\eclipse\\drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.co.in");
		
	//Enter Search Term with element name
		driver.findElement(By.name("q")).sendKeys("Chidambaram"+Keys.ENTER);
		
		driver.findElement(By.linkText("Chidambaram - Wikipedia")).click();
	
		driver.quit();
		
	}

}
