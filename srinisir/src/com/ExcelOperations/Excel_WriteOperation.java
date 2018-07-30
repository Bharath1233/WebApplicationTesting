package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_WriteOperation {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\banda\\OneDrive\\Desktop\\BharatSelenium.xlsx");
		XSSFWorkbook Book1 = new XSSFWorkbook(file);
		XSSFSheet sheet = Book1.getSheet("Sheet1");
		
		Row r=sheet.createRow(2);
		Cell c=r.createCell(3);
		
		c.setCellValue("Bharath");
		
		FileOutputStream file1 = new FileOutputStream("C:\\Users\\banda\\OneDrive\\Desktop\\BharatSelenium.xlsx");
		Book1.write(file1);
		
	}

}
