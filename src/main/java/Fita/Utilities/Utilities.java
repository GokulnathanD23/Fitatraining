package Fita.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

@Test
public class Utilities {
	 XSSFWorkbook Workbook = new File("C:\\Users\\dkavi\\eclipse-workspace\\fitatraining\\External_Resources\\Book1.xlsx"));
	
	@Test
	public void readdata() throws InvalidFormatException, IOException {
		
		
		XSSFSheet sheet = Workbook.getSheet("Sheet1");
		XSSFRow row= sheet.getRow(1);
		XSSFCell cell = row.getCell(0);
		
		System.out.println(cell);
		System.out.println(row.getCell(0).toString());
		
		Workbook.close();
		
		
	}
	public static String getlocator(String Indentifier) {
		XSSFWorkbook Workbook=new XSSFWorkbook();
		XSSFSheet sheet = Workbook.getSheet("Webelement");
				String Locator=null;
		for(int i =0 ;i<= sheet.getLastRowNum();i++) {
			XSSFRow row = sheet.getRow(i);
			if(row.getCell(0).toString().equals(Indentifier)) {
				Locator= row.getCell(1).toString();
				break;
			}
		}
	}

}
