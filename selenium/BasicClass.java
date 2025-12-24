package basic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicClass {
	
	@BeforeMethod
	public void bMethod()
	{
		System.out.println("Before");
	}
	@AfterMethod
	public void aMethod()
	{
		System.out.println("After");
	}
	
  @Test
  public void one() {
	  System.out.println("This is my first test ");
	  
  }
  
  @Test
  public void two() {
	  System.out.println("This is my first test -two ");
	  
  }
  
}
