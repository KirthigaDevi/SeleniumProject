import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\eclipse\\drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
 driver.get("http://leafground.com/");
 
 driver.findElement(By.linkText("Radio Button")).click();
 
 WebElement unchecked = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[1]"));
 WebElement checked = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[2]"));
 
 boolean uncheckstatus = unchecked.isSelected();
 boolean checkedstatus = checked.isSelected();
 
 System.out.println(uncheckstatus);
 System.out.println(checkedstatus);
 
WebElement age = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[2]"));
age.click();
	}

}
