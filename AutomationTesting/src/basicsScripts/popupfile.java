package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popupfile {
	public static void main(String[] args) {
		System .setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("file:///C:/html/Dummypagepopup.html");
	       WebElement dm = driver.findElement(By.id("f1"));
	       dm.sendKeys("C:\\Users\\sathi\\Downloads\\Test case1 Ass.xlsx");
	}
}
