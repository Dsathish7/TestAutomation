package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelemnt1 {

	public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("file:///C:/html/demo23.html");
            WebElement usn = driver.findElement(By.xpath("//input[@type='text'][1]"));
            if(usn.isDisplayed())
            {
            	if(usn.isEnabled())
            	{
            		usn.sendKeys("dboss");
            	}
            		else
            		{
            			System.out.println("usn is disabled");
            		}
            }
            else
            {
            	System.out.println("usn is not displayed");
            }
            
	}

}
