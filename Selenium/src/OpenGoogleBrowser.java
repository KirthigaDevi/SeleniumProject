import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//1.OpenChrome
		//2.Google Home Page
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.co.in");
		driver.quit();
	}

}
