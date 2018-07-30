package com.ValidatingUrl;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingUrl_facebook {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		String actual_Url=driver.getCurrentUrl();
		
		String expected_url="facebook.com";
		
		System.out.println("Actual Url:"+ actual_Url);
		System.out.println("Expected Url: "+ expected_url);
		
		if(actual_Url.contains(expected_url))
		{
			System.out.println("Url matched -- PASS");
		}
		else
		{
			System.out.println("Url not matched -- FAIL");
		}
		
		driver.close();

	}

}
