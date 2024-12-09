package ramesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssselector {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[type='text'")).sendKeys("ramesh");
		driver.findElement(By.cssSelector("input[type='password'")).sendKeys("suresh");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
		Thread.sleep(2000);
		driver.close();
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		FirefoxDriver driver1 =new FirefoxDriver();
		
		driver1.get("https://www.youtube.com/");
		
	    driver1.findElement(By.cssSelector("input[id='search'")).sendKeys("mera mann");
		driver1.findElement(By.cssSelector("button[id='search-icon-legacy'")).click();
	          Thread.sleep(3000);
	       driver1.findElement(By.cssSelector("video[class='video-stream html5-main-video")).click();
		
		driver1.findElement(By.cssSelector("span[class='style-scope yt-formated-string")).click();
	}

}
