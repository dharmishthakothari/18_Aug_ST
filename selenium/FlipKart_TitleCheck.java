package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FlipKart_TitleCheck {
	
	WebDriver driver;
	@Parameters({"browser"})
	@BeforeClass
	public void openBrowser(String browser)
	{
		if(browser.equals("Firefox"))
			driver=new FirefoxDriver();
		else if(browser.equals("chrome"))
			driver=new ChromeDriver();
		else
			driver=new EdgeDriver();
	}
	@BeforeMethod
	public void openHomePage()
	{
		driver.get("http://www.flipkart.com");
	}
  @Test
  public void monitorTitle() {
	  driver.findElement(By.linkText("Monitors")).click();
	  String actualTitle=driver.getTitle();
	  String expectedTitle="Monitors - Buy Computer, PC Monitor Online at Best Prices In India | Flipkart.com";
	  Assert.assertEquals(actualTitle, expectedTitle);
  }
  
  @Test
  public void printerTitle() {
	  
	  driver.findElement(By.linkText("Printers")).click();
	  String actualTitle=driver.getTitle();
	  String expectedTitle="Printers - Get Upto 80% off on Buying Printers Online | Flipkart.com";
	  Assert.assertEquals(actualTitle, expectedTitle);
  }
  
  
}
