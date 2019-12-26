package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search 
{
	public WebDriver driver;
	
    @FindBy(xpath="//div[@title='Search']")
	private WebElement srch;
    
	
	@FindBy(id="mainSearch")
	private WebElement Search;
	
	@FindBy(xpath="//div[.='Search']")
	private WebElement searchicon;
	
	@FindBy(xpath="//span[.='Club Mahindra Madikeri, Coorg']")
	private WebElement result1;
	
	public Search(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Search1(WebDriver driver,String text)
	{
		   WebDriverWait wait=new WebDriverWait(driver,15);
		

			srch.click();
			
			wait.until(ExpectedConditions.visibilityOf(Search));
			Search.sendKeys(text);
			
			searchicon.click();
			
			wait.until(ExpectedConditions.elementToBeClickable(result1));
			result1.click();
	}
		
}
	


