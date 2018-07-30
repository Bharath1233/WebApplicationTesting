package com.NewToursTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_LogInTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
		driver.findElement(By.name("login")).click();
		
		String expected_Title="Find";
		
		String actual_Title=driver.getTitle();
		
		if(actual_Title.contains(expected_Title))
		{
			System.out.println("Title matched -- PASS");
		}
		else
		{
			System.out.println("Title not matched -- FAIL");
		}
		
		driver.close();

	}

}
