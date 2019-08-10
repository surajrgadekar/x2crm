package com.qa.x2crm.test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.x2crm.pages.HomePage;
import com.qa.x2crm.pages.LoginPage;
import com.qa.x2crm.testbase.TestBase;
import com.qa.x2crm.util.TestUtils;
//import com.test.testcases.LoginPageTest;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	TestUtils testUtils;
	
	public static final Logger logger = Logger.getLogger(LoginPageTest.class.getName());
	public static String sheetName = "LoginD";
	
	public LoginPageTest() {
		super();
		logger.info("Initialise the super constructor");
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		testUtils = new TestUtils();
		loginPage=new LoginPage();
	}
	
	@Test(priority=1)
	public void loginTitleTest() {
		String pageTitle=loginPage.loginTitleTest();
		Assert.assertEquals(pageTitle, "X2CRM - Login");
		logger.info("Verify the login page Title");
	}
	
	
	@Test(priority=2)
	public void verifyLogoTest() {
		boolean b=loginPage.LogoTest();
		Assert.assertTrue(b);
		logger.info("Verify the logo Test");
	}

	//----------------------------------------------------------------------------------------------
	
	 @DataProvider 
	  public Object [][] loginDataProvider()throws Exception {
	  
	  Object [][] data = TestUtils.getTestData(sheetName);
	  
	  return data;
	  
	  }
	  @Test(priority = 4, dataProvider="loginDataProvider") 
	  public void LoginPageDataTest(String username, String password) throws IOException {
	  
	  loginPage.loginPageData(username, password);
	  logger.info("enter valid credintials through Data Provider...");
		
	  //---------------------------------------------------------------------------------------------
			  
	  }
	  @Test(priority=3)
		public void VerifyLoginTest() {
			homePage = loginPage.loginPageData(prop.getProperty("username"),prop.getProperty("password"));
			logger.info("Verify login Test with valid username and password...");
			
	  }
	

	  @Test(priority=5)
		public void InvalidUserNameTest() {
			String ActText=loginPage.lnvalidUsernameData(prop.getProperty("invuser"),prop.getProperty("password"));
			Assert.assertEquals(ActText, "Incorrect username or password. Note, usernames are case sensitive.");
			logger.info("enter invalid username...");
			
		}
		
	  @Test(priority=6)
		public void InvalidpasswordNameTest() {
			String ActText=loginPage.lnvalidPasswordData(prop.getProperty("username"),prop.getProperty("invpass"));
			Assert.assertEquals(ActText, "Incorrect username or password. Note, usernames are case sensitive.");
			logger.info("enter invalid password...");
		}
	  
	  @Test(priority=7)
		public void blankuserpasswordTest() {
			String ActText=loginPage.blankUserPass(prop.getProperty("bluser"),prop.getProperty("blpass"));
			Assert.assertEquals(ActText, "Password cannot be blank.");
			logger.info("enter blank username and password...");
		}
		
	  
	@AfterMethod()
	public void tearDown() {
		driver.quit();
		
		
	}
}
