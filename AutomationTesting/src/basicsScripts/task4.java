package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com");
      WebElement se = driver.findElement(By.cssSelector("input[id='search']"));
      Thread.sleep(2000);
      se.sendKeys("darshan kannada songs");
      WebElement cl=driver.findElement(By.cssSelector("button[id='search-icon-legacy']"));
      Thread.sleep(2000);
      cl.click();
     WebElement cli= driver.findElement(By.cssSelector("a[id='thumbnail']"));
     Thread.sleep(2000);
     cli.click();
     Thread.sleep(2000);
      
        
	}

}
