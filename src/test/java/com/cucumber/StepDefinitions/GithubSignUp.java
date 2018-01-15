package com.cucumber.StepDefinitions;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import com.cucumber.Selenium.SeleniumFunctions;
import com.google.common.util.concurrent.Uninterruptibles;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GithubSignUp {
	
	private SeleniumFunctions sf;
		
	public GithubSignUp(SeleniumFunctions sf) {
		this.sf = sf;
	}

    @Given("^user is on github homepage for signup$")
    public void user_is_on_github_homepage_for_signup() throws MalformedURLException,
            InterruptedException {
        sf.ishomepageDisplayed();
    	
        System.out.println("GIT SIGN UP: "+sf.stepInfo);
    }

    @When("^user fills sign up form$")
    public void user_fills_sign_up_form() {
        sf.signUpForm();
        Uninterruptibles.sleepUninterruptibly(3000, TimeUnit.MILLISECONDS);
    }

    @Then("^browser_teardown$")
    public void browser_teardown() {
        sf.teardown();
    }
}
