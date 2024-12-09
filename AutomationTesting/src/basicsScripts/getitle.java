package basicsScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getitle {

	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   Thread.sleep(2000);
		   driver.get("https://www.netflix.com");
		   String title= driver.getTitle();
		   Thread.sleep(2000);
		   System.out.println(title);
		   driver.close();
		 
		   

	}

}
