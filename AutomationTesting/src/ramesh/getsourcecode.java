package ramesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsourcecode {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.octasportz.com");
		Thread.sleep(3000);
		String src = driver.getPageSource();
		
		System.out.println(src);

	}

}
