package base;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseTest {
	public WebDriver driver;
	
  @BeforeMethod
  public void beforeMethod() {
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
	  
	  
  }

}
