package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_HomePage_DisplayingLinkNames {

	public static void main(String[] args)
	{

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		// a - tag
		// href - attribute 
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		int linksCount=links.size();
		
		System.out.println(linksCount);
		
		for(int i=0;i<links.size();i++)
		{
		
			String linkName=links.get(i).getText();
			System.out.println(i+"  "+linkName);
		}
		driver.close();

	}

}
