package basicsScripts;

import org.openqa.selenium.By.ByXPath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox4 {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("file:///C:/html/Checboxes.html");
      List<WebElement> cb = driver.findElements(By.xpath("//input"));
      int count = cb.size();
       for(int i=1; i<count;i=i+2)
        {	
    	    WebElement cb1 = cb.get(i);
    	     cb1.click();
       } 
       for(int j=count-1; j>0;j=j-2)
       {
    	   WebElement cb1 = cb.get(j);
    	   Thread.sleep(2000);
  	       cb1.click();
       }
	}
}
