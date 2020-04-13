package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest1 {
	WebDriver div;	
	@BeforeMethod
	public void launch( ) {
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			div = new ChromeDriver();
			div.get("https://www.edureka.co");
			div.manage().window().maximize();
	}
	
	 @Test
	  public void verifytitle() {
			String x= div.getTitle();
			System.out.println(x);
			Assert.assertEquals(x, x);
				
	  }
	  @Test
	   public void  verifyurl() {
				
			String x= div.getCurrentUrl();
			System.out.println(x);
			Assert.assertEquals(x, "https://www.edureka.co");
	   }
	  
	  @AfterMethod
	  
	  public void close() {
		  div.close();
		  
	  }

}
