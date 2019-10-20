package com.training.sanity.tests;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_066 {
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
  public void ELTC066_ak_Teacher() throws InterruptedException, Exception {
	  	//login as teacher
		loginPOM.sendUserName("amit.kale334");
		loginPOM.sendPassword("Manzoor@123");
		screenShot.captureScreenShot();
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot();
		//click on create course link
		loginPOM.clickgammaCourse1LinkBtn() ;
		screenShot.captureScreenShot();
		
		//Click on Tests icon
		loginPOM.clicktestsLink();
		screenShot.captureScreenShot();
		
		//Click on Create a new test button
		loginPOM.clickceateNewTestLink();
		screenShot.captureScreenShot();
		
		//Enter valid credentials in Test name textbox
		loginPOM.sendtestName("Complex Test2");
		screenShot.captureScreenShot();
		
		//click on advanced setting button
		loginPOM.clickadvancedParamsLinkBtn();
		Thread.sleep(10000);
		screenShot.captureScreenShot();
		
		//enter valid credentials in Give a context to the test textbox
		driver.switchTo().frame(0);	
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Context of Complex Test2");
		screenShot.captureScreenShot();
		driver.switchTo().defaultContent();
		
		//click on At end of test radio button in Feedback section
		loginPOM.clickatTheEndOfTestRadioBtn();
		screenShot.captureScreenShot();
		
		//click on Enable start time checkbox
		loginPOM.clickenableStartTimeCkbox();
		screenShot.captureScreenShot();
		
		//Select valid credentials in time sections
		loginPOM.clickstartTimeAltText();
		screenShot.captureScreenShot();
		loginPOM.clicktestStartDatePicker19();
		screenShot.captureScreenShot();
		loginPOM.clickstartDateDoneBtn();
		screenShot.captureScreenShot();
		
		//Enter valid credentials in Pass percentage textbox
		loginPOM.sendpassPercentage("50");
		screenShot.captureScreenShot();
		
		//Click on Proceed to questions button
		loginPOM.clickexerciseAdminSubmitExerciseBtn();
		Thread.sleep(3000);
		screenShot.captureScreenShot();
		
		//Click on Multiple Choice icon
		loginPOM.clickmultipleChoiceBtn();
		Thread.sleep(3000);
		screenShot.captureScreenShot();
		
		//Enter valid credentials in Questions textbox
		loginPOM.sendQuestionAdminFromQuestionName("What is capital of USA?");
		
		//Enter all 4 option and enter values into their textbox.
		WebElement iframe2= driver.findElement(By.xpath("//div[@id='cke_2_contents']//iframe"));
  		driver.switchTo().frame(iframe2);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Washington D.C");
		screenShot.captureScreenShot();
		driver.switchTo().defaultContent();
		
		WebElement iframe4= driver.findElement(By.xpath("//div[@id='cke_4_contents']//iframe"));
  		driver.switchTo().frame(iframe4);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Los Angeles");
		screenShot.captureScreenShot();
		driver.switchTo().defaultContent();
				
		WebElement iframe6= driver.findElement(By.xpath("//div[@id='cke_6_contents']//iframe"));
  		driver.switchTo().frame(iframe6);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Texas");
		screenShot.captureScreenShot();
		driver.switchTo().defaultContent();
		
		WebElement iframe8= driver.findElement(By.xpath("//div[@id='cke_8_contents']//iframe"));
  		driver.switchTo().frame(iframe8);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("New York");
		screenShot.captureScreenShot();
		driver.switchTo().defaultContent();
		
		//click first option radio button
		loginPOM.clickfirstRadioButtonOfquestion();
		screenShot.captureScreenShot();
		
		//click on Add this question to the test
		loginPOM.clicksubmitQuestionBtn();
		screenShot.captureScreenShot();
		
		//Click on Multiple Choice icon
		loginPOM.clickmultipleChoiceBtn();
		Thread.sleep(3000);
		screenShot.captureScreenShot();
		
		// Enter valid credentials in Questions textbox
		loginPOM.sendQuestionAdminFromQuestionName("What is capital of Canada?");
		
		//Enter all 4 option and enter values into their textbox.
		WebElement iframe12= driver.findElement(By.xpath("//div[@id='cke_2_contents']//iframe"));
  		driver.switchTo().frame(iframe12);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Toronto");
		screenShot.captureScreenShot();
		driver.switchTo().defaultContent();
		
		WebElement iframe14= driver.findElement(By.xpath("//div[@id='cke_4_contents']//iframe"));
  		driver.switchTo().frame(iframe14);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Ottawa");
		screenShot.captureScreenShot();
		driver.switchTo().defaultContent();
				
		WebElement iframe16= driver.findElement(By.xpath("//div[@id='cke_6_contents']//iframe"));
  		driver.switchTo().frame(iframe16);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Montreal");
		screenShot.captureScreenShot();
		driver.switchTo().defaultContent();
		
		WebElement iframe18= driver.findElement(By.xpath("//div[@id='cke_8_contents']//iframe"));
  		driver.switchTo().frame(iframe18);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Edmonton");
		screenShot.captureScreenShot();
		driver.switchTo().defaultContent();
		
		
		loginPOM.clickfirstRadioButtonOfquestion();
		screenShot.captureScreenShot();
		
		//click on Add this question to the test
		loginPOM.clicksubmitQuestionBtn();
		screenShot.captureScreenShot();
		
		//click on preview icon
		loginPOM.clickpreviewLinkBtn();
		screenShot.captureScreenShot();
  }
  @Test (priority = 2)
  public void ELTC066_ak_student() throws InterruptedException, Exception {
	//login as Student
	  	boolean isExists = true;
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
		
		//to scroll down by page
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		screenShot.captureScreenShot();
		
		//To check if subscribe button is there and Click on Subscribe button 
		//of the course to get registered

		try {
			driver.findElement(By.xpath("//a[@class='btn btn-success btn-sm' and @title='Subscribe']"));
	    } catch (NoSuchElementException e) {
	        isExists = false;
	    }

		if (isExists == true) {
			loginPOM.clickcourseSubscribeButton();
			System.out.println("3");
			screenShot.captureScreenShot();
		}
		else {
			Robot robot1 = new Robot();
			robot1.keyPress(KeyEvent.VK_PAGE_UP);
			robot1.keyRelease(KeyEvent.VK_PAGE_UP);
		}
		
		
		loginPOM.clickmyCourseLink();
		screenShot.captureScreenShot();
		loginPOM.clickgammaCourse1LinkBtn() ;
		screenShot.captureScreenShot();
		
		//Click on Tests icon
		loginPOM.clicktestsLink();
		screenShot.captureScreenShot();
		
		//Click on Test name link
		loginPOM.clickmycomplexTest2Link();
		screenShot.captureScreenShot();
		
		//click on Start Test button
		isExists = true;
		try {
			driver.findElement(By.linkText("Start test"));
	    } catch (NoSuchElementException e) {
	        isExists = false;
	    }
		if (isExists == true) {
			loginPOM.clickstartTestLink();
		}
		else {
			loginPOM.clickproceedTestLink();
		}
		screenShot.captureScreenShot();
		
		//Answer the questions
		loginPOM.clickfirstRadioButtonOfAnswer();
		screenShot.captureScreenShot();
		loginPOM.clicknextQuestionButton();
		screenShot.captureScreenShot();
		loginPOM.clicksecondRadioButtonOfAnswer();
		screenShot.captureScreenShot();
		
		//Click on End Test button
		loginPOM.clickendTestButton();
		screenShot.captureScreenShot();
  }
  @Test (priority = 3)
  public void ELTC066_ak_Teacher2() throws InterruptedException, Exception {
	  	//Login as teacher
	  	loginPOM.sendUserName("amit.kale334");
		loginPOM.sendPassword("Manzoor@123");
		screenShot.captureScreenShot();
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot();
		//click on course link
		loginPOM.clickgammaCourse1LinkBtn() ;
		screenShot.captureScreenShot();
		
		//Click on Test icon
		loginPOM.clicktestsLink();
		screenShot.captureScreenShot();
		
		//click on Correct & rate icon of selected test
		loginPOM.clickresultAndFeedback();
		screenShot.captureScreenShot();
		
		//Click on grade activity icon
		loginPOM.clickgradeActivityLink();
		screenShot.captureScreenShot();
		
		//Click on Send Email checkbox
		loginPOM.clicksendEmailCheckBoxlinkBtn();
		screenShot.captureScreenShot();
		
		//click on correct test button
		loginPOM.clickformEmailSubmit();
		screenShot.captureScreenShot();
  }
}
