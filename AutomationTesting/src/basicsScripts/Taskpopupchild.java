package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taskpopupchild {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//button[@id='browserButton2']")).click();
	       String wins = driver.getWindowHandle();
	       System.out.println(wins);
	       driver.quit();
	}

}
