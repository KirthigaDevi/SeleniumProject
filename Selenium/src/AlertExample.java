 

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");

		driver.findElement(By.linkText("Alert")).click();

		//1.Click Alert box
		WebElement alertbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertbox.click();
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		//2.Click Confirm Box for Accept 
		WebElement Confirmationboxaccept = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		Confirmationboxaccept.click();
		Alert confirmboxaccept = driver.switchTo().alert();
		
		confirmboxaccept.accept();
		
		//3.Click COnfirm box for dismiss
		
		WebElement Confirmationboxdismiss = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		Confirmationboxdismiss.click();
		Alert confirmboxdismiss = driver.switchTo().alert();
		
		
		
		//4.Click on PromptAlert
		WebElement Prompt = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		Prompt.click();
		Alert promptalert = driver.switchTo().alert();
		promptalert.sendKeys("Learn Automation Online");
		
		promptalert.accept();
		

	}


}
