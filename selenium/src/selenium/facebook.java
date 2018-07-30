package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\banda\\OneDrive\\Desktop\\BharatSelenium\\selenium\\webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		driver.findElement(By.className("inputtext")).sendKeys("+918008690418");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Loveumom@9");
		
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
	    String expected_title = "Face";
		
		String actual_title = driver.getTitle();
		
		System.out.println("actual_title = Log into Facebook | Facebook");
		
		System.out.println("expeceted_title = Face");
		
		if(actual_title.equals(expected_title))
		{
			System.out.println("Actual_title = " + actual_title);
		}
		else 
			if(actual_title.contains(expected_title))
			{
				System.out.println("Actual_title = " + actual_title);
			}
			else
			{
			System.out.println("expected_title = "+ expected_title);
			}
		
		System.out.println(driver.getCurrentUrl()); 
	    
		driver.close();
	
	}

}
