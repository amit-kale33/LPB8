package com.training.sanity.tests;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_005 {
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
  public void ELTC004_ak() {
	  	screenShot.captureScreenShot();
	  	//1. Click on Sign Up! link
	  	loginPOM.clicksignUpBtn(); 
	  	screenShot.captureScreenShot();
	  	
	  	//10. Click Teacher radio button in Profile
	  	loginPOM.clickteacherOrStudent();
	  	screenShot.captureScreenShot();
	  	
	  	//2. Enter valid credential in First name textbox
	  	loginPOM.sendfirstName("Amit");
	  	
	  	//3. Enter valid credential in Last name textbox
		loginPOM.sendlastName("Kale");
		screenShot.captureScreenShot();
		
		//4. Enter valid credential in e-mail textbox
		loginPOM.sendemailId("Amit.kale336@gmail.com");
		
		//5. Enter valid credential in username textbox
		loginPOM.senduserNameSp("amit.kale336");
		screenShot.captureScreenShot();
		
		//6. Enter valid credential in pass textbox
		loginPOM.sendpass1("Manzoor@123");
		
		//7. Enter valid credential in confirm password textbox
		loginPOM.sendpass2("Manzoor@123");
		
		//8. Enter valid credential in phone textbox
		loginPOM.sendphoneNumber("9552534430");
		screenShot.captureScreenShot();
		
		//11. Click on Register button
		loginPOM.clicksubmit();
		screenShot.captureScreenShot();
				
  }

}
