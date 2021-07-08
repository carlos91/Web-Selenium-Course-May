package com.opensource.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

/**
 * Selenium wrapper class Base Class
 * 
 * @author carlos gutierrez
 *
 */

public class SeleniumWrapper {

	private WebDriver driver;

	/**
	 * Constructo SeleniumWrapper
	 * 
	 * @author carlos gutierrez
	 * 
	 * @param driver
	 * 
	 * @return
	 * 
	 * @throws
	 * 
	 */
	public SeleniumWrapper(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Chrome driver connectiron
	 * 
	 * @author carlos gutierrez
	 * @param driver
	 */
	public WebDriver chromeDriverConnection() {
		System.setProperty(GlobalVariables.CHROME_DRIVER_NAME, GlobalVariables.CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
		return driver;
	}

	/**
	 * Reporter log
	 * 
	 * @author carlos
	 */
	public void reportLog(String log) {
		Reporter.log(log);
	}

	/*
	 * Implicit wait
	 */
	public void implicitWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}

	/*
	 * Launch Browser
	 * 
	 * @author Carlos
	 */

	public void launchBrowser(String url) {
		try {
			reportLog("Launching... " + url + "application");
			driver.get(url);
			driver.manage().window().maximize();
			implicitWait(5);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * Find element
	 */

	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}

	/*
	 * Type text
	 */
	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}

	/**
	 * Click object
	 * 
	 * @author carlos gutierrez
	 */
	public void click(By locator) {
		driver.findElement(locator).click();
		implicitWait(5);
	}

	/**
	 * Wait for element present
	 * 
	 * @author carlos gutierrez
	 */
	public void waitForElementPresent(By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Get Text
	 * 
	 * @author carlos gutierrez
	 */
	public String getText(By locator) {
		try {
			return driver.findElement(locator).getText();
		} catch (NoSuchElementException e) {
			return null;
		}

	}

	/*
	 * Hard Assertion
	 */
	public void AssertEquals(String actualValue, String expectedValue) {
		try {
			Assert.assertEquals(actualValue, expectedValue);
		} catch (AssertionError e) {
			Assert.fail("Not able to assert actual value <" + actualValue + "> with expected value <" + expectedValue
					+ ">");
			e.printStackTrace();
		}
	}

	/**
	 * Soft Assertion
	 * 
	 * @author carlos gutierrez
	 */
	public void SoftAssert(String actualValue, String expectedValue) {
		try {
			SoftAssert assertion = new SoftAssert();
			assertion.assertEquals(actualValue, expectedValue);
//			assertion.fail("Not able to assert actual value <" + actualValue + "> with expected value <" + expectedValue
//					+ ">");
			assertion.assertAll();
		} catch (AssertionError e) {
			SoftAssert assertion = new SoftAssert();
			assertion.fail("Not able to assert actual value <" + actualValue + "> with expected value <" + expectedValue
					+ ">");
			e.printStackTrace();
		}

	}

	/**
	 * Close Browser
	 * 
	 * @author carlos gutierrez
	 */
	public void closeBrowser() {
		try {
			reportLog("Closing Browser...");
			driver.close();
		} catch (NoSuchSessionException e) {
			Assert.fail("No able to close browser");
		}
	}

	/*
	 * * Get Value from Excel * @author Ric... de Ricardo Avalos /* Get Value from
	 * Excel
	 * 
	 * @author Ricardo Avalos
	 * 
	 * @date 02/18/2019
	 */
	public String getCellData(String excelName, int row, int column) {
		try {
			// Reading Data
			FileInputStream fis = new FileInputStream(GlobalVariables.PATH_EXCEL_DATA + excelName + ".xlsx");
			// Constructs an XSSFWorkbook object
			@SuppressWarnings("resource")
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheetAt(0);
			Row rowObj = sheet.getRow(row);
			Cell cell = rowObj.getCell(column);
			String value = cell.getStringCellValue();
			return value;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e1) {
			e1.printStackTrace();
			return null;
		}
	}

	/**
	 * Get Data from JSON file (1 Node)
	 *
	 * @author Ricardo Avalos
	 * @param jsonFile, jsonObjName, jsonKey
	 * @return jsonValue
	 * @throws FileNotFoundException
	 */
	public String getJSONValue(String jsonFile, String jsonObjName, String jsonKey) {
		try {

			// JSON Data
			InputStream inputStream = new FileInputStream(GlobalVariables.PATH_JSON_DATA + jsonFile + ".json");
			JSONObject jsonObject = new JSONObject(new JSONTokener(inputStream));

			// Get Data
			String jsonValue = (String) jsonObject.getJSONObject(jsonObjName).get(jsonKey);
			return jsonValue;

		} catch (FileNotFoundException e) {
			Assert.fail("JSON file is not found");
			return null;
		}
	}

	/**
	 * Get Data from JSON file (Directly)
	 *
	 * @author Ricardo Avalos
	 * @param jsonFile, jsonKey
	 * @return jsonValue
	 * @throws FileNotFoundException
	 */
	public String getJSONValue(String jsonFileObj, String jsonKey) {
		try {

			// JSON Data
			InputStream inputStream = new FileInputStream(GlobalVariables.PATH_JSON_DATA + jsonFileObj + ".json");
			JSONObject jsonObject = new JSONObject(new JSONTokener(inputStream));

			// Get Data
			String jsonValue = (String) jsonObject.getJSONObject(jsonFileObj).get(jsonKey);
			return jsonValue;

		} catch (FileNotFoundException e) {
			Assert.fail("JSON file is not found");
			return null;
		}
	}
	
	public String editJSONValue(String jsonFileObj, String jsonKey) {
		return null;
		
	}



}
