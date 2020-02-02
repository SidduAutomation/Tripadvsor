package scripts;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

import pom.Rating;
import pom.Review;
import pom.Search;

public class Tripadvise
{
	@Test
	public void clubMahindra() throws InterruptedException
	{
        System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
        WebDriver driver=new FirefoxDriver();
        
       
        driver.get("https://www.Tripadvisor.in/");
        
        driver.manage().window().maximize();
		    driver.manage.implicitlywait(10,TIMEUNIT.SECONDS);
		
		Search s=new Search(driver);
		s.Search1(driver, "Club Mahindra");
		
		Set<String> tabs = driver.getWindowHandles();
		
		Iterator<String> itr = tabs.iterator();
		
		String prnt = itr.next();
		String child = itr.next();
		driver.switchTo().window(child);
		
		Review r=new Review(driver);
		
		r.clickReview(driver);
		Thread.sleep(2000);
        Set<String> tabs1 = driver.getWindowHandles();
		
		Iterator<String> itr1 = tabs1.iterator();
		
		String prnt1 = itr1.next();
		String child1 = itr1.next();
		String child2=itr1.next();
		driver.switchTo().window(child2);
		
		
		Rating R=new Rating(driver);
		
		R.selectRating(driver);
		R.reviewTitle("Place to visit");
		R.urReview("Good place");
		R.servicerating(driver);
	   
	}

}
