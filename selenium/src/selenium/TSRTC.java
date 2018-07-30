package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\banda\\OneDrive\\Desktop\\BharatSelenium\\selenium\\webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://tsrtconline.in");
		
		List<WebElement>links= driver.findElements(By.tagName("a"));
				
		int linkscount =  links.size();
		
		System.out.println(linkscount);
				
		for(int i=0;i<links.size();i++)
		{
		    String linksname=links.get(i).getText();
		    
		    System.out.println(linksname);
		    
		    links.get(i).click();
		      
		    driver.navigate().back();
		    
		    links=driver.findElements(By.tagName("a"));
		
		    System.out.println(driver.getTitle());
			
		    System.out.println(driver.getCurrentUrl());
		}
		
		
		

	}

}
