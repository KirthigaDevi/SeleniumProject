import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://leafground.com/");

driver.findElement(By.linkText("Frame")).click();

driver.switchTo().frame(0);
WebElement frame1 = driver.findElement(By.id("Click"));
frame1.click();

String text = driver.findElement(By.id("Click")).getText();
System.out.println(text);

driver.switchTo().defaultContent();
driver.switchTo().frame(1);
driver.switchTo().frame("frame2");

WebElement text2 = driver.findElement(By.id("Click1"));
text2.click();

driver.switchTo().defaultContent();
List <WebElement> totalframes =  driver.findElements(By.tagName("iframe"));
int framesize = totalframes.size();
System.out.println(framesize);

driver.quit();
	}

}
