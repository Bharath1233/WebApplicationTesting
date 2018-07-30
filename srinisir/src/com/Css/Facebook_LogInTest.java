package com.Css;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_LogInTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
// <input id="email" class="inputtext" type="email" data-testid="royal_email" tabindex="1" name="email"/>
		
		//tagName[@Attribute='value']
		
		//driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("Hellooo");
		
		//driver.findElement(By.xpath("//*[@class='inputtext']")).sendKeys("Hello");
		
		// only for ID
		driver.findElement(By.cssSelector("input#email")).sendKeys("Hello");
		
		// <input id="pass" class="inputtext" type="password" data-testid="royal_pass" tabindex="2" name="pass"/>
		
		//driver.findElement(By.xpath("//*[@class='inputtext' and @data-testid='royal_pass']")).sendKeys("Hiiiiiiiiiiiiiiiiiiiiiiiiiii");
		
		// only for class
		
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Hiiiiiiiiii");
		
		driver.findElement(By.cssSelector("input[data-testid=royal_pass][type=password")).sendKeys("Hiiiiiiiiiiii");
		

	}

}
