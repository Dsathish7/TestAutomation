package basicsScripts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigte2 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         Dimension d =new Dimension(300, 800);
         driver.manage().window().setSize(d);
         Thread.sleep(2000);
         Point p = new Point(500, 500);
         driver.manage().window().setPosition(p);
         
	}

}
