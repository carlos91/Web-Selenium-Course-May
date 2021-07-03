package com.opensource.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opensource.base.SeleniumWrapper;

public class UserManagmentPage extends SeleniumWrapper{

	public UserManagmentPage(WebDriver driver) {
		super(driver);
		
	}
	
	By linkUM = By.xpath("//a[@id='menu_admin_viewAdminModule']");
	By txtUsername = By.xpath("//input[@id='searchSystemUser_userName']");
	By txtSearchUser = By.xpath("//input[@id='searchSystemUser_userName']");
	By btnSearch = By.xpath("//input[@id='searchBtn']");
	By tblUsername = By.xpath("//tbody/tr[1]/td[2]");
	
	/*
	 * Validate Login success
	 */
	
	public void validateLoginSuccessfully() {
		reportLog("Validate that you have logged in successfully");
		waitForElementPresent(linkUM);
	}
	
	/*
	 * Click admin
	 */
	
	public void clickAdmin() {
		reportLog("Click Admin - Go to the admin page");
		click(linkUM);
		waitForElementPresent(txtUsername);
	}
	
	/**
	 * Search userName
	 * @author carlos gutierrez
	 */
	public void searchUser(String username, boolean clickSearch) {
		reportLog("Search username in field \"Username\"");
		type(username, txtSearchUser);
		if(clickSearch) {
			click(btnSearch);
		}
	}
	
	/**
	 * Validate user exists in table
	 * @author carlos gutierrez
	 */
	public void validateUserTable(String expectedUser) {
		reportLog("Verify username exist in table");
		String actualUser = getText(tblUsername);
		AssertEquals(actualUser, expectedUser);
	}

}
