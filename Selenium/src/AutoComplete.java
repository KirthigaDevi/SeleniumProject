import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");

		driver.findElement(By.linkText("Auto Complete")).click();
		
		WebElement input = driver.findElement(By.id("tags"));
		input.sendKeys("S");
		Thread.sleep(4000);// use Explicit wait / Implicit wait instead
		
		List <WebElement> optionsList = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		
		for (WebElement webElement : optionsList) {
			
			if (webElement.getText().equals("Web Services")) {
			webElement.click();
			break;
		}
		
		}
	}

}
