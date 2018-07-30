package com.FirsJavaProgram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hwpf.usermodel.Bookmark;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newtours {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\banda\\OneDrive\\Desktop\\BharatSelenium\\selenium\\webdrivers\\chromedriver.exe");
			
		ChromeDriver driver= new ChromeDriver();
		driver.get("http:newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement country = driver.findElement(By.name("country"));
		List<WebElement>countryNames=country.findElements(By.tagName("option"));
		
		FileInputStream file = new FileInputStream("C:\\Users\\banda\\OneDrive\\Desktop\\BharatSelenium.xlsx");
		XSSFWorkbook Book1 = new XSSFWorkbook(file);
		XSSFSheet sheet = Book1.getSheet("Sheet1");
				 
		for(int i=0;i<countryNames.size();i++)
		{
			String countryName=countryNames.get(i).getText();

			for (int j=0;j<countryName.length();j++)
			{
				Row r=sheet.createRow(j);
				Cell c=r.createCell(j);
			
				c.setCellValue("countryName");
			}
			
		}
		FileOutputStream file1 = new FileOutputStream("C:\\Users\\banda\\OneDrive\\Desktop\\BharatSelenium.xlsx");
		Book1.write(file1);	
	
	}
	
}
