package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class css2 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.facebook.com/");
        String id;
		WebElement text=driver.findElement(By.cssSelector("input[id='email']"));
		text.sendKeys("sathish55@gmail.com");
		WebElement pass=driver.findElement(By.cssSelector("input[id='pass']"));
		pass.sendKeys("sath765");
	    WebElement btn	=driver.findElement(By.cssSelector("button[name='login']"));
	    btn.click();
	    driver.quit();
		
		
		
        
	} 
         
	}