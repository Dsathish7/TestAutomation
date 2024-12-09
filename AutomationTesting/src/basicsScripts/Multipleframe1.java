package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipleframe1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/html/Multipleframe1.html");
        WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
        usn.sendKeys("Dbossss");
        driver.switchTo().frame(0);
        WebElement pwd = driver.findElement(By.xpath("//input[@type='text']"));
        pwd.sendKeys("hahahah");
        driver.switchTo().defaultContent();
        driver.switchTo().frame("i2");
        WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
        email.sendKeys("massss");
        driver.quit();
        
        
	}

}
