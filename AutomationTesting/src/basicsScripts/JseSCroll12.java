package basicsScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JseSCroll12 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	       WebDriver driver = new FirefoxDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=2254266384691679502&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9198441&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
	       WebDriverWait eh = new WebDriverWait(driver, 10);
	       //until(ExpectedConditions.vis)
	       JavascriptExecutor Js=(JavascriptExecutor) driver;
	       Js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	       Thread.sleep(2000);
	       Js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}
}


