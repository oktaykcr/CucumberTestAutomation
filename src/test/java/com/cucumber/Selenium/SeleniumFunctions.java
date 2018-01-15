package com.cucumber.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.StepDefinitions.Base;
import com.google.common.util.concurrent.Uninterruptibles;


public class SeleniumFunctions{
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public String stepInfo;
	
	@FindBy(id="user[login]")
	private WebElement element;

	public SeleniumFunctions(Base base) {
		driver = base.getDriver();
		wait = base.getWebDriverWait();
		PageFactory.initElements(driver, this);
	}

	public void teardown() {
		driver.quit();
	}
	
	public void ishomepageDisplayed() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Sign in")));
				
		driver.findElement(By.linkText("Sign in")).isDisplayed();
		
	}

	public void clickSigninLink() {
		driver.findElement(By.linkText("Sign in")).click();
	}

	public void isloginsectionDisplayed() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By
				.className("auth-form-body")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By
				.name("commit")));
	}
	
	public void signUpForm() {
		driver.findElement(By.id("user[login]")).sendKeys("username");
		driver.findElement(By.id("user[email]")).sendKeys("email");
		driver.findElement(By.id("user[password]")).sendKeys("password");
		Uninterruptibles.sleepUninterruptibly(2000, TimeUnit.MILLISECONDS);
		System.out.println("element text: " + element.getAttribute("value"));
	}
	
}
