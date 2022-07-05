import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");

		driver.findElement(By.linkText("Drop down")).click();;

		//1.Select the dropdown by INDEX
		
		WebElement Dropdown1 = driver.findElement(By.id("dropdown1"));
		Select select = new Select(Dropdown1);
		select.selectByIndex(3);

		//2.Select Dropdown by Text
		
		WebElement Dropdown2 = driver.findElement(By.name("dropdown2"));
		Select select2 = new Select(Dropdown2);
		select2.selectByVisibleText("Selenium");

 		//3.Select Dropdown by Value
		
		WebElement Dropdown3 = driver.findElement(By.id("dropdown3"));
		Select select3 = new Select(Dropdown3);
		select3.selectByValue("2");
		
		//4.Get the dropdown count
		
		WebElement Dropdown4 = driver.findElement(By.className("dropdown"));
		Select select4 = new Select(Dropdown4);
		List <WebElement> listofoptions = select4.getOptions();
		int size = listofoptions.size();
		System.out.println("THe list of Options in the dropdown is"+size);
		
		//5.Using Sendkeys
		
		WebElement Dropdown5 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
		Dropdown5.sendKeys("Loadrunner");
		
		//6.Multi select dropdown
		
		WebElement multiselect = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select/option[1]"));
		Select multiselectbox = new Select(multiselect);
		multiselectbox.selectByIndex(1);
		multiselectbox.selectByIndex(2);
		multiselectbox.selectByIndex(3);
	
		driver.quit();
	}

}
