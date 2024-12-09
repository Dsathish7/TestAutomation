package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipleframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/html/Frame04.html");
      WebElement pwd = driver.findElement(By.xpath("//input[@type='text']"));
      pwd.sendKeys("hahahaha");
      driver.switchTo().frame(0);
      WebElement pwd1 = driver.findElement(By.xpath("//input[@type='text']"));
      pwd1.sendKeys("raina");
      driver.switchTo().frame(0);
      WebElement pwd2 = driver.findElement(By.xpath("//input[@type='text']"));
      pwd2.sendKeys("alluarjun");
      driver.switchTo().frame(0);
      WebElement pwd3 = driver.findElement(By.xpath("//input[@type='text']"));
      pwd3.sendKeys("hahhhhhs");
      Thread.sleep(2000);
      driver.switchTo().parentFrame();
      pwd2.clear();
      driver.switchTo().defaultContent();
      pwd.clear();
      
      
      
      
	}

}
