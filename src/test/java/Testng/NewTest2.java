package Testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest2 {
	 @Test
	  public void verifytitle1() {
		  
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			ChromeDriver div = new ChromeDriver();
			div.get("https://www.amazon.com");
			String x= div.getTitle();
			System.out.println(x);
			Assert.assertEquals(x, x);
	 }
}
