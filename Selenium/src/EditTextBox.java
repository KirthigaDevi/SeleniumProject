import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditTextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://leafground.com/");
	
	driver.findElement(By.linkText("Edit")).click();
	
	// driver.findElement(By.id("email")).sendKeys("test@gmail.com");
	WebElement emailbox = driver.findElement(By.id("email"));
	emailbox.sendKeys("test@gmail.com");
	
	//driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input")).sendKeys("test");
	WebElement appendbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
	appendbox.sendKeys("TEST");
	
	
	WebElement getTextbox = driver.findElement(By.name("username"));
	String value = getTextbox.getAttribute("value");
	
	System.out.println(value);
	
	
	WebElement clearTextbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
	clearTextbox.clear();
	
	WebElement disabledbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
	boolean enabled = disabledbox.isEnabled();
	System.out.println(enabled);
	
	driver.quit(); 
	}

}
