import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/");
		
		driver.findElement(By.linkText("Table")).click();
		
		List <WebElement> columns = driver.findElements(By.tagName("th"));
		int columncount = columns.size();
		System.out.println("Number of Columns is : " +columncount);
		
		List <WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowcount = rows.size();
		System.out.println("Number of Rows is : " +rowcount);
		
		WebElement getPercentage = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String percent = getPercentage.getText();
		System.out.println("Percentage is : " +percent);
		
		
		List <WebElement> allProgress = driver.findElements(By.xpath("//td[2]"));
		
		List<Integer> numberList = new ArrayList<Integer>();
		for (WebElement webElement : allProgress) {
			String individualValue = webElement.getText().replace("%","");
			
			numberList.add(Integer.parseInt(individualValue));
		}
		
		System.out.println("Final List"+numberList);
		int smallValue = Collections.min(numberList);
		System.out.println(smallValue);
		
		//String smallValueString = Interger.toString(smallValue);
		//String finalXpath = "//td[normalize-space()="
		//td[normalize-space()='Learn to interact with Elements']//following::td[1]
		
		
		
	
	}

}
