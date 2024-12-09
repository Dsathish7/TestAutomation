package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSEscriptScroll123 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	       WebDriver driver = new FirefoxDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.amazon.in/");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//a[@class='nav_a']")).click();
	}

}
