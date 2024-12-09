package basicsScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TaskscriptPopupTabs {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		WebElement lin1 = driver.findElement(By.xpath("//a[@href='https://www.nuget.org/packages/Selenium.WebDriver']"));
		JavascriptExecutor JSE = (JavascriptExecutor)driver;
		JSE.executeScript("arguments[0].scrollIntoView()", lin1);
		a.contextClick(lin1).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement lin2 = driver.findElement(By.xpath("//a[@href='https://rubygems.org/gems/selenium-webdriver/versions/4.26.0']"));
		a.contextClick(lin2).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement lin3 = driver.findElement(By.xpath("//a[@href='https://pypi.python.org/pypi/selenium']"));
		a.contextClick(lin3).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement lin4 = driver.findElement(By.xpath("//a[@href='https://npmjs.org/package/selenium-webdriver']"));
		a.contextClick(lin4).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ArrayList<WebElement>  arr = new ArrayList<WebElement>();
		arr.add(lin1);
		arr.add(lin2);
		arr.add(lin3);
		arr.add(lin4);
		int count = arr.size();
		System.out.println(count);
	}
}
