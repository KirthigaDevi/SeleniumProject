import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");

		driver.findElement(By.linkText("Down Files")).click();
		
		WebElement downloadexcel = driver.findElement(By.linkText("Download Excel"));
		//("//*[@id=\'contentblock\']/section/div/div/div/a[1]"));
		downloadexcel.click();
		
		WebElement downloadPDF = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div/div/div/a[2]"));
		downloadPDF.click();
		
		//*[@id="contentblock"]/section/div/div/div/a[3]
		
		WebElement downloadText = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div/div/div/a[3]"));
		downloadText.click();
		
	}

}
