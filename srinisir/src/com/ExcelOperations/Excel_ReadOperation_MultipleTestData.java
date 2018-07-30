package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_ReadOperation_MultipleTestData {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\banda\\OneDrive\\Desktop.xlsx");
		XSSFWorkbook Book1 = new XSSFWorkbook(file);
		XSSFSheet sheet = Book1.getSheet("Sheet1");
		
		int RowCount=sheet.getLastRowNum();
		
		for(int i=0;i<=RowCount;i++) // For Rows
		{
			int CellCount=sheet.getRow(i).getLastCellNum();
			for(int j=0;j<CellCount;j++) // Of every Row , this will run for total no.of cells in the Row
			{
				Cell c=sheet.getRow(i).getCell(j);
				String data=c.getStringCellValue();
				System.out.print(data+"  ");
			}
			System.out.println();
			
		}
		
		
		

	}

}
