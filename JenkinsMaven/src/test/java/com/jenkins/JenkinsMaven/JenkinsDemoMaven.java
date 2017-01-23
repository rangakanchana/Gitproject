package com.jenkins.JenkinsMaven;


import static org.testng.AssertJUnit.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class JenkinsDemoMaven {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite(){
		
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
	}
	@Test
	public void verifyTitle(){
		assertTrue(driver.getTitle().contains("Google"));
	}






}
