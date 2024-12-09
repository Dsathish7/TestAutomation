package Practise;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SathishScreenshot {

	public static void main(String[] args) throws IOException {
          System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://www.facebook.com");
          TakesScreenshot ts =(TakesScreenshot)driver;
          File temp = ts.getScreenshotAs(OutputType.FILE);
          File prm = new File("./screenshots/dct.png");
          FileHandler.copy(temp, prm);
          //driver.quit();
	}

}
