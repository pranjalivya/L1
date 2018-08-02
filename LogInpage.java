/**
 * 
 */
package demosite.center;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author pvyavaha
 * 
 * 
 * This pagefactory stores all the elements of LogIn Page
 *
 */
public class LogInpage {
//	WebDriver driver  = new ChromeDriver();
	
	
//	public LogInpage(WebDriver dri)
//	{
//		this.driver=dri;
//	}
	 

	@FindBy(id="user_login") WebElement Username;
	
	@FindBy(how=How.ID,using="user_pass") WebElement pass;
    @FindBy(how=How.ID,using="wp-submit") WebElement Log_in_Butt;
    @FindBy(how=How.LINK_TEXT,using="Lost your password") WebElement Lost_pass;
    
    
    public void Login_wordpress(String uid, String Pass)
    {
    	//System.out.println(uid);
    	
//    	System.out.println("ADfad  " + driver.);
    	
    	Username.sendKeys(uid);
    	pass.sendKeys(Pass);
    	Log_in_Butt.click();
    }
	
}
