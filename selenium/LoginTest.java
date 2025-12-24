package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	@BeforeMethod
	public void openBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
	}
	
  @Test
  public void f() {
	  
	  driver.findElement(By.name("userName")).sendKeys("a");
	  driver.findElement(By.name("password")).sendKeys("a");
	  driver.findElement(By.name("submit")).click();
	  try {
		  Thread.sleep(2000);
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  String actualURL=driver.getCurrentUrl();
	  String exptectedURL="https://demo.guru99.com/test/newtours/login_sucess.php";
	  Assert.assertEquals(actualURL, exptectedURL);
  }
  
  @Test
  public void f1() {
	  
	  driver.findElement(By.name("userName")).sendKeys("123");
	  driver.findElement(By.name("password")).sendKeys("asdsfsdfsdfsdfdsf");
	  driver.findElement(By.name("submit")).click();
	  try {
		  Thread.sleep(2000);
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  String actualURL=driver.getCurrentUrl();
	  //String expectedURL="https://demo.guru99.com/test/newtours/index.php";
	  String expectedURL="https://demo.guru99.com/test/newtours/login_sucess.php";
	  Assert.assertEquals(actualURL, expectedURL);
	  
  }
  @AfterMethod
  public void quit()
  {
	  driver.quit();
  }

  
  
}
