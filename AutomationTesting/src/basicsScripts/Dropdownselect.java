package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownselect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.navigate().to("file:///C:/html/Dropdown.html");
	       WebElement dd = driver.findElement(By.id("celebrities"));
	       Select s = new Select(dd);
	       if(s.isMultiple())
	       {
	    	  s.selectByIndex(1);
	    	   Thread.sleep(2000);
	    	   s.selectByValue("l");
	    	   Thread.sleep(2000);
	    	   s.selectByVisibleText("Dhoni");
	    	   Thread.sleep(2000);
	    	   s.deselectByIndex(1);
	    	   Thread.sleep(2000);
	    	   s.selectByVisibleText("Priyamani");
	    	   Thread.sleep(2000);
	    	   s.deselectByIndex(4);
	    	   
	    	   System.out.println("True");
	       }
	       else
	       {
	    	   System.out.println("not true");
	       }
	       Thread.sleep(2000);
	       driver.quit();

	}

}
