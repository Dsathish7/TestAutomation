package basicsScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class script3 {
	public static void main(String[] args) throws InterruptedException {
		
	
	 System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 Thread.sleep(2000);
	 driver.close();
	}
	
	
	 
	 

}
