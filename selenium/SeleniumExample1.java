package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//open browser
		WebDriver driver=new ChromeDriver();
		
		//WebDriver driver=new FirefoxDriver();
		
		
		//enter url
		//String url="http://www.google.com";
		
		String url="http://www.google.in";
		driver.get(url);
		
		driver.manage().window().maximize();
		System.out.println("Title "+driver.getTitle());
		
		System.out.println("current URL "+driver.getCurrentUrl());
		
		
		WebElement ele=driver.findElement(By.linkText("About"));
		
		ele.click();
		System.out.println("After clicking on About");
		
		System.out.println("Title "+driver.getTitle());
		
		System.out.println("current URL "+driver.getCurrentUrl());
		
		//close 
		//driver.close();
		
		
	}

}
