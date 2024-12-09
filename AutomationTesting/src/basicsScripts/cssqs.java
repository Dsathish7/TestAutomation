package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssqs {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://demoapps.qspiders.com/ui?scenario=1");
        WebElement test= driver.findElement(By.cssSelector("input[id='name']"));
        Thread.sleep(2000);
        test.sendKeys("sathish");
        WebElement em=driver.findElement(By.cssSelector("input[id='email']"));
        Thread.sleep(2000);
        em.sendKeys("sathish123@gmail.com");
        WebElement pass=driver.findElement(By.cssSelector("input[id='password']"));
        Thread.sleep(2000);
        pass.sendKeys("7452sacha");
        Thread.sleep(2000);
        WebElement btn=driver.findElement(By.cssSelector("input[id='submit']"));
        Thread.sleep(2000);
        btn.click();
        driver.quit();
        
        
        
	}

}
