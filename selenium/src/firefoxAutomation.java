import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxAutomation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\banda\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.com");
	    
		String expected_title = "Goo";
		String actual_Title= driver.getTitle();
		
		System.out.println("expected_title " + expected_title);
		System.out.println("actual_title" + actual_Title);
		
		if(actual_Title.contains(expected_title))
		{
			System.out.println("title matched __ pass");
		}
		else
		{
			System.out.println("title not matched -- fail");
		}
		
		driver.quit();
	
	}
	
}
