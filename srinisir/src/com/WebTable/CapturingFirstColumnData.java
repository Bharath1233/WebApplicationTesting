package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingFirstColumnData {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		
		// html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr[1]/td[1]
		//html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr[36]/td[1]
		
		for(int i=1;i<=36;i++)
		{
			String cityName=driver.findElement(By.xpath("html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr["+i+"]/td[1]")).getText();
			System.out.println(cityName);
		
		}
		
		
		driver.close();

	}

}
