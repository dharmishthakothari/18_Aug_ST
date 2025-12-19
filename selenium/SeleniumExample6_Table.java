package com.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample6_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="https://testautomationpractice.blogspot.com/";

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		//*[@id="HTML1"]/div[1]/table/tbody/tr[2]/td[1]
		
		
		//*[@id="HTML1"]/div[1]/table/tbody/tr[5]/td[1]
		
		//*[@id="HTML1"]/div[1]/table/tbody/tr[5]/td[3]
		
		//fetch size of row
		List<WebElement> lstElement=driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr"));
		System.out.println(lstElement.size());
		
		for(int i=2;i<=lstElement.size();i++)
		{
			WebElement ele=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+i+"]/td[1]"));
			System.out.println(ele.getText());
			WebElement eleAuthur=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+i+"]/td[2]"));
			System.out.println(eleAuthur.getText());
			WebElement eleSub=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+i+"]/td[3]"));			
			System.out.println(eleSub.getText());
			WebElement eleprice=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+i+"]/td[4]"));			
			System.out.println(eleprice.getText());
		}
		
	
		
		
		
	}

}
