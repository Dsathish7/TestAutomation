package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoapps.qspiders.com/ui/button?sublist=0");
        WebElement yes=driver.findElement(By.xpath("//button[@id='btn']"));
        Thread.sleep(2000);
        yes.click();
        WebElement no=driver.findElement(By.xpath("//button[@id='btn3']"));
        Thread.sleep(2000);
        no.click();
        WebElement one=driver.findElement(By.xpath("//button[@id='btn4']"));
        Thread.sleep(2000);
        one.click();
        WebElement two=driver.findElement(By.xpath("//button[@id='btn4']"));
        Thread.sleep(2000);
        two.click();
        WebElement three=driver.findElement(By.xpath("//button[@id='btn5']"));
        Thread.sleep(2000);
        three.click();
        WebElement no4=driver.findElement(By.xpath("//button[@id='btn6']"));
        Thread.sleep(2000);
        no4.click();
        WebElement no5=driver.findElement(By.xpath("//button[@id='btn8']"));
        Thread.sleep(2000);
        no5.click();
        
        
        
        
        
       
	}

}
