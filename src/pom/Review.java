package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Review 
{
  @FindBy(xpath="//a[.='Write a review']")
  private WebElement review;
  
  
  public Review(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
  
  public void clickReview(WebDriver driver)
  {
	  WebDriverWait wait=new WebDriverWait(driver,15);
	  
	  wait.until(ExpectedConditions.elementToBeClickable(review));
	  review.click();
  }
 }
