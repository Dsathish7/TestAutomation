package basicsScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Taskscript2124 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		WebElement lin1 = driver.findElement(By.xpath("//a[@href='https://www.nuget.org/packages/Selenium.WebDriver']"));
		WebElement lin2 = driver.findElement(By.xpath("//a[@href='https://rubygems.org/gems/selenium-webdriver/versions/4.26.0']"));
		WebElement lin3 = driver.findElement(By.xpath("//a[@href='https://pypi.python.org/pypi/selenium']"));
		WebElement lin4 = driver.findElement(By.xpath("//a[@href='https://npmjs.org/package/selenium-webdriver']"));
		ArrayList<WebElement> arr = new ArrayList<WebElement>();
		arr.add(lin1);
		arr.add(lin2);
		arr.add(lin3);
		arr.add(lin4);
		int count = arr.size();
		for(int i=0; i<count;i++)
		{
			WebElement link = arr.get(i);
			Actions ac = new Actions(driver);
			ac.contextClick(link).perform();
			Robot r =  new Robot();
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			r.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		   Set<String> wins = driver.getWindowHandles();
		   for(String win:wins)
		   {
			   driver.switchTo().window(win);
			   String title = driver.getTitle();
			   System.out.println(title);
			   driver.close();
		   }
		}
	}


