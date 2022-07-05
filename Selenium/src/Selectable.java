import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");

		driver.findElement(By.linkText("Selectable")).click();

		List <WebElement> selectable  = driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));

		int listofitems = selectable.size();

		Actions action = new Actions(driver);

		/*action.keyDown(Keys.CONTROL).
		click(selectable.get(0)).
		click(selectable.get(1)).
		click(selectable.get(2)).
		build().perform();*/
		
		action.clickAndHold(selectable.get(0));
		action.clickAndHold(selectable.get(1));
		action.clickAndHold(selectable.get(2));
		action.build().perform();
	}

}