package basicsScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
         WebDriver driver= new FirefoxDriver();
         System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
         WebDriver driver1= new ChromeDriver();
	}

}
