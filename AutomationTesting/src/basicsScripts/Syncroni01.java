package basicsScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.jmx.ManagedAttribute;

public class Syncroni01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          driver.get("https://www.facebook.com");
         WebElement usn = driver.findElement(By.xpath("//input[@name='email']"));
                 usn.sendKeys("rashid");
                WebElement psw = driver.findElement(By.xpath("//input[@type='password']"));
                psw.sendKeys("7204691712");
              String url = driver.getCurrentUrl();
              System.out.println(url);
                // driver.quit();
          
          
          
          
          	}

}
