package com.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample_WindowHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		// open browser enter url google now open another tab and opne amazon ,open another tab and open flipcart
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://www.amazon.in");
		//driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://www.flipkart.com");
		
		Set set=driver.getWindowHandles();
		System.out.println(set);
		List lst=new ArrayList(set);
		String id=(String)lst.get(2);
		System.out.println(id);
		
		driver.switchTo().window(id);
		driver.get("http://www.tops-int.com");
		//driver.close();
		//driver.quit();
		
	}

}
