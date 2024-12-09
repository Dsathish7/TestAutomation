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

public class Screenshot {

	public static void main(String[] args) throws IOException {
         System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.flipkart.com");
         WebElement cart = driver.findElement(By.xpath("//a[@href='/viewcart?exploreMode=true&preference=FLIPKART'])"));
         File temp = cart.getScreenshotAs(OutputType.FILE);
         //TakesScreenshot ts = (TakesScreenshot)driver;
        // File temp = ts.getScreenshotAs(OutputType.FILE);
        // File perm = new File("./screenshots/Defect3.png");
         //FileHandler.copy(temp, perm);
         File per = new File("./screenshots/cart.png");
         FileHandler.copy(temp, per);
         driver.quit();
         
	
	
	
	
	
	
	}

}
