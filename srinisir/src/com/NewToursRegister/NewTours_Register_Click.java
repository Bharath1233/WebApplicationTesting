package com.NewToursRegister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_Click {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		// <a href="mercuryregister.php">REGISTER</a>
		
		// a - tag -- link
		// href - attribute -- reference URL
		
		// locator - linkText
		// Selector -REGISTER
		
	WebElement	register=driver.findElement(By.linkText("REGISTER"));
	register.click();
	
	System.out.println(driver.getTitle());
	
	driver.close();
		
		

	}

}
