package com.training.sanity.tests;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_064 {
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

  @Test (priority = 1)
  public void ELTC064_ak_teacherLogin() throws InterruptedException {
	  	//login as teacher
		loginPOM.sendUserName("amit.kale334");
		loginPOM.sendPassword("Manzoor@123");
		screenShot.captureScreenShot();
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot();
		
		//click on create course link
		loginPOM.clickcreateACourseBtn();
		screenShot.captureScreenShot();
		
		//sending value to course name
		loginPOM.sendcourseName("Gamma course 2");
		screenShot.captureScreenShot();
		loginPOM.clickadvancedParamsLinkBtn();
		screenShot.captureScreenShot();
		
		//selecting valid category
		driver.findElement(By.xpath("//button[@class='btn dropdown-toggle bs-placeholder btn-default']//div[@class='filter-option-inner-inner']")).click();
		Actions act = new Actions(driver); act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		screenShot.captureScreenShot();
		
		//Enter valid credential in Course code textbox
		loginPOM.sendmaddCourseWantedCode("GammaC2");
		screenShot.captureScreenShot();
		
		//Click on Create this course button
		loginPOM.clickaddCourseSubmitBtn();
		screenShot.captureScreenShot();
		
		//click on Add an introduction icon
		loginPOM.clickaddIntroductionTextForCourseBtn();
		screenShot.captureScreenShot();
		
		//Switch to textbox and enter valid value credentials
		Thread.sleep(10000);
		driver.switchTo().frame(0);	
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Introduction Gamma 2");
		driver.switchTo().defaultContent();
		screenShot.captureScreenShot();
		
		//Click on Save intro text
		loginPOM.clickintroductiontextIntroCmdUpdateBtn();
		screenShot.captureScreenShot();
		
		//Click on Course description icon
		loginPOM.clicktoolImageCourseDiscriptionBtn();
		screenShot.captureScreenShot();
		
		//Click on Description icon
		loginPOM.clickCourseDiscriptionBtn();
		screenShot.captureScreenShot();
		
		//Enter valid credentials in Title textbox and content text box.
		loginPOM.sendcourseDescriptionTitle("Course description Gamma 2");
		screenShot.captureScreenShot();
		Thread.sleep(10000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Description of Gamma");
		driver.switchTo().defaultContent();
		screenShot.captureScreenShot();
		
		//Click on Save button
		loginPOM.clickcourseDescriptionSubmit();
		screenShot.captureScreenShot();
		
		//Click on Objectives icon
		loginPOM.clickobjectiveLinkBtn();
		screenShot.captureScreenShot();
		
		//Enter valid credentials in Title textbox and content text box.
		loginPOM.sendcourseDescriptionTitle("Course Objective Gamma 2");
		screenShot.captureScreenShot();
		Thread.sleep(10000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Objective of Gamma2");
		driver.switchTo().defaultContent();
		screenShot.captureScreenShot();
		
		//Click on Save button
		loginPOM.clickcourseDescriptionSubmit();
		screenShot.captureScreenShot();
		
		// Click on Topics icon
		loginPOM.clicktopicsLinkBtn();
		
		//Enter valid credentials in Title textbox and content text box.
		loginPOM.sendcourseDescriptionTitle("Course Topic Gamma 2");
		screenShot.captureScreenShot();
		Thread.sleep(10000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Topic of Gamma2");
		driver.switchTo().defaultContent();
		screenShot.captureScreenShot();
		
		//Enter valid credentials in Title textbox and content text box.
		loginPOM.clickcourseDescriptionSubmit();
		screenShot.captureScreenShot();
		
		//Logging out from system.
		loginPOM.clickamitKaleLinkBtn();
		screenShot.captureScreenShot();
	  	loginPOM.clickLogoutBtn();
		screenShot.captureScreenShot();
  }
  @Test(priority = 2)
    public void FELTC064_ak_studentLogin() throws InterruptedException, Exception {
  	  	//login as Student
  	  	loginPOM.sendUserName("amit.kale332");
  		loginPOM.sendPassword("Manjoor@123");
  		screenShot.captureScreenShot();
  		loginPOM.clickLoginBtn(); 
  		screenShot.captureScreenShot();
  		
  		//click on Course catalog
  		loginPOM.clickcourseCatalogBtn();
  		screenShot.captureScreenShot();
  		
  		//Enter course name to register in search textbox
  		loginPOM.sendcourseSearchText("Gamma");
  		screenShot.captureScreenShot();
  		
  		//click on search button
  		loginPOM.clickcourseSearchButton();
  		screenShot.captureScreenShot();
  		
  		//To scroll down by clicking page down.
  		Robot robot = new Robot();
  		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
  		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
  		screenShot.captureScreenShot();
  		
  		//Click on Subscribe button of the course to get registered
  		loginPOM.clickcourseSubscribeButton();
  		screenShot.captureScreenShot();	
    }
    @Test (priority = 3)
    public void GELTC064_ak_adminLogin() throws InterruptedException, Exception {
  	  	//login as Admin
  	  	loginPOM.sendUserName("admin");
  		loginPOM.sendPassword("admin@123");
  		screenShot.captureScreenShot();
  		loginPOM.clickLoginBtn(); 
  		screenShot.captureScreenShot();
  		
  		//click on Reporting tab
  		loginPOM.clickReportingBtn();
  		screenShot.captureScreenShot();
  		
  		//click on Followed students link
  		loginPOM.clickfollowedStudentsBtn();
  		screenShot.captureScreenShot();
  		
  		//enter student name in keyword textbox
  		loginPOM.senduserSearchText("Priya");
  		screenShot.captureScreenShot();
  		
  		//click on search button
  		loginPOM.clickuserSearchLinkSubmit();
  		
  		// to scroll down by one page
  		Robot robot = new Robot();
  		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
  		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
  		Thread.sleep(1000);
  		screenShot.captureScreenShot();
  		
  		//click on >> icon of the student
  		loginPOM.clickstudentLink();
  		
  		// to scroll down by one page
  		Robot robot1 = new Robot();
  		robot1.keyPress(KeyEvent.VK_PAGE_DOWN);
  		robot1.keyRelease(KeyEvent.VK_PAGE_DOWN);
  		Thread.sleep(1000);
  		screenShot.captureScreenShot();
  		
  		//click on >> icon of the course
  		loginPOM.clickcourseLinkUnderStudent();
  		screenShot.captureScreenShot();	
    }

}
