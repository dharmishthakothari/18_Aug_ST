package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExampleDataProvider {

	@DataProvider(name = "login")
	Object[][] getData() {
		Object[][] data = { { "a", "a" }, { "vensi", "vensi@123" }, { "shruti", "shruti@123" } };
		return data;
	}

	@Test(dataProvider = "login")
	public void f(String u,String p) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.findElement(By.linkText("your destination")).click();
		 driver.findElement(By.name("userName")).sendKeys(u);
		  driver.findElement(By.name("password")).sendKeys(p);
		  driver.findElement(By.name("submit")).click();
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		  wait.until(ExpectedConditions.urlContains("login_sucess"));
		  String actualURL=driver.getCurrentUrl();
		  String exptectedURL="https://demo.guru99.com/test/newtours/login_sucess.php";
		  Assert.assertEquals(actualURL, exptectedURL);
		  driver.quit();
	}
}
