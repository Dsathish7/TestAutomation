package basicsScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronoizationEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");
        WebDriverWait sach=new WebDriverWait(driver, 10);
        sach.until(ExpectedConditions.urlContains("facebook"));
       String url = driver.getCurrentUrl();
        System.out.println(url);
        //WebDriverWait  usn= new WebDriverWait(driver, 10);
        sach.until(ExpectedConditions.titleContains("Facebook"));
      String title = driver.getTitle();
      System.out.println(title);
     WebElement email = driver.findElement(By.xpath("//input=[@name='email']"));
     WebDriverWait  usn= new WebDriverWait(driver, 10);
      usn.until(ExpectedConditions.visibilityOf(email));
      email.sendKeys("dboss");
       driver.quit();
	}

}
