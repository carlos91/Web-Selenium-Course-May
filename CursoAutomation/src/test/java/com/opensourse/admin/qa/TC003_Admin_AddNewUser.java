package com.opensourse.admin.qa;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TC003_Admin_AddNewUser {
	@BeforeClass
	public void beforeClass() {

	}

	@Test
	public void TC003_Admin_AddNewUser_Scrip() {
		// Data
		String username = "Admin";
		String password = "admin123";
		String employee = "Sara Tencrady";
		int random = (int) (Math.random() * 1000);
		String newUser = "Carlos Gutierrez" + random;
		String mainPwd = "admin123";
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Step - 1 Open Browser "OrangeHRM" web page
		Reporter.log("Open Browser \"OrangeHRM\" web page ");
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Step 2 Enter User name & password
		Reporter.log("Enter Username and Password");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 3 Validate that you have logged in successfully
		Reporter.log("Validate that you have logged in successfully");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='menu_admin_viewAdminModule']")));

		// Step 4 Click Admin - Go to the admin page
		Reporter.log("Click Admin - Go to the admin page");
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchSystemUser_userName']")));

		// Step 5 Click add
		// btnAdd
		Reporter.log("Click add");
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();

		// Step 6 Enter valid Employee Name
		Reporter.log("Enter valid Employee Name");
		driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']")).sendKeys(employee);

		// Step 7 Enter valid User Name systemUser_userName
		Reporter.log("Enter valid User Name");
		driver.findElement(By.xpath("//input[@id='systemUser_userName']")).sendKeys(newUser);

		// Step 8 Enter a new Password systemUser_password systemUser_confirmPassword
		Reporter.log("Enter a new Password");
		driver.findElement(By.xpath("//input[@id='systemUser_password']")).sendKeys(mainPwd);
		driver.findElement(By.xpath("//input[@id='systemUser_confirmPassword']")).sendKeys(mainPwd);

		// Step 9 Click Save
		Reporter.log("Click Save");
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();

		// Step 10 Search username in field "Username"
		Reporter.log("Search username in field \"Username\"");
		driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']")).sendKeys(newUser);

		// Step 11 Click Search
		Reporter.log("Click Search");
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 12 Verify username exist in table
		Reporter.log("Verify username exist in table");
		String getusername = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
		Assert.assertEquals(getusername, newUser);
//		  SoftAssert softAssert = new SoftAssert();
//	  softAssert.assertEquals(username, "Admon");

		// Step 13 Log out

		Reporter.log("Log out");
		driver.findElement(By.xpath("//a[@id=\"welcome\"]")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"Logout\")]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 14 Close Browser
		Reporter.log("Close Browser");
		driver.close();

		// softAssert.assertAll();

	}

	@AfterClass
	public void afterClass() {
	}

}
