import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v99.network.model.WebTransportCreated;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");

		driver.findElement(By.linkText("Tool Tip")).click();
		
		WebElement tooltip = driver.findElement(By.id("age"));
		
		String name = tooltip.getAttribute("title");
		System.out.println(name);

	}

}
