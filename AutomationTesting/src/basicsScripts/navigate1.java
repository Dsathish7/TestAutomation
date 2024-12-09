package basicsScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate1 {

	public static void main(String[] args) throws InterruptedException {
           System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
           WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.navigate().to("https://www.flipkart.com");
           Thread.sleep(2000);
           driver.navigate().back();
           Thread.sleep(2000);
           driver.navigate().forward();
           Thread.sleep(2000);
           driver.navigate().back();
           
           
	}

}
