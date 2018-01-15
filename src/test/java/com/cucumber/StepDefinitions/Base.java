package com.cucumber.StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.Before;

public class Base {

	private static boolean initialized = false;

	public WebDriver driver;
	
	public WebDriverWait waitVar = null;

	public String baseURL = "https://github.com/";

	@Before
	public void setUp() throws Exception {
		if (!initialized) {
			// initialize the driver
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe"); 
			driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			driver.get(baseURL);

			waitVar = new WebDriverWait(driver, 15);

			initialized = true;
		}
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	public WebDriverWait getWebDriverWait() {
		return waitVar;
	}
}
