package com.cucumber.StepDefinitions;

import com.cucumber.Selenium.SeleniumFunctions;

import cucumber.api.java.Before;

public class Hook{
	
	private SeleniumFunctions sf;
	
	public Hook(SeleniumFunctions sf) {
		this.sf = sf;
	}
	
	@Before
	public void initialize() {
		sf.stepInfo = "INFO!!!";
	}
	
}
