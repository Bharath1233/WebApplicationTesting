package com.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MyMonster_CurrentLocation_Industry_Select {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://my.monsterindia.com/sponsered_popup.html");
		
		// <select class="border_grey1"
		
		WebElement currentLocation=driver.findElement(By.className("border_grey1"));
		Select selection = new Select(currentLocation);
		//selection.selectByIndex(4);
		//selection.selectByVisibleText("Chennai");
		selection.selectByValue("491");
		
		
		// select id="id_industry"
		WebElement industry=driver.findElement(By.id("id_industry"));
		Select Sel = new Select(industry);
		Sel.selectByIndex(1);
		Sel.selectByValue("4");
		Sel.selectByVisibleText("Banking/ Financial Services");
		
		
		

	}

}
