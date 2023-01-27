package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class LoginP {
	@FindBy(xpath="//*[@id='user-name']") WebElement username;
	@FindBy(xpath="//*[@id='password']") WebElement password;
	@FindBy(xpath="//*[@id='login-button']") WebElement submitbutton;
	WebDriver driver;
	
	
	public LoginP(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void entername(String name)
	{
		username.sendKeys(name);
		
	}
	public void enterpass(String pass)
	{
		password.sendKeys(pass);
	}
	public void submit()
	{
		submitbutton.click();

		
	}
	
	public void getTitle()
	{      String expected = "Swag Labs";
		String	actual =driver.getTitle();
		System.out.println(actual);
		// Assert.assertEquals(actual, expected);
		
	}
	
	
	
	
	
	

}
