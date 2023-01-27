package yourstorep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourstoreP {
	WebDriver driver;
	@FindBy(xpath = "//*[@id='Email']")
	WebElement email;

	@FindBy(xpath = "//*[@id='Password']")
	WebElement password;
	@FindBy(xpath = "//*[text()='Log in']")
	WebElement login;

	public YourstoreP(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void entername(String name) {
		email.sendKeys(name);

	}

	public void enterpass(String pass) {
		password.sendKeys(pass);
	}

	public void login() {
		login.click();

	}

	public void gettitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}
}
