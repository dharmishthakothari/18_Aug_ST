package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="userName")
	WebElement obj1;
	
	@FindBy(name="password")
	WebElement obj2;
	
	@FindBy(name="submit")
	WebElement submit;
	
	@FindBy(linkText = "SIGN-ON")
	WebElement sign_on;
	
	@FindBy(linkText = "SIGN-OFF")
	WebElement sign_off;
	
	public void login(String username,String password)
	{
		obj1.sendKeys(username);
		obj2.sendKeys(password);
		submit.click();
		
	}
	
	public boolean checkSignOff()
	{
		return sign_off.isDisplayed();
	}
	

}
