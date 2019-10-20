package com.training.sanity.tests;

import java.awt.AWTException;
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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_065 {
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

  @Test 
  public void ELTC064_ak() throws InterruptedException, Exception {
	  	//login as teacher
		loginPOM.sendUserName("amit.kale334");
		loginPOM.sendPassword("Manzoor@123");
		screenShot.captureScreenShot();
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot();
		//click on create course link
		loginPOM.clickbetaCourse1LinkBtn() ;
		screenShot.captureScreenShot();
		
		//Click on Tests icon
		loginPOM.clicktestsLink();
		screenShot.captureScreenShot();
		
		//Click on Create a new test button
		loginPOM.clickceateNewTestLink();
		screenShot.captureScreenShot();
		
		//Enter valid credentials in Test name textbox
		loginPOM.sendtestName("Medium Test1");
		screenShot.captureScreenShot();
		
		//click on advanced setting button
		loginPOM.clickadvancedParamsLinkBtn();
		Thread.sleep(10000);
		screenShot.captureScreenShot();
		
		//enter valid credentials in Give a context to the test textbox
		driver.switchTo().frame(0);	
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Context of Medium Test1");
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
		loginPOM.clicktestStartDatePicker30();
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
		
		WebElement iframe3= driver.findElement(By.xpath("//div[@id='cke_3_contents']//iframe"));
  		driver.switchTo().frame(iframe3);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Texas is city");
		screenShot.captureScreenShot();
		driver.switchTo().defaultContent();
		
		WebElement iframe4= driver.findElement(By.xpath("//div[@id='cke_4_contents']//iframe"));
  		driver.switchTo().frame(iframe4);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Los Angeles");
		screenShot.captureScreenShot();
		driver.switchTo().defaultContent();
		
		WebElement iframe5= driver.findElement(By.xpath("//div[@id='cke_5_contents']//iframe"));
  		driver.switchTo().frame(iframe5);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("It  has night Life");
		screenShot.captureScreenShot();
		driver.switchTo().defaultContent();
		
		WebElement iframe6= driver.findElement(By.xpath("//div[@id='cke_6_contents']//iframe"));
  		driver.switchTo().frame(iframe6);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Texas");
		screenShot.captureScreenShot();
		driver.switchTo().defaultContent();
		
		WebElement iframe7= driver.findElement(By.xpath("//div[@id='cke_7_contents']//iframe"));
  		driver.switchTo().frame(iframe7);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Medicore City");
		screenShot.captureScreenShot();
		driver.switchTo().defaultContent();
		
		WebElement iframe8= driver.findElement(By.xpath("//div[@id='cke_8_contents']//iframe"));
  		driver.switchTo().frame(iframe8);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("New York");
		screenShot.captureScreenShot();
		driver.switchTo().defaultContent();
		
		WebElement iframe9= driver.findElement(By.xpath("//div[@id='cke_9_contents']//iframe"));
  		driver.switchTo().frame(iframe9);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Its costliest city");
		screenShot.captureScreenShot();
		driver.switchTo().defaultContent();
		
		//click first option radio button
		loginPOM.clickfirstRadioButtonOfquestion();
		screenShot.captureScreenShot();
		
		//click on Add this question to the test
		loginPOM.clicksubmitQuestionBtn();
		screenShot.captureScreenShot();
		
		//click on preview icon
		loginPOM.clickpreviewLinkBtn();
		screenShot.captureScreenShot();
  }
}
