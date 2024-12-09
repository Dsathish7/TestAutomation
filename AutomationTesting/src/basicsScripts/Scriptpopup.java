package basicsScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scriptpopup {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        ChromeOptions opt=new ChromeOptions();
        opt.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
        driver.findElement(By.id("browNotButton")).click();
        
        
        }

}
