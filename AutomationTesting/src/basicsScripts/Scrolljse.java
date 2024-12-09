package basicsScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrolljse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	       WebDriver driver = new FirefoxDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.amazon.in");
	       Thread.sleep(2000);
	       JavascriptExecutor Js=(JavascriptExecutor) driver;
	       for(int i=0; i<3;i++)
	       {
	    	   Js.executeScript("window.scrollBy(0,500)");
	    	   Thread.sleep(2000);
	    	   
	       }
	       for(int j=0; j<3;j++)
	       {
	    	   Js.executeScript("window.scrollBy(0,-500)");
	    	   Thread.sleep(2000);
	       }

	}

}
