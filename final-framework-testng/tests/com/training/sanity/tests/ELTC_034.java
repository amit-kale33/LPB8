package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_034 {
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
  public void ELTC034_ak() throws InterruptedException {
	  	//Login to as Teacher and reach at prerequisite
		loginPOM.sendUserName("amit.kale334");
		loginPOM.sendPassword("Manzoor@123");
		screenShot.captureScreenShot();
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot();
		loginPOM.clickbetaCourse1LinkBtn();
		
		//1. Click on Assignments icon
		loginPOM.clickassignmentLinkBtn();
		screenShot.captureScreenShot();
		
		//2. Click on Create assignments icon
		loginPOM.clickcreateAssignmentLinkBtn();
		screenShot.captureScreenShot();
		
		//3. Enter valid credentials in Assignments name textbox
		loginPOM.sendassignmentName("beta1");
		Thread.sleep(10000);
		screenShot.captureScreenShot();
		
		//4. Enter valid credentials in Assignments Description textbox
		driver.switchTo().frame(0);	
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Description of beta1");
		screenShot.captureScreenShot();
		
		//Moving to back to default screen or frame
		driver.switchTo().defaultContent();
		loginPOM.clickadvancedParamsLinkBtn();
		
		//5. Enter valid credentials in Maximum score textbox
		loginPOM.sendmaximumScore("100 to Pass");
		screenShot.captureScreenShot();
		
		//6. Click on Validate button
		loginPOM.clickform1submitBtn();
		screenShot.captureScreenShot();
		
		//7. click the check box beside created assignments
		loginPOM.clickassignementradioBtn();
		screenShot.captureScreenShot();
		loginPOM.clickbetaCourse1LinkBtn();
		screenShot.captureScreenShot();
		loginPOM.clicksettingLinkBtn();
		screenShot.captureScreenShot();
		
		//8. click on assignments settings icon
		loginPOM.clickassignmentsLinkBtn();
		screenShot.captureScreenShot();
		
		//9. click on yes radio button of Allow learners to delete their own 
		//publications.
		loginPOM.clickstudentDeleteOwnPublicationradioBtn();
		screenShot.captureScreenShot();
		
		//10. click on Save button
		loginPOM.clickcourseAssignmentSettingSaveBtn();
		screenShot.captureScreenShot();
		
  }
}
