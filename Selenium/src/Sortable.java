import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		/*System.setProperty("Webdriver.chrome.driver", "C:\\eclipse\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/");*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/");
		
		WebElement sortable = driver.findElement(By.linkText("Sortable"));
		sortable.click();
		
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id='sortable']/li"));
		
		WebElement fromElement = elements.get(6);
		WebElement toElement = elements.get(0);
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(fromElement);
		actions.moveToElement(toElement);
		actions.release(toElement);
		actions.release(fromElement);
		actions.build().perform();
		
	}

}
