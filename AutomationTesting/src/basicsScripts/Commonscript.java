package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commonscript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/html/Abhi.html");
        WebElement text = driver.findElement(By.xpath("//input[@value='sathish']"));
        text.sendKeys(Keys.CONTROL+"a");
        text.sendKeys(Keys.BACK_SPACE);
        WebElement text1 = driver.findElement(By.xpath("//input[@type='text'][3]"));
        
        
        
	}

}
