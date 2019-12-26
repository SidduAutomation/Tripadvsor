package pom;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Rating 
{
	
	@FindBy(id="bubble_rating")
	private WebElement rating;
	
	@FindBy(name="ReviewTitle")
	private WebElement title;
	  
    @FindBy(name="ReviewText")
	private WebElement urreview;
	  

	
	@FindBy(xpath="//div[.='Hotel Ratings']")
	private WebElement hotelratings;

	@FindBy(xpath="//span[@id='qid12_bubbles']")
	private WebElement service;
 
	
	@FindBy(name="noFraud")
	private WebElement chkbox;

	public Rating(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void selectRating(WebDriver driver)
	{
		Actions act=new Actions(driver);
 	    WebDriverWait wait=new WebDriverWait(driver,15);
 	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("bubble_rating")));
			
	    wait.until(ExpectedConditions.elementToBeClickable(rating));
		
		act.moveToElement(rating,10, 0).perform();
		
		act.moveToElement(rating,20, 0).perform();
        
		act.moveToElement(rating,30, 0).perform();
		
		act.moveToElement(rating,40, 0).perform();
		
        act.moveToElement(rating,50, 0).click().build().perform();
        
        
	}
	public void reviewTitle(String text)
	{
		title.sendKeys(text);
	}
	public void urReview(String text)
	{
		urreview.sendKeys(text);
	}
	
	
	 public void servicerating(WebDriver driver)
	 {
		   WebDriverWait wait=new WebDriverWait(driver,15);
			
		   
		  try
		  {wait.until(ExpectedConditions.visibilityOf(hotelratings));
		  }
		  catch(Exception e)
		  {
			  System.out.println("not present");
		  }
		   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@id='qid12_bubbles']")));
		   
		   int x = hotelratings.getLocation().getX();
		   int y = hotelratings.getLocation().getY();
		   
		   JavascriptExecutor js=(JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy("+x+","+y+")");
			Actions act=new Actions(driver);
        
			act.moveToElement(service,10, 0).perform();
			
			act.moveToElement(service,20, 0).perform();
	        
			act.moveToElement(service,30, 0).perform();
			
			act.moveToElement(service,40, 0).perform();
			
	        act.moveToElement(service,50,0).click().build().perform();
	        
	        chkbox.click();
	        
	 }  
		
	

}
