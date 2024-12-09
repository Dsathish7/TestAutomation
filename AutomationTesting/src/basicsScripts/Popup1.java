package basicsScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System .setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
	        Thread.sleep(2000);
	        WebElement btn = driver.findElement(By.id("buttonAlert1"));
	        btn.click();
	       Alert popup = driver.switchTo().alert();
	       Thread.sleep(2000);
	       String msg = popup.getText();
	       System.out.println(msg);
	        popup.sendKeys("yes");
	        popup.accept();
	         Thread.sleep(2000);
	       // popup.dismiss();
	        driver.quit();

	}

}
