package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Multipledata {

	public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./Testdata/Facebook Credentials.xlsx");
        XSSFWorkbook book = new XSSFWorkbook(fis);
        XSSFSheet sheet = book.getSheet("sheet1");
        int lr = sheet.getLastRowNum();
        for(int i=0; i<lr;i++)
        {
        	XSSFRow row1 = sheet.getRow(i);
        	XSSFCell celval1 = row1.getCell(0);
        	String celv = celval1.getStringCellValue();
        	XSSFCell celval2 = row1.getCell(1);
        	String celv2 = celval2.getStringCellValue();
        	System.out.println(celv+" "+celv2);
        }
        book.close();
        fis.close();  
	}
}
