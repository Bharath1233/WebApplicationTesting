package com.CapturingUrl;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingUrl_Facebook {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		String actual_Url=driver.getCurrentUrl();
		
		System.out.println(actual_Url);
		
		driver.close();

	}

}
