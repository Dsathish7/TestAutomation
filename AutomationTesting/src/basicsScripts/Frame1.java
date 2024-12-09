package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("file:///C:/html/Dboss.html");
        WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
        usn.sendKeys("dboss");
        Thread.sleep(2000);
        driver.switchTo().frame(0);
        WebElement pwd = driver.findElement(By.xpath("//input[@type='text']"));
        pwd.sendKeys("bossssssuuu");
        
	}

}
