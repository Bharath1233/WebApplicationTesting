package com.DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_JQuery {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\banda\\OneDrive\\Desktop\\BharatSelenium\\selenium\\webdrivers\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		// <iframe class="demo-frame" src="/resources/demos/droppable/default.html">
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
		

	}

}
