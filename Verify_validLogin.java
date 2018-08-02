package demosite.center;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Verify_validLogin {
	
	@Test
	public void checkvaliduser()
	{
		
		WebDriver driver=BrowserFactory.StartBrowser("chrome", "http://demosite.center/wordpress/wp-login.php");	//LogInpage login= PageFactory.initElements(driver, LogInpage.class);
		
		
		LogInpage login1=  PageFactory.initElements(driver,LogInpage.class);
		
		ExcelSheetConfig excel= new ExcelSheetConfig("D:\\Users\\pvyavaha\\Desktop\\excel sheet for data driven.xlsx");
		String uname= excel.getData(0, 0, 0);
		String pass= excel.getData(0, 0, 1);
		
		System.out.println(uname);
		
		login1.Login_wordpress(uname,pass);
	}

}
