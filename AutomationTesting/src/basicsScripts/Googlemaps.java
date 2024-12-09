package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlemaps {

	public static void main(String[] args) throws InterruptedException {
           System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
           WebDriver driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://www.google.com/maps/@12.9989812,77.5504667,15z?entry=ttu&g_ep=EgoyMDI0MTAxNC4wIKXMDSoASAFQAw%3D%3D");
           WebElement search =driver.findElement(By.xpath("google-symbols NhBTye G47vBd"));
           Thread.sleep(2000);
           search.click();
           WebElement start=driver.findElement(By.xpath("@class='tactile-searchbox-input' and @tooltip='Choose starting point, or click on the map...']"));
           Thread.sleep(2000);
           start.sendKeys("Banglore");
           WebElement end=driver.findElement(By.xpath("WebElement start=driver.findElement(By.xpath(\"@class='tactile-searchbox-input' and @tooltip='Choose starting point, or click on the map...']"));
           Thread.sleep(2000);
           end.sendKeys("bellary");
           
           
           
	}

}
