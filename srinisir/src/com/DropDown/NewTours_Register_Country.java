package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_Country {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.gecko.driver","C:\\Users\\banda\\OneDrive\\Desktop\\BharatSelenium\\selenium\\webdrivers\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		// <a href="mercuryregister.php">REGISTER</a>
		
		String linkTextURL=driver.findElement(By.linkText("REGISTER")).getAttribute("href");
		System.out.println(linkTextURL);
		
		/*driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement country=driver.findElement(By.name("country"));
		
		List<WebElement>countryNames=country.findElements(By.tagName("option"));
		
		for(int k=0;k<countryNames.size();k++)
		{
			String countryName=countryNames.get(k).getText();
			System.out.println(countryName);
		}*/

		
	}

}