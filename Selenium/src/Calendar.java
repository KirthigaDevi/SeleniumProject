import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/");
		
		driver.findElement(By.linkText("Calendar")).click();
		
		WebElement datepicker = driver.findElement(By.id("datepicker"));
		datepicker.click();
		//datepicker.sendKeys("06/10/2022"+Keys.ENTER);
		
		//a[@title='Next']
		
		WebElement nextbutton = driver.findElement(By.xpath("//a[@title='Next']"));
		nextbutton.click();
		
		WebElement datetobegiven = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		datetobegiven.click();
		//a[contains(text(),'10')]
	}

}
