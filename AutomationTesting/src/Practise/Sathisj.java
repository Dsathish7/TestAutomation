package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sathisj {

	public static void main(String[] args) {
          System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");	
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          WebDriverWait ww = new WebDriverWait(driver, 10);
          driver.get("https://www.facebook.com");
          WebElement us = driver.findElement(By.xpath("//input[@id='email']"));
          ww.until(ExpectedConditions.visibilityOf(us));
          us.sendKeys("sathish");
          WebElement ps = driver.findElement(By.id("pass"));
          ww.until(ExpectedConditions.visibilityOf(ps));
          ps.sendKeys("soumya");
          WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
          ww.until(ExpectedConditions.visibilityOf(btn));
          btn.click();
          ww.until(ExpectedConditions.titleContains("facebook"));
          String title = driver.getTitle();
          System.out.println(title);
          driver.quit();
	
	
	
	
	}

}
