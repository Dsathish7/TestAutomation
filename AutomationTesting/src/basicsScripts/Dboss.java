package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dboss {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	      WebDriver driver = new FirefoxDriver();
	      driver.manage().window().maximize();
	      driver.get("https://in.pinterest.com/pin/698691329680171329/");
	     

	}

}
