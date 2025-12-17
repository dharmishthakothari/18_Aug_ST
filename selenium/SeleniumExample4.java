package com.basic;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://testautomationpractice.blogspot.com/";

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter gender ");
		String gender=scan.next();
		
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		List<WebElement> lst=driver.findElements(By.name("gender"));
		System.out.println(lst.size());
		Iterator<WebElement> i=lst.iterator();
		while(i.hasNext())
		{
			WebElement ele=i.next();
			String val=ele.getAttribute("value");
			if(gender.equals(val))
			{
				ele.click();
			}
		}
		
//		
//		driver.findElement(By.id("wednesday")).click();
//		driver.findElement(By.id("friday")).click();
		
	}

}
