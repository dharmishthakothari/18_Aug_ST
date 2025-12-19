package com.basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample7_Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String url="https://testautomationpractice.blogspot.com/";

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("alertBtn")).click();
		Alert a1=driver.switchTo().alert();
		try {
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		a1.accept();
		driver.findElement(By.id("confirmBtn")).click();
		
		Alert a2=driver.switchTo().alert();
		try {
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		a2.dismiss();
		
		
		driver.findElement(By.id("promptBtn")).click();
		
		Alert a3=driver.switchTo().alert();
		a3.sendKeys("dharmishtha");
		try {
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		a3.accept();
		
		
		
		
		
	}

}
