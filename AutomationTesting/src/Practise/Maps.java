package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maps {

	public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.google.co.in/maps/@37.0625,-95.677068,2z?gad_source=1&gclid=EAIaIQobChMIxZCjiJSOigMV9tc8Ah0SGxcyEAAYASAAEgJUufD_BwE");
            Thread.sleep(2000);
           WebElement dr = driver.findElement(By.cssSelector("span[class='google-symbols NhBTye G47vBd']"));
           Thread.sleep(2000);
           dr.click();
          WebElement send = driver.findElement(By.cssSelector("input[class='tactile-searchbox-input']"));
          
          send.sendKeys("banglore");
          Thread.sleep(2000);
          WebElement send1 = driver.findElement(By.cssSelector("input[aria-label='Choose destination...']"));
          send1.sendKeys("ariskere");
	}

}
