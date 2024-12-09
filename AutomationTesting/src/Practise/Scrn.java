package Practise;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Scrn {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		WebElement oo = driver.findElement(By.xpath("//input[@id='pass']"));
		File temp = oo.getScreenshotAs(OutputType.FILE);
		File perm = new File("./Screenshots/oo.png");
		FileHandler.copy(temp, perm);
		driver.quit();
		

	}

}
