package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url="https://demo.guru99.com/test/newtours/register.php";
		
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		WebElement ele=driver.findElement(By.name("country"));
		
		Select selCountry=new Select(ele);
		
		//selCountry.selectByVisibleText("SPAIN");
		//selCountry.selectByValue("BARBADOS");
		selCountry.selectByIndex(50);
		
		
	}

}
