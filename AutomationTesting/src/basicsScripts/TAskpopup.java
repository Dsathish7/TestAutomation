package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TAskpopup {

	public static void main(String[] args) {
		    // TODO Auto-generated method stub
		    System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://busonlineticket.com/booking/bus-tickets.aspx");
	       WebElement to = driver.findElement(By.id("txtOriginGeneral"));
	       to.sendKeys("singapore");
	       
	    WebElement frm = driver.findElement(By.id("txtDestinationGeneral"));
	    frm.get
	    		   
	        
	        
	        
	}
}
