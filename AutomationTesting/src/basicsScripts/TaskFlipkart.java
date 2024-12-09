package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskFlipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.flipkart.com");
	        WebElement search = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
	        search.sendKeys("iphone11");
	        driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
	        driver.findElement(By.xpath("//img[@class='DByuf4']")).click();
	        Thread.sleep(2000);
	        WebElement ip = driver.findElement(By.xpath("//span[@class='rfoEHa']"));
	        ip.click();
	}

}
