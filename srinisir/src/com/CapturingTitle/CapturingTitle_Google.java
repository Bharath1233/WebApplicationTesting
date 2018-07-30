package com.CapturingTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CapturingTitle_Google {

	public static void main(String[] args)
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		String actual_Title=driver.getTitle(); // Developer
		
		System.out.println(actual_Title);
		
		driver.close();

	}

}
