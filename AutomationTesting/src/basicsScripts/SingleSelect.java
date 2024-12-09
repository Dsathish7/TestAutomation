package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.navigate().to("file:///C:/html/SingleDropdown.html");
	       WebElement dd = driver.findElement(By.id("celebrities"));
	       Select s = new Select(dd);
	       s.selectByIndex(2);
	       Thread.sleep(2000);
	       s.deselectByIndex(2);
	       
	}

}
