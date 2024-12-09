package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assertion {
    @Test
    public void signup()
    {
    	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.facebook.com");
    	String actualresulString
    	String title = driver.getTitle();
    	System.out.println(title);
    	
    }
    
}
