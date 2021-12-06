package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	protected static WebDriver driver;
	
	public static void browserlaunch() {
		
		String browser="firefox";
		
		if(browser.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			
		}else if(browser.equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			
		} else if(browser.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver= new InternetExplorerDriver();
			
		}
		
		
		driver.get("http://advantageonlineshopping.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		
	}
	
	

}
