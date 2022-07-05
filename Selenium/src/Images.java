import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Images {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");

		driver.findElement(By.linkText("Image")).click();
		
		WebElement homeImage = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img")) ;
		homeImage.click();
	
		driver.findElement(By.linkText("Image")).click();
		
		WebElement brokenImage = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
		
		if(brokenImage.getAttribute("naturalWidth").equals("0"))
		{
		System.out.println("The Image is Broken");
		}
		else{
			System.out.println("The Image is not Broken");
		}
		
	}

}
