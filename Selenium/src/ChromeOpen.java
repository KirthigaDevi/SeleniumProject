import java.net.URL;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicInteger;

import java.net.MalformedURLException;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeOpen {

	public static void main(String[] args) {
		
		String pageUrl;
		String pageTitle;
		String driverHost;
		String driverPort;
		String browserVersion;
		String hubURL = "http://localhost:4444/wd/hub";
		WebDriver driver;
		 AtomicInteger browserType = new AtomicInteger(0);
		
		ChromeOptions options = new ChromeOptions(); 
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.setCapability("browserName", "chrome");
		options.setAcceptInsecureCerts(false);
		options.setPageLoadTimeout(Duration.ofSeconds(60));
		options.setScriptTimeout(Duration.ofMinutes(60));
		options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);
		/*
		 * driver = new RemoteWebDriver(hubURL, options); break;
		 */
	}

}
