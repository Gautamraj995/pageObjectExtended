package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNgBasics {
	
	@BeforeSuite
	public void setUp() {
		System.out.println("setup System Property for Chrome");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("launch chrome browser");
	}
	
	@BeforeMethod
	public void enterUrl() {
		System.out.println("Enter URL");
	}
	
	@BeforeTest
	public void login() {
		System.out.println("login method");
	}
	
	
	
	
	
	
}
