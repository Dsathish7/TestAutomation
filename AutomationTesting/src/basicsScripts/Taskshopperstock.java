package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Taskshopperstock {

	public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
         WebDriver driver = new FirefoxDriver();
         driver.manage().window().maximize();
         driver.navigate().to("https://www.myntra.com/");
         Thread.sleep(3000);
        WebElement login = driver.findElement(By.xpath("//button[@name='loginBtn']"));
        login.click();
      //  WebElement login = driver.findElement(By.xpath("//button[@name='loginBtn']"));
        
         
         
	}

}
