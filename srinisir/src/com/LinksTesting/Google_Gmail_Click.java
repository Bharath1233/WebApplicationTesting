package com.LinksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Gmail_Click {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		//driver.findElement(By.className("gb_P")).click();
		
		//WebElement gmail=driver.findElementByLinkText("Gmail");
		WebElement gmail=driver.findElementByPartialLinkText("Gmai");
		gmail.click();
		
		System.out.println(driver.getTitle());
		
		driver.close();

	}

}
