package com.ValidatingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingTitle_Google {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("http://google.com");
		
		String expected_Title="Google"; // Requirement
		
		String actual_Title=driver.getTitle(); // Developer developed Title
		
		System.out.println("Expected Title :"+expected_Title);
		System.out.println("Actual Title : "+actual_Title);
		
		if(actual_Title.equals(expected_Title))
		{
			System.out.println("Title Matched -- PASS");
		}
		else
		{
			System.out.println("Title not matched -- FAIL");
		}
		
		driver.close();

	}

}
