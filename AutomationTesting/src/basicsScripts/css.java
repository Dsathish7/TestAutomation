package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class css {

	public static void main(String[] args) throws InterruptedException {
              System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
              WebDriver driver = new ChromeDriver();
              driver.manage().window().maximize();
              driver.get("file:///C:/html/utubetrial.html");
              WebElement usn=driver.findElement(By.cssSelector("input[type='text']"));
              Thread.sleep(2000);
              usn.sendKeys("sathishhhh");
           WebElement cb = driver.findElement(By.cssSelector("input[type='checkbox']"));
           Thread.sleep(2000);
           cb.click();
           WebElement rb=driver.findElement(By.cssSelector("input[type='radio']"));
           Thread.sleep(2000);
           rb.click();
          WebElement url= driver.findElement(By.cssSelector("a[href='https://www.youtube.com']"));
          Thread.sleep(2000);
          url.click();
          Thread.sleep(2000);
          driver.quit();
           
              
              
              
              
	}

}
