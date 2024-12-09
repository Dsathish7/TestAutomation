package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Taskdemodropdown {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
          WebElement days = driver.findElement(By.id("select-multiple-native"));
          Select s= new Select(days);
          Thread.sleep(2000);
          s.selectByIndex(0);
          Thread.sleep(2000);
          s.deselectByValue(1);
          s.selectByIndex(2);
          s.selectByIndex(3);
          s.selectByIndex(4);
          s.selectByIndex(5);
          s.selectByIndex(6);
          s.selectByIndex(7);
          s.selectByIndex(8);
          s.selectByIndex(9);
          
          
	}

}
