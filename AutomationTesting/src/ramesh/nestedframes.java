package ramesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedframes {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/sathi/OneDrive/Desktop/frames/main.html");
		Thread.sleep(2000);
		driver.findElement(By.className("t1")).sendKeys("ramesh");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.className("t2")).sendKeys("ramesh@123");
		Thread.sleep(2000);
		driver.switchTo().frame("f1");
		driver.findElement(By.className("t3")).sendKeys("6363395510");
		Thread.sleep(2000);
		driver.close();

	}

}
