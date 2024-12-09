package basicsScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getpagesource {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   Thread.sleep(2000);
		   driver.get("https://www.flipkart.com");
		   String url= driver.getPageSource();
		   Thread.sleep(2000);
		   System.out.println(url);
		   driver.close();


	}

}
