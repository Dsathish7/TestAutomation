package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taskmultipleframe1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
        Thread.sleep(2000);
        WebElement f1 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
        driver.switchTo().frame(f1);
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("sssssssss");
        driver.switchTo().defaultContent();
        WebElement f2 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
        driver.switchTo().frame(f2);
        WebElement email1 = driver.findElement(By.xpath("//input[@id='username']"));
        email1.sendKeys("raina");
        
        
        
	}

}
