package basicsScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptJse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	       WebDriver driver = new FirefoxDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.amazon.in/");
	       Thread.sleep(2000);
	       JavascriptExecutor Js=(JavascriptExecutor) driver;
	       Js.executeScript("document.body.style.zoom='60%'");
	}

}
