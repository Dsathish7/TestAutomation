package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readsingledata {

	public static void main(String[] args) throws IOException, InterruptedException {
              FileInputStream fis = new FileInputStream("./Testdata/Facebook Credentials.xlsx");
              XSSFWorkbook workbook = new XSSFWorkbook(fis);
                  XSSFSheet sheet = workbook.getSheet("sheet1");
                  XSSFRow row = sheet.getRow(1);
                 XSSFCell cell = row.getCell(1);
                 String val = cell.getStringCellValue();
                 System.out.println(val);
                XSSFCell pwd = row.getCell(1);
               String pwd1 = pwd.getStringCellValue();
               workbook.close();
              // fis.close();
               System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
      		   WebDriver driver = new ChromeDriver();
      		   driver.manage().window().maximize();
      		   Thread.sleep(2000);
      		   driver.get("https://www.facebook.com");
      		   WebElement un = driver.findElement(By.id("email"));
      		   un.sendKeys(val);
      		   WebElement pwdun = driver.findElement(By.id("pass"));
      		   pwdun.sendKeys(pwd1);
      		  WebElement btn = driver.findElement(By.name("login"));
      		  btn.click();
      	       
                 
	}

}
