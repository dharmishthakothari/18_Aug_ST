package pkgTours;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.ExcelUtil;

public class NewTest {
	
	@DataProvider(name="loginData")
	public Object[][] fetchData()

	{
		Object[][] data=null;
		ExcelUtil obj=new ExcelUtil();
		try {
			data=obj.getData("C:\\Users\\Admin\\Downloads\\Login.xlsx", "Sheet1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
		
	}
	WebDriver driver;
	@BeforeMethod
	public void openBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		
	}
	
	@Test(dataProvider = "loginData")
	public void f(String u,String p) {
		
		driver.findElement(By.linkText("your destination")).click();
		 driver.findElement(By.name("userName")).sendKeys(u);
		  driver.findElement(By.name("password")).sendKeys(p);
		  driver.findElement(By.name("submit")).click();
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		  wait.until(ExpectedConditions.urlContains("login_sucess"));
		  String actualURL=driver.getCurrentUrl();
		  String exptectedURL="https://demo.guru99.com/test/newtours/login_sucess.php";
		  Assert.assertEquals(actualURL, exptectedURL);
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		  driver.quit();
	}
}
