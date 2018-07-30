package com.MouseHoverOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSignIn_MouseHover {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\banda\\OneDrive\\Desktop\\BharatSelenium\\selenium\\webdrivers\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://amazon.in");
		
		// <a id="nav-link-yourAccount"
		
		WebElement helloSignIN=driver.findElement(By.id("nav-link-yourAccount"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(helloSignIN).build().perform();
		
		driver.findElement(By.xpath(".//*[@id='nav-flyout-yourAccount']/div[3]/a[3]/span")).click();
	}

}
