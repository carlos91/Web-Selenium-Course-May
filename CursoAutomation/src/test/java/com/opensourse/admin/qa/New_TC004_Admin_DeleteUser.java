//package com.opensourse.admin.qa;
//
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeTest;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.Reporter;
//import org.testng.annotations.AfterTest;
//
//public class New_TC004_Admin_DeleteUser extends TC003{
//	String username = "Admin";
//	String password = "admin123";
//	String employee = "Sara Tencrady";
//	String mainPwd = "admin123";
// 
//  @BeforeTest
//  public void beforeTest() {
//  }
//  
//  @Test
//  public void TC004_Admin_DeleteUser_Script() {
//	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//
//		// Step - 1 Open Browser "OrangeHRM" web page
//		Reporter.log("Open Browser \"OrangeHRM\" web page ");
//		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//		// Step 2 Enter User name & password
//		Reporter.log("Enter Username and Password");
//		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
//		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//		// Step 3 Validate that you have logged in successfully
//		Reporter.log("Validate that you have logged in successfully");
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='menu_admin_viewAdminModule']")));
//
//		// Step 4 Click Admin - Go to the admin page
//		Reporter.log("Click Admin - Go to the admin page");
//		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchSystemUser_userName']")));
//
//		// Step 5 Search username in field "Username"
//		Reporter.log("Search username in field \"Username\"");
//		driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']")).sendKeys(newUser);
//
//		// Step 6 Click Search
//		Reporter.log("Click Search");
//		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//		// Step 7 Verify username exist in table
//		Reporter.log("Verify username exist in table");
//		String getusername = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
//		Assert.assertEquals(getusername, newUser);
//
//		// Step 8 Select User
//		Reporter.log("Select User");
//		driver.findElement(By.xpath("//tbody/tr[1]/td[1]")).click();
//
//		// Step 9 Click Delete
//		// btnDelete
//		Reporter.log("Click delete");
//		driver.findElement(By.xpath("//input[@id='btnDelete']")).click();
//
//		// Step 10 Validate pop-window is displayed: "Delete Records?"
//		Reporter.log("Validate pop-window is displayed: \"Delete Records?\"");
//		WebDriverWait wait1 = new WebDriverWait(driver, 5);
//		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='dialogDeleteBtn']")));
//
//		// Step 11 Click Ok to confirm delete user
//		Reporter.log("Click Ok to confirm delete user");
//		driver.findElement(By.xpath("//input[@id='dialogDeleteBtn']")).click();
//
//		// Step 12 Validate in table that user was delete successfully
//		Reporter.log("Validate in table that user was delete successfully");
//		driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']")).sendKeys(newUser);
//		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		String username = driver.findElement(By.xpath("//tbody/tr[1]/td[1]")).getText();
//		Assert.assertEquals(username, "No Records Found");
//
//		// Step 13 Log out
//		Reporter.log("Log out");
//		driver.findElement(By.xpath("//a[@id=\"welcome\"]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),\"Logout\")]")).click();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//		// Step 14 Close Browser
//		Reporter.log("Close Browser");
//		driver.close();
//  }
//  
//  @AfterTest
//  public void afterTest() {
//  }
//
//}
