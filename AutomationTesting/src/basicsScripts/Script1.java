package basicsScripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script1 {
       public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "./softwares/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver = new ChromeDriver();
		
		
		String key1 = "webdriver.gecko.driver";
		String value1 = "./softwares/geckodriver.exe";
		System.setProperty(key1, value1);
		FirefoxDriver driver1 = new FirefoxDriver();
			
	}
}
