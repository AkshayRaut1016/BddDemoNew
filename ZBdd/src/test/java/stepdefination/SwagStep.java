package stepdefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pages.LoginP;
import utility.BaseClass;

public class SwagStep extends BaseClass {
	WebDriver driver;
	BaseClass bc;
	LoginP lp;

	@Given(": user opens the browser")
	public void user_opens_the_browser() {
		bc = new BaseClass();
		driver = bc.initbrowser();
		lp = new LoginP(driver);
		
	}

	@And(": hits the url {string}")
	public void hits_the_url(String string) {
		driver.get(string);
	}

	@When(": Enter the valid name {string}")
	public void enter_the_valid_name(String string) {
		lp.entername(string);
	}

	@And(": Enter the valid pass {string}")
	public void enter_the_valid_pass(String string) {
		lp.enterpass(string);
		
	}

	@When(": click on submit")
	public void click_on_submit() {
		lp.submit();
	}

	@Then(": user must be able to logged in")
	public void user_must_be_able_to_logged_in() {
		lp.getTitle();
	}


	





}
