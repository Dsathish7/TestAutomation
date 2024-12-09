package Practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flinks {
	public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.navigate().to("https://www.flipkart.com");
         //WebDriverWait ng = new WebDriverWait(driver, 10);
        List<WebElement> links = driver.findElements(By.xpath("//a"));
        int cnt = links.size();
        for(int i=0;i<cnt;i=i+1)
        {
        	WebElement lnk = links.get(i);
        	String txt = lnk.getText();
        	System.out.println(i+" "+txt);
        }
       driver.quit();  
	}
}
