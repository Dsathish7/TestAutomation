package basicsScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1824 {

	public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/v1/");)
	}

}
