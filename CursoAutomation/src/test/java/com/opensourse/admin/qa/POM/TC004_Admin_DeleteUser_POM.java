package com.opensourse.admin.qa.POM;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opensource.admin.UserManagmentPage;
import com.opensource.base.GlobalVariables;
import com.opensource.base.SeleniumWrapper;
import com.opensource.login.LoginPage;
import com.opensource.save.SaveUserPage;

public class TC004_Admin_DeleteUser_POM {
	WebDriver driver;
	SeleniumWrapper seleniumWrapper;
	LoginPage login;
	String username, password, user, employee, newUser,popUp, message;
	UserManagmentPage um;
	SaveUserPage su;

	@BeforeTest
	public void beforeTest() throws InterruptedException {
		seleniumWrapper = new SeleniumWrapper(driver);
		driver = seleniumWrapper.chromeDriverConnection();
		login = new LoginPage(driver);
		um = new UserManagmentPage(driver);
		su = new SaveUserPage(driver);

		// Setup data
		// JSON file
		this.username = seleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "username");
		this.password = seleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "password");
		this.employee = seleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "employee");
		this.newUser = seleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "newUser");
		// Step 1
		login.setup(GlobalVariables.QA_URL);

		// Step 2
		login.loginOrange(username, password);

		// Step 3
		um.validateLoginSuccessfully();

		// Step 4
		um.clickAdmin();

		// Step 5
		su.clickAdd();

		// Step 6
		su.enterEmployee(employee);

		// Step 7
		su.enterNewUser(newUser);

		// Step 8
		su.enterNewPassword(password);

		// Step 9
		su.clickSave();

		// Step 10 & 11
		um.searchUser(newUser, true);

		// Step 12
		um.validateUserTable(newUser);

		// Step 13
		login.logoutOrange();
		

	}

	@Test
	public void TC004_Admin_DeleteUser_POM_Script() throws InterruptedException {
		// Step 1
		login.setup(GlobalVariables.QA_URL);

		// Step 2
		login.loginOrange(username, password);

		// Step 3
		um.validateLoginSuccessfully();

		// Step 4
		um.clickAdmin();
		
		//Step 5 & 6
		um.searchUser(newUser, true);
		
		//Step 7
		um.validateUserTable(newUser);
		
		//Step 8
		um.clickCheckBox();
		
		//Step 9 
		um.deleteUser();
		
		//Step 10
		um.confirmPopUp(popUp);
		
		
		//Step 11
		um.clickOk();
		
		//Step 12
		um.validateNotUserInTable(message);
		
		//Step 14
		login.logoutOrange();

	}

	@AfterTest
	public void afterTest() {
		login.closeBrowser();
		
	}

}
