package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JseScrolllast {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	       WebDriver driver = new FirefoxDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.amazon.in");
	       Thread.sleep(2000);
	      // JavascriptExecutor Js=(JavascriptExecutor) driver;
	      // Js.executeScript("window.scrollBy(0,5000)");
	     WebElement fb = driver.findElement(By.xpath("//a[@href='https://www.amazon.in/gp/redirect.html/ref=footer_fb?location=http://www.facebook.com/AmazonIN&token=2075D5EAC7BB214089728E2183FD391706D41E94&6']"));
	      Point add = fb.getLocation();
	      System.out.println(add);
	}

}
