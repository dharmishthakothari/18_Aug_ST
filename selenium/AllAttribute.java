package basic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AllAttribute {
  @Test(priority = 1)
  public void login() {
	  System.out.println("in login function");
	  
  }
  
  @Test(priority = 3)
  public void logout()
  {
	  System.out.println("in logout function");
  }
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }
  
  
  @Test(priority = 2,enabled = false)
  public void logic()
  {
	  System.out.println("in logic function");
  }
  
  

}
