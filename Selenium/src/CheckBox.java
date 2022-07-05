import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("http://leafground.com/");
		 
		 driver.findElement(By.linkText("Checkbox")).click();
		 
		 WebElement languagejava = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[1]"));
		 languagejava.click();
		 
		 WebElement languageC = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[4]"));
		 languageC.click();
		 
		 WebElement Isselect = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]"));
		 boolean Isselectselenium = Isselect.isEnabled();
		 System.out.println(Isselectselenium);
		 
		 WebElement notSelected = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[1]"));
		 if (notSelected.isSelected()) {
			 notSelected.click();
		}
		 
		 WebElement selected = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[2]"));
		 	 selected.click();
	
	}
	

}
