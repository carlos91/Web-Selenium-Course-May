package com.opensource.save;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

import com.opensource.base.SeleniumWrapper;

public class SaveUserPage extends SeleniumWrapper {

	public SaveUserPage(WebDriver driver) {
		super(driver);
		
	}

	By btnAdd = By.xpath("//input[@id='btnAdd']");
	By txtNewUser = By.xpath("//input[@id='systemUser_userName']");
	By txtNewPassword = By.xpath("//input[@id='systemUser_password']");
	By txtConfirmNewPassword = By.xpath("//input[@id='systemUser_confirmPassword']");
	By btnSave = By.xpath("//input[@id='btnSave']");
	By txtEmployee = By.xpath("//input[@id='systemUser_employeeName_empName']");
	By txtUsername = By.xpath("//input[@id='searchSystemUser_userName']");
//	By idSystemStatus = By.id("systemUser_status");
	By systemStatus = By.xpath("//select[@id='systemUser_status']");
	By stauts0 = By.xpath("//option[@value='0']");
	int random = (int) (Math.random() * 1000);

	/**
	 * Click Button add
	 * 
	 * @author carlos gutierrez
	 */
	public void clickAdd() {
		reportLog("Click add");
		click(btnAdd);
		//waitForElementPresent(btnSave);
	}

	public void enterEmployee(String employee) {
		reportLog("Enter valid Employee Name");
		type(employee, txtEmployee);
//		takeScreenshot("enterEmployee");
	}

	public void enterNewUser(String newUser) {
		reportLog("Enter new user");
		type(newUser, txtNewUser);
		
	}
	
	public void JsonUpdate(String newRandom) {
		
	}

	public void enterNewPassword(String newPassword) {
		reportLog("Enter a new Password");
		type(newPassword, txtNewPassword);
		type(newPassword, txtConfirmNewPassword);
	}

	public void clickSave() {
		reportLog("Click save");
		click(btnSave);
		waitForElementPresent(txtUsername);
	}
	
	public void selectStatus() {
		reportLog("\"Change Status Disabled\"");
//		Select drpStatus = new Select (driver.findElement(idSystemStatus));
//        drpStatus.selectByVisibleText("Disabled");
		click(systemStatus);
		click(stauts0);
		
	}

}
