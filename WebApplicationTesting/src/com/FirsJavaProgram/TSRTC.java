package com.FirsJavaProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\banda\\OneDrive\\Desktop\\BharatSelenium\\selenium\\webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://tsrtconline.in");
		
		WebElement links=driver.findElement(By.tagName("a"));
		
		Dimension linkscount=links.getSize();
		
		System.out.println(linkscount);
		
		
		
		
	
	
	
	
	
	}
	

}
