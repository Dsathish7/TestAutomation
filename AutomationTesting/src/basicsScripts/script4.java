package basicsScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script4 {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  Thread.sleep(2000);
		  driver.get("https://www.Flipkart.com");
		  System.out.println("it is opened");
	}

}
