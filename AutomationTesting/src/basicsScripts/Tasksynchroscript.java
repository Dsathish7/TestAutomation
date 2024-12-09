package basicsScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tasksynchroscript {

	public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.get("https://www.flipkart.com");
         WebElement mbl = driver.findElement(By.xpath("//img[@alt='Mobiles']"));
         WebDriverWait ew = new WebDriverWait(driver, 10);
         ew.until(ExpectedConditions.visibilityOf(mbl));
         mbl.click();
        WebElement moto = driver.findElement(By.xpath("//a[@class='wsejfv']"));
        ew.until(ExpectedConditions.visibilityOf(moto));
        moto.click();
       WebElement lgn = driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
       ew.until(ExpectedConditions.visibilityOf(lgn));
       lgn.sendKeys("7204691712");
         //driver.quit();
	}

}
