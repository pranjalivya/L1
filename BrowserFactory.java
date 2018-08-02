package demosite.center;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	 public static WebDriver StartBrowser(String Brow_name, String Url) {
		 
		 if(Brow_name.equalsIgnoreCase("firefox"))
			 {
			 System.setProperty("webdriver.chrome.driver", "D:\\Users\\pvyavaha\\Downloads\\chromedriver.exe");
			  driver = new FirefoxDriver();
			  
		    }
		 else if(Brow_name.equalsIgnoreCase("chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver", "D:\\Users\\pvyavaha\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
//			 System.out.println(driver);
			 driver.manage().window().maximize();
			 driver.get(Url);
			 
		 }
		 else if(Brow_name.equalsIgnoreCase("ie"))
		 {

			 System.setProperty("webdriver.chrome.driver", "D:\\Users\\pvyavaha\\Downloads\\chromedriver.exe");
			 driver = new  InternetExplorerDriver();
			
		 }
		 
		 System.out.println(driver);
		
		 return driver;
	 }

}
