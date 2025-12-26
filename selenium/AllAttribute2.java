package basic;

import org.testng.annotations.Test;

public class AllAttribute2 {
	
	
  @Test(groups = {"basic"})
  public void math_basic() {
  }
  @Test(dependsOnGroups = {"basic"},groups = {"advanced"})
  public void math_adv() {
  }
  //@Test(dependsOnGroups = {"basic"},groups = {"advanced","basic"})
  @Test(dependsOnMethods = {"math_basic","math_sci"},groups = {"advanced","basic"})
  public void mat_tri() {
  }
  @Test(groups = {"basic"})
  public void math_sci() {
  }
}
