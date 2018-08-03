package demosite.center;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Page {
	
	WebDriver driver;
	
	
	public Home_Page(WebDriver driver) {
		
		this.driver= driver;
		
	}
	
	By Home= By.partialLinkText("Home");
	By Updates =By.xpath("//a[@href='update-core.php']");
	By Posts = By.linkText("Posts");
	
	
	public void ClickOnPost()
	{
		driver.findElement(Posts).click();
	}

}
