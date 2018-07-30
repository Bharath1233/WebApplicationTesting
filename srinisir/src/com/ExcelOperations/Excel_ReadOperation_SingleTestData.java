package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_ReadOperation_SingleTestData {

	public static void main(String[] args) throws IOException
	{
		/*1. identify the Excel file on the System
 		2. identify the WorkBook in the File
 		3. identify the Sheet in a workBook
 		4. identify the Row
 		5. identify a Cell in a Row
 		6. get the data from the Row of a Cell */
		
		FileInputStream file = new FileInputStream("C:\\Users\\Sys\\Desktop\\BharatSelenium\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\BharathTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		Row r=sheet.getRow(0); // in the sheet going to 0th Row
		Cell c=r.getCell(0); // in 0th row going to 0th Cell
		
		String data=c.getStringCellValue(); // from the 0th row of 0th cell getting String value
		System.out.println(data);
		
		
		
		
		

	}

}
