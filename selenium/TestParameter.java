package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameter {
	@Parameters({ "browser" })
	@Test
	public void f(String browser) {
		System.out.println("Browser === " + browser);
	}
	
	@Parameters({"username","pass"})
	@Test
	public void loginTest(String u,String p)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		 driver.findElement(By.name("userName")).sendKeys(u);
		  driver.findElement(By.name("password")).sendKeys(p);
		  driver.findElement(By.name("submit")).click();
	}
	
}
