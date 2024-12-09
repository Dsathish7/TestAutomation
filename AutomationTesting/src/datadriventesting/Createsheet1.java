package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Createsheet1 {

	public static void main(String[] args) throws IOException {
       XSSFWorkbook book=new XSSFWorkbook();
      XSSFSheet sheet = book.createSheet();
     XSSFRow row = sheet.createRow(0);
     XSSFCell cell = row.createCell(0);
     cell.setCellValue("Automationclass");
     FileOutputStream fos = new FileOutputStream("./Testdata/Framework.xlsx");
     book.write(fos);
     book.close();
     fos.close();
	}

}
