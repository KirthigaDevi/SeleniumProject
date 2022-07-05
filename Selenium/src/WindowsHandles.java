import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("http://leafground.com/");
		 
		 driver.findElement(By.linkText("Window")).click();
		 
		String oldwindow = driver.getWindowHandle();
		 WebElement homepage = driver.findElement(By.xpath("//*[@id=\"home\"]"));
		 homepage.click();
	
		Set<String> handels = driver.getWindowHandles();
		
		for (String newwindow : handels) {
			driver.switchTo().window(newwindow);
		}
		 
		 WebElement newwindowEdit = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
		 
		 driver.close();
		 
		 driver.switchTo().window(oldwindow);
		 
		 WebElement multiplewindow = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
			multiplewindow.click();


			int numberofwindow = driver.getWindowHandles().size();
			System.out.println("Number of Window Opened is :"+numberofwindow);
}
	
	}
