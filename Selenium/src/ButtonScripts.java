import java.awt.Color;
import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonScripts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://leafground.com/");
		
driver.findElement(By.linkText("Button")).click();

	//1.Find Button position
WebElement getPositionButton = driver.findElement(By.id("position"));

org.openqa.selenium.Point xypoint = getPositionButton.getLocation();
int xvalue =  xypoint.getX();
int yvalue = xypoint.getY();

	System.out.println("X value is"+xvalue+"Y value is"+yvalue);
	
	//2.Find Button Colour
	
	WebElement ButtonColor = driver.findElement(By.id("color"));
	
	String color = ButtonColor.getCssValue("background-color");
    System.out.println("Button color is"+color);

	//3.Find Button Size
    
    WebElement Sizebutton = driver.findElement(By.id("size"));
   int height = Sizebutton.getSize().getHeight();
   int width =  Sizebutton.getSize().getWidth();
	System.out.println("Height of the button is :"+height+ "Width of the button is :"+width);
	
	//4. Click the button	
	WebElement Homebutton = driver.findElement(By.id("home"));
	Homebutton.click();

	driver.quit();
	}

}
