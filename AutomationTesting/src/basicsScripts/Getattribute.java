package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Getattribute {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("https://www.netflix.com/in/");
		  WebElement text = driver.findElement(By.name("email"));
		 String an = text.getAttribute("data-uia");
		  System.out.println(an);
		  driver.quit();
	}

}
