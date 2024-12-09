package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task24 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://106.51.87.42:9007/");
        WebElement usn = driver.findElement(By.xpath("//input[@id='email']"));
        usn.sendKeys("Fresher@gmail.com");
        WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
        Thread.sleep(2000);
        pwd.sendKeys("Fresher@2024");
        WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
        btn.click();
        Thread.sleep(5000);
        WebElement ptnt = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        Thread.sleep(2000);
        ptnt.click();
        WebElement addptnt = driver.findElement(By.xpath("//button[@class='btn btn-primary pull-right']"));
        Thread.sleep(2000);
        addptnt.click();
        Thread.sleep(5000);
        WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
        name.sendKeys("Yashhh");
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("rockyy@gmail.com");
        WebElement pwd2 = driver.findElement(By.xpath("//input[@name='password']"));
        pwd2.sendKeys("kgf1234");
        WebElement adress = driver.findElement(By.xpath("//textarea[@name='address']"));
        adress.sendKeys("Rajajinagar 3rd block bangalore near q spiders");
        WebElement g = driver.findElement(By.xpath("//select[@name='sex']"));
        g.click();
        WebElement sub = driver.findElement(By.xpath("//input[@type='submit']"));
        Thread.sleep(2000);
        sub.click();
        WebElement lo = driver.findElement(By.xpath("//i[@class='entypo-logout right']"));
        lo.click();
        Thread.sleep(2000);
        driver.quit();
        
        
        
         
	}

}
