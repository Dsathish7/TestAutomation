package ramesh;

 
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo555 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		Thread.sleep(2000);
		driver.close();//close will not kill the backed process
		driver.quit();//quit will kill the backed process
		
	}

}
