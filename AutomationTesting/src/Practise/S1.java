package Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S1 {

	public static void main(String[] args) throws Exception {
           System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
           WebDriver driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=2254266384691679502&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9198441&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
           WebDriverWait aa = new WebDriverWait(driver, 10);
          // WebElement search = driver.findElement(By.xpath("//span[@class='action-inner']"));
          // aa.until(ExpectedConditions.visibilityOf(search));
          // search.click();
           //WebElement se = driver.findElement(By.xpath("//span[@class='ic-search']"));
          // aa.until(ExpectedConditions.visibilityOf(se));
           //se.click();
           JavascriptExecutor js = (JavascriptExecutor)driver;
          // Thread.sleep(2000);
           WebElement shirt = driver.findElement(By.xpath("//a[@href='https://www.amazon.in/gp/redirect.html/ref=footer_fb?location=http://www.facebook.com/AmazonIN&token=2075D5EAC7BB214089728E2183FD391706D41E94&6']"));
           js.executeScript("arguments[0].scrollIntoview()",shirt);
           aa.until(ExpectedConditions.visibilityOf(shirt));
           shirt.click(); 
	}
}
