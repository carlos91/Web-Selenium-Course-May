package com.opensource.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opensource.base.SeleniumWrapper;

public class LoginPage extends SeleniumWrapper {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	// Objetos
	By txtUsername = By.xpath("//input[@id='txtUsername']");
	By txtPassword = By.xpath("//input[@id='txtPassword']");
	By btnLogin = By.xpath("//input[@id='btnLogin']");
	By btnWelcome = By.xpath("//a[@id=\"welcome\"]");
	By btnLogout = By.xpath("//a[contains(text(),\"Logout\")]");

	// Metodos

	/**
	 * Set up envoroment
	 * 
	 * @author carlos
	 */
	public void setup(String url) {
		launchBrowser(url);
//		takeScreenshot("setup");
	}

	/*
	 * Login Orange App
	 */
	public void loginOrange(String username, String password) {
		reportLog("login OrangeHRM web page ");
		type(username, txtUsername);
		type(password, txtPassword);
		click(btnLogin);
		implicitWait(5);
//		takeScreenshot("loginOrange");
	}

	/**
	 * Logout orange
	 * 
	 * @author carlos gutierrez
	 * @throws InterruptedException 
	 */
	public void logoutOrange()  {
		reportLog("Logout OrangeHRM web page");
		click(btnWelcome);
		waitForElementClickable(btnLogout);
		click(btnLogout);
		waitForElementClickable(btnLogout);
		implicitWait(5);
//		takeScreenshot("logoutOrange");

	}

}
