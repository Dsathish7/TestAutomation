package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Poi {

	public static void main(String[] args) throws InterruptedException {
             System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
             WebDriver driver = new ChromeDriver();
             driver.manage().window().maximize();
             driver.get("https://www.facebook.com");
             Thread.sleep(2000);
             WebElement ele = driver.findElement(By.xpath("//input[@id='email']"));
             ele.sendKeys("Sathish");
             driver.navigate().refresh();
            // driver.findElement(By.xpath(""))
             ele.sendKeys("Sathishh");
             
	}

}
