package com.perro;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class itesoForce {
 
  @BeforeTest
  public void beforeTest() {
  }
  @Test
  public void itesoForceLogin() {
	  System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chrome/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://iteso.force.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  //Login
	  driver.findElement(By.xpath("//input[@id='60:2;a']")).sendKeys("beneranda@gmail.com");
	  driver.findElement(By.xpath("//input[@id='70:2;a']")).sendKeys("Pa5kis94");
	  driver.findElement(By.xpath("//span[@dir='ltr']")).click();
	  
	  //Log out
	  driver.findElement(By.xpath("//div[@id=\"210:0\"]")).click();
	  driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div/div[3]/div[4]/div/div[2]/div/div/div/div[2]/div/ul/li[5]/a")).click();
	  
	  
	  
	  
	 // driver.close();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
