package com.opensourse.admin.qa.POM;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opensource.admin.UserManagmentPage;
import com.opensource.base.GlobalVariables;
import com.opensource.base.SeleniumWrapper;
import com.opensource.login.LoginPage;


public class TC002_Admin_SearchEmployee_NotExist_POM {
	WebDriver driver;
	SeleniumWrapper seleniumWrapper;
	LoginPage login;
	String username, password, user,message;
	UserManagmentPage um;
  
  @BeforeTest
  public void beforeTest() {
	  
	  seleniumWrapper = new SeleniumWrapper(driver);
	  driver = seleniumWrapper.chromeDriverConnection();
	  login = new LoginPage(driver);
	  um = new UserManagmentPage(driver);
	  
	  //Setup data
	  //JSON file
	  this.username = seleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "username");
	  this.password = seleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "password");
	  this.user = seleniumWrapper.getJSONValue(this.getClass().getSimpleName(),"user");
	  this.message = seleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "message");
  }
  @Test
  public void TC002_Admin_SearchEmployee_NotExist_POM_Script() {
	// Step 1
		  login.setup(GlobalVariables.QA_URL);
		  
		  // Step 2
		  login.loginOrange(username, password);
		  
		  // Step 3
		  um.validateLoginSuccessfully();
		  
		  // Step 4
		  um.clickAdmin();
		  
		  // Step 5 & 6
		  um.searchUser(user, true);
		  
		  // Step 7
		  um.validateNotUserInTable(message);
		  
		  //Step 8
		  login.logoutOrange();
		  
		 
	  
  }

  @AfterTest
  public void afterTest() {
	 
	  login.closeBrowser();
  }

}
