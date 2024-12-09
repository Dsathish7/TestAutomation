package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/html/demooo.html");
		Thread.sleep(2000);
		 WebElement ele = driver.findElement(By.id("t1"));
		 ele.sendKeys("sathishh");
		 Thread.sleep(2000);
		 WebElement ele2 = driver.findElement(By.name("c1"));
		 ele2.sendKeys("sastt");
		 Thread.sleep(2000);
		 WebElement ele3 = driver.findElement(By.className("c1"));
		 ele3.sendKeys("sastt");
		 Thread.sleep(2000);
		 ele.clear();
		 Thread.sleep(2000);
		 WebElement lin = driver.findElement(By.partialLinkText("Instagram"));
		 lin.click();
		 Thread.sleep(2000);
		 driver.quit();
		 
		 
		 
	}

}
