package com.entrevista;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class NewTest {
	@BeforeTest
	public void beforeTest() {
	}

	@Test
	public void f() {
		
		System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chrome/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  
		  //Step - 1 Launch Browser 
		  Reporter.log("Open Browser \"Google\" web page ");
//		  driver.get("https://www.google.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		  //Step 2 Open google
		  Reporter.log("Open google");
		  driver.get("https://www.google.com/");
		  
		  //Step 3 Set value in text box
		  Reporter.log("Set value in text box");
		  driver.findElement(By.xpath("//input[@data-ved='0ahUKEwiymMHzidnxAhX8CTQIHX_RBrcQ39UDCAQ']")).sendKeys("Hola mundo");
	}

	@AfterTest
	public void afterTest() {
	}

}
