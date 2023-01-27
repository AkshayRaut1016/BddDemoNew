package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public WebDriver initbrowser()
	{
	     
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		     driver.manage().window().maximize();
		     return driver;
	      
	}

	
	
	
	
	
	
	

}
