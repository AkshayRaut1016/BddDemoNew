package stepdefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

import utility.BaseClass;

public class YourstoreSetp extends BaseClass {
	WebDriver driver;
	BaseClass bc;
	yourstorep.YourstoreP yp;

	@Given(":  user opens the browser")
	public void user_opens_the_browser() {
		bc = new BaseClass();
		driver = bc.initbrowser();
		yp = new yourstorep.YourstoreP(driver);

	}
	@And(": hits the url {string}")
	public void hits_the_url(String string) {
		driver.get(string);
	}

	@Then(": Enters the valid username {string}")
	public void enters_the_valid_username(String string) {
		yp.entername(string);
	}

	@Then(": Enters the valid password  {string}")
	public void enters_the_valid_password(String string) {
		yp.enterpass(string);
	}

	@Then(": Clicks on login")
	public void clicks_on_login() {
		yp.login();
	}

	@Then(": user must be able to logged in to the application")
	public void user_must_be_able_to_logged_in_to_the_application() {
		yp.gettitle();
	}

}
