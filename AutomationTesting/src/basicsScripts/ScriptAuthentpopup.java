package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptAuthentpopup {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.redbus.in/?gad_source=1&gclid=EAIaIQobChMI4O6R4_LniQMVNIVLBR3UrAJQEAAYASAAEgLP-PD_BwE");
	        driver.findElement(By.xpath("//span[.='Date']")).click();
	        driver.findElement(By.xpath("//span[.='20']")).click();
	}

}
