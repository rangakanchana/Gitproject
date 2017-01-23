package gitdemo1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class EbayEx {
	
public WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite(){
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sridhar\\jar files\\chromedriver_win32\\chromedriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.ebay.com/");
	}
	@Test
	public void verifyTitle(){
		
		Assert.assertEquals(driver.getTitle(), "Electronics, Cars, Fashion, Collectibles, Coupons and More | ");
		
		//Assert.assertTrue(driver.getTitle().contains("Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay "));
		
	}
	@AfterSuite
	public void afterSuite(){
		driver.quit();
	}
	

}
