package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo44 {

	public static void main(String[] args) throws InterruptedException {
	      System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	      WebDriver driver = new FirefoxDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.facebook.com/");
	      WebElement ele = driver.findElement(By.id("email"));
	      ele.sendKeys("sathsih11@gmail.com");
	      Thread.sleep(2000);
	      WebElement ele2=driver.findElement(By.name("pass"));
	      ele2.sendKeys("sath1234");
	      Thread.sleep(2000);
	      WebElement ele3 = driver.findElement(By.name("login"));
	      ele3.click();
	      Thread.sleep(2000);
	      driver.close();
	      
	      
	      

	}

}

