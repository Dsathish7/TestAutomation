package Practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shivu {

	public static void main(String[] args) throws AWTException {
       System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       //driver.get("https://www.flipkart.com");
       WebElement mb = driver.findElement(By.xpath("//img[@src='https://static-assets-web.flixcart.com/batman-returns/batman-returns/p/images/header_cart-eed150.svg']"));
       WebDriverWait ew = new WebDriverWait(driver, 10);
       ew.until(ExpectedConditions.visibilityOf(mb));
       Actions a = new Actions(driver);
       a.moveToElement(mb).perform();
       Robot r =  new Robot();
       r.keyPress(KeyEvent.VK_DOWN);
       r.keyRelease(KeyEvent.VK_DOWN);
       r.keyPress(KeyEvent.VK_ENTER);
       r.keyRelease(KeyEvent.VK_ENTER);   
	}
}
