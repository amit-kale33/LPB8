package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_036 {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

 @BeforeMethod
  public void beforeMethod() {
	  driver = DriverFactory.getDriver(DriverNames.FIREFOX);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		// open the browser 
		driver.get(baseUrl);
		screenShot = new ScreenShot(driver); 
  }

  @AfterMethod
  public void afterMethod() throws Exception {
	  Thread.sleep(1000);
	  driver.quit();
  }

  @BeforeClass
  public void beforeClass() throws IOException {
	  properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
  }

  @Test
  public void ELTC036_ak() throws InterruptedException {
	  
	  	//Login as teacher and reach at prerequisite stage
		loginPOM.sendUserName("amit.kale334");
		screenShot.captureScreenShot();
		loginPOM.sendPassword("Manzoor@123");
		screenShot.captureScreenShot();
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot();
		loginPOM.clickbetaCourse1LinkBtn();
		screenShot.captureScreenShot();
		
		//1. Click on Test icon
		loginPOM.clicktestsLink();
		screenShot.captureScreenShot();
		
		//2. click on Correct & rate icon of selected test
		loginPOM.clickresultAndFeedback();
		screenShot.captureScreenShot();
		
		//3. Click on grade activity icon
		loginPOM.clickgradeActivityLink();
		screenShot.captureScreenShot();
		
		//4. Click on Send Email checkbox
		loginPOM.clicksendEmailCheckBoxlinkBtn();
		screenShot.captureScreenShot();
		
		//5. click on correct test button
		loginPOM.clickformEmailSubmit();
		screenShot.captureScreenShot();
  }
}
