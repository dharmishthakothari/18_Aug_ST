package basic;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameter {
	@Parameters({ "browser" })
	@Test
	public void f(String browser) {
		System.out.println("Browser === " + browser);
	}
}
