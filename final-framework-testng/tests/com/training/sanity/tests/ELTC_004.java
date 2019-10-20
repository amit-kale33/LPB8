package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_004 {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.FIREFOX);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void eltc004_ak() {
		screenShot.captureScreenShot();
		
		//Click on I Lost my password link
		loginPOM.clickiLostMyPasswordBtn();
		screenShot.captureScreenShot();
		
		//Enter valid credentials in Username or email textbox
		loginPOM.sendlostPasswordUser("amit.kale334");
		screenShot.captureScreenShot();
		
		//Click on Send message button
		loginPOM.clicklostPasswordSubmitBtn();
		screenShot.captureScreenShot();
		
		//To check if test case is passed or fail.
		String expected = "Your password has been reset";
	  	String actual = driver.findElement(By.xpath("//div[@class='col-md-9 col-md-push-3']//div[@class='page-content']//div[@class='alert alert-info']")).getText();
	  	Assert.assertEquals(expected, actual);

	}
}
