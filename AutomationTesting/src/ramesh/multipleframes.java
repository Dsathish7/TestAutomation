package ramesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleframes {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/sathi/OneDrive/Desktop/hello/Frame.html");
		Thread.sleep(2000);
		
		driver.findElement(By.className("u1")).sendKeys("ramesh");
		Thread.sleep(2000);
		driver.switchTo().frame("frame1");
		driver.findElement(By.className("c1")).sendKeys("ramesh@123");
		Thread.sleep(2000);
	    driver.switchTo().parentFrame();
	    driver.switchTo().frame("frame2");
		driver.findElement(By.className("c2")).sendKeys("6363395510");

	}

}
