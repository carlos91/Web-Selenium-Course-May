package com.opensourse.admin.qa.POM;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opensource.admin.UserManagmentPage;
import com.opensource.base.GlobalVariables;
import com.opensource.base.SeleniumWrapper;
import com.opensource.login.LoginPage;


public class TC001_Admin_SearchEmployee_POM {
	WebDriver driver;
	SeleniumWrapper seleniumWrapper;
	LoginPage login;
	String username, password;
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
	  //Excel
//	  this.username = seleniumWrapper.getCellData(this.getClass().getSimpleName(), 1, 0);
//	  this.password = seleniumWrapper.getCellData(this.getClass().getSimpleName(), 1, 1);
  }
  
  @Test
  public void TC001_Admin_SEarchEmployee_POM_Script() throws InterruptedException {
	  // Step 1
	  login.setup(GlobalVariables.QA_URL);
	  
	  // Step 2
	  login.loginOrange(username, password);
	  
	  // Step 3
	  um.validateLoginSuccessfully();
	  
	  // Step 4
	  um.clickAdmin();
	  
	  // Step 5 & 6
	  um.searchUser(username, true);
	  
	  // Step 7
	  um.validateUserTable(username);
	  
	  //Step 8
	  login.logoutOrange();
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  // Step 9
	  login.closeBrowser();
	  
	  
  }

}
