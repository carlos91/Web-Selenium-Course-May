package com.opensource.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opensource.base.SeleniumWrapper;

public class LoginPage extends SeleniumWrapper {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
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
	}

	/**
	 * Logout orange
	 * 
	 * @author carlos gutierrez
	 */
	public void logoutOrange() {
		reportLog("Logout OrangeHRM web page");
		click(btnWelcome);
		click(btnLogout);
		implicitWait(5);

	}

}
