package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

	LoginPage page;
	//WebDriver driver;

	@Test(priority = 1)
	public void validLoginTest() {
		page = new LoginPage(driver);
		page.login("a", "a");
		Assert.assertTrue(page.checkSignOff());
		
	}
	
	@Test
	public void invalidLoginTest()
	{
		page = new LoginPage(driver);
		page.login("a", "a324234234");
		Assert.assertFalse(page.checkSignOff());
	}
}
