package com.qa.x2crm.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.x2crm.pages.HomePage;
import com.qa.x2crm.pages.LoginPage;
import com.qa.x2crm.testbase.TestBase;
import com.qa.x2crm.util.TestUtils;

public class HomePageTest extends TestBase {
LoginPage loginPage;
HomePage homePage;
TestUtils testUtil;

@BeforeMethod
public void setUp() {
	initialization();
	testUtil = new TestUtils();
	loginPage = new LoginPage();
	homePage = loginPage.loginPageData(prop.getProperty("username"), prop.getProperty("password"));
}
@Test
public void verifyHomePageTitleTest() {
	String title=homePage.homePageTitle();
	Assert.assertEquals(title, "");
}

}
