package com.opensource.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opensource.base.SeleniumWrapper;

public class UserManagmentPage extends SeleniumWrapper {

	public UserManagmentPage(WebDriver driver) {
		super(driver);

	}

	By linkUM = By.xpath("//a[@id='menu_admin_viewAdminModule']");
	By txtUsername = By.xpath("//input[@id='searchSystemUser_userName']");
	By txtSearchUser = By.xpath("//input[@id='searchSystemUser_userName']");
	By btnSearch = By.xpath("//input[@id='searchBtn']");
	By tblUsername = By.xpath("//tbody/tr[1]/td[2]");
	By tblUnvalidUsername = By.xpath("//tbody/tr[1]/td[1]");
	By btnDeleteUser = By.xpath("//input[@id='btnDelete']");
	By btnCheckBox = By.xpath("//tbody/tr[1]/td[1]");
	By btnOk = By.xpath("//input[@id='dialogDeleteBtn']");
	By txtDeleteRecords = By.xpath("//*[text() = 'Delete records?']");
	By tblStatus = By.xpath("//tbody/tr[1]/td[5]");

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
	 * 
	 * @author carlos gutierrez
	 */
	public void searchUser(String username, boolean clickSearch) {
		reportLog("Search username in field \"Username\"");
		type(username, txtSearchUser);
		if (clickSearch) {
			click(btnSearch);
		}
	}

	/**
	 * Validate user exists in table
	 * 
	 * @author carlos gutierrez
	 */
	public void validateUserTable(String expectedUser) {
		reportLog("Verify username exist in table");
		String actualUser = getText(tblUsername);
		SoftAssert(actualUser, expectedUser);
	}

	/**
	 * Search userUnValidName
	 * 
	 * @author carlos gutierrez
	 */
	public void searchNonValidUser(String user, boolean clickSearch) {
		reportLog("Search username in field \"Username\"");
		type(user, txtSearchUser);
		if (clickSearch) {
			click(btnSearch);
		}
	}

	/**
	 * Validate user dosen't exists in table
	 * 
	 * @author carlos gutierrez
	 */
	public void validateNotUserInTable(String unExpectedUser) {
		reportLog("Verify username is not existing in table");
		String actualUser = getText(tblUnvalidUsername);
		SoftAssert(actualUser, unExpectedUser);

	}
	
	public void clickCheckBox() {
		reportLog("Select User");
		click(btnCheckBox);
		
	}
	
	public void deleteUser() {
		reportLog("Click delete");
		click(btnDeleteUser);
		}
	
	public void confirmPopUp(String popUp) {
		reportLog("\"Validate pop-window is displayed: \\\"Delete Records?\\\"\"");
		String message = getText(txtDeleteRecords);
		SoftAssert(message, popUp);		
	}
	
	public void clickOk() {
		reportLog("Click Ok to confirm delete user");
		click(btnOk);
	}
	
	public void checkStauts(String status) {
		reportLog("Verify username Status in table");
		String actualStatus = getText(tblStatus);
		SoftAssert(actualStatus, status);
	}
	
	public void createUser(String user) {
		
		
		
	}

	
	
	

}
