package demosite.center;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Testing_HomePage {
	
	
	@Test
	public void Verify_category_Posts() throws Exception
	{
		WebDriver driver= BrowserFactory.StartBrowser("chrome","http://demosite.center/wordpress/wp-login.php");
		LogInpage login= PageFactory.initElements(driver,LogInpage.class);
		Excel_For_LogIn excel= new Excel_For_LogIn("D:\\Users\\pvyavaha\\Desktop\\LogIn_Credentials_Wordpress.xlsx");
		String username= excel.getData(0, 0, 0);
		String password= excel.getData(0, 0, 1);
		 login.Login_wordpress(username, password);
		 Home_Page Home= new Home_Page( driver);
		 Home.ClickOnPost();
		 Posts_Page PP= PageFactory.initElements(driver, Posts_Page.class);
		PP.EnterContents("I got a new idea", "I got a new idea");
		String Title=driver.getTitle();
		System.out.println(Title);
		//if(Title.contentEquals())
	}
	

}
