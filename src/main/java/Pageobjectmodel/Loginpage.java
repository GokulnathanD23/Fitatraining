package Pageobjectmodel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import Baseclass.Baseclass;

public class Loginpage extends Baseclass{
	
	By useremail=By.id(null);
	
	public static String readata() throws InvalidFormatException, IOException {
		
		XSSFWorkbook Workbook = new XSSFWorkbook(new File("C:\\Users\\dkavi\\eclipse-workspace\\fitatraining\\External_Resources\\Book1.xlsx"));
		XSSFSheet sheet = Workbook.getSheet("Sheet1");
		XSSFRow row= sheet.getRow(1);
		XSSFCell cell = row.getCell(0);
		
		Workbook.close();
		return cell.toString();
		
	}
public static String getpassword() throws InvalidFormatException, IOException {
		
		XSSFWorkbook Workbook = new XSSFWorkbook(new File("C:\\Users\\dkavi\\eclipse-workspace\\fitatraining\\External_Resources\\Book1.xlsx"));
		XSSFSheet sheet = Workbook.getSheet("Sheet1");
		XSSFRow row= sheet.getRow(1);
		XSSFCell cell = row.getCell(0);
		
		Workbook.close();
		return cell.toString();
		}

	
	
	
	

}
