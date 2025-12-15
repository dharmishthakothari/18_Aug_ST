package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		WebElement ele=driver.findElement(By.name("userName"));
		ele.sendKeys("a");
		
		driver.findElement(By.name("password")).sendKeys("sdfsdfsdfsdf");
		
		driver.findElement(By.name("submit")).click();
//		try {
//		Thread.sleep(300);
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		String title=driver.getTitle();
		
		if(title.contains("Login"))
		{
			System.out.println("Valid uesr ");
		}else
		{
			System.out.println("invalid user");
		}
		driver.quit();
			
		
	}

}
