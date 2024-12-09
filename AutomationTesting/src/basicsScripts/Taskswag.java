package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Taskswag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
         WebDriver driver=new FirefoxDriver();
         driver.manage().window().maximize();
         driver.get("https://www.saucedemo.com/v1/");
         Thread.sleep(2000);
        WebElement un = driver.findElement(By.id("user-name"));
        un.sendKeys("problem_user");
       WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
       pwd.sendKeys("secret_sauce");
        Thread.sleep(2000);
       WebElement lgn = driver.findElement(By.xpath("//input[@id='login-button']"));
       lgn.click();
     WebElement all = driver.findElement(By.xpath("//a[@id='item_4_title_link']"));
     Thread.sleep(2000);
     all.click();
     
      
        
        
	}

}
