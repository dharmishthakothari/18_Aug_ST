package com.basic;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String url = "https://testautomationpractice.blogspot.com/";
		String url="https://www.flipkart.com/";

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.findElement(By.linkText("Handbags")).click();	
		driver.navigate().back();
//		List<WebElement> lst = driver.findElements(By.tagName("a"));
//		Iterator<WebElement> i = lst.iterator();
//		while (i.hasNext()) {
//			WebElement ele = i.next();
//			System.out.println(ele.getText());
//		}

	}

}
