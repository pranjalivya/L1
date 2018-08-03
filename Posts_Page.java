package demosite.center;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Posts_Page {
	
	//WebDriver driver;
	@FindBy(how= How.CLASS_NAME,using="page-title-action") WebElement AddNew;
	@FindBy(id="title-prompt-text") WebElement AddNewPosts;
	
	@FindBy(id="content") WebElement Contents;
	@FindBy(id="publish") WebElement Publish;
	//private WebDriver driver;
	
	Actions actions = new Actions(BrowserFactory.driver);
    
	public void EnterContents(String field1, String field2) throws InterruptedException
	{
		AddNew.click();
		actions.moveToElement(AddNewPosts);
	    WebDriverWait wait= new WebDriverWait(BrowserFactory.driver,15);
        wait.until(ExpectedConditions.visibilityOf(AddNewPosts));
        wait.until(ExpectedConditions.elementToBeClickable(AddNewPosts));
         boolean check=	AddNewPosts.isDisplayed();
         System.out.println(check);
		actions.sendKeys(field1);
		 actions.build().perform();
		Contents.sendKeys(field2);
		Publish.click();
		
	}
	

}
