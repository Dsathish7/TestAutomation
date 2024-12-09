package basicsScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Javascripexcutor1 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	       WebDriver driver = new FirefoxDriver();
	       driver.manage().window().maximize();
	       driver.get("file:///C:/html/JSEDisb.html");
	       Thread.sleep(2000);
	       JavascriptExecutor Js=(JavascriptExecutor) driver;
	       Js.executeScript("document.getElementById('a1').value='sacch'");
	}

}
