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

public class ELTC_035 {
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
  public void ELTC035_ak() throws InterruptedException {
	  	//Login as teacher and doing prerequisite 
		loginPOM.sendUserName("amit.kale334");
		screenShot.captureScreenShot();
		loginPOM.sendPassword("Manzoor@123");
		screenShot.captureScreenShot();
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot();
		loginPOM.clickamitTest1LinkBtn();
		screenShot.captureScreenShot();
		
		//1. Click on Assignments icon
		loginPOM.clickassignmentLinkBtn();
		screenShot.captureScreenShot();
		
		//2. click on assignment submitted by the student
		loginPOM.clickAmitTest1LinkBtn();
		Thread.sleep(4000);
		screenShot.captureScreenShot();
		
		//3. click on correct and rate icon
		loginPOM.clickcorrectAndRateBtn();
		screenShot.captureScreenShot();
		
		//4. Enter valid credentials in score textbox
		loginPOM.sendqualification("80");
		screenShot.captureScreenShot();
		//Scroll to respective element
		driver.findElement(By.id("work_comment_button")).sendKeys(Keys.PAGE_DOWN);
		screenShot.captureScreenShot();
		
		//5. click on send message button
		loginPOM.clickworkCommentButtonBtn();
		screenShot.captureScreenShot();
		
		//6. click on name containing assignments link
		loginPOM.clickassignmentsLinkBtn();
		screenShot.captureScreenShot();
		loginPOM.clicktopicsLinkBtn();
		screenShot.captureScreenShot();
  }
}
