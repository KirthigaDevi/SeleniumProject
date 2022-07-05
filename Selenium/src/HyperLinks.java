import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/");

		//IN GET WE CANNT DO REFRESH OR BACK

		//IN NAVIGATE WE CAN PERFORM BACK and refresh

		driver.findElement(By.linkText("HyperLink")).click();

		WebElement homepagelink = driver.findElement(By.linkText("Go to Home Page"));
		homepagelink.click();

		driver.navigate().back();

		WebElement whereToGo = driver.findElement(By.partialLinkText("Find where am"));
		String where = whereToGo.getAttribute("href");
		System.out.println("This link is going to"+where);

		

		WebElement brokenlink = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/a"));
		brokenlink.click();

		String title = driver.getTitle();
		if (title.contains("404"))
		{
			System.out.println("Link is Broken");
		}

		driver.navigate().back();

		homepagelink.click();

		driver.navigate().back();

		List <WebElement> totallinks = driver.findElements(By.tagName("a"));
		int linkcount = totallinks.size();
		System.out.println("No. of Links in the page is : " +linkcount);

		driver.quit();
	}

}
