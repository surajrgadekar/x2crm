package com.qa.x2crm.test;

import org.testng.annotations.BeforeMethod;

import com.qa.x2crm.pages.ContactsPage;
import com.qa.x2crm.pages.HomePage;
import com.qa.x2crm.pages.LoginPage;
import com.qa.x2crm.testbase.TestBase;
import com.qa.x2crm.util.TestUtils;

public class ContactPageTest extends TestBase {

	HomePage homePage;
	LoginPage loginPage;
	ContactsPage contactsPage;
	TestUtils testUtils;
	
	public ContactPageTest() {
	super();
	logger.info("Initialise the constructor");
	}
	@BeforeMethod
	public void setup() {
		initialization();
		testUtils = new TestUtils();
		loginPage=new LoginPage();
		homePage=new HomePage();
	}
	
	
	
	
}
