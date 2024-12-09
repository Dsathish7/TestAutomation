package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script03 {
   @Test
   public void Tc1() 
   {
	   System.setProperty("webdriver.chrome.driver", "./softwares/chhromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.flipkart.com");
	   String title = driver.getTitle();
	   Reporter.log("title", true);
	   
	   
   }

}
