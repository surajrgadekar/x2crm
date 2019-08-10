package com.qa.x2crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.x2crm.testbase.TestBase;

public class LoginPage extends TestBase {

@FindBy(id="login-form-logo")
WebElement x2crmLogo;
	
@FindBy(xpath="//input[@id='LoginForm_username']")
WebElement et_username;

@FindBy(xpath="//input[@id='LoginForm_password']")
WebElement et_password;

@FindBy(xpath="//button[@id='signin-button']")
WebElement btn_submit;

@FindBy(xpath="//div[@class='errorMessage']")
WebElement error_msg;




	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean LogoTest() {
		return x2crmLogo.isDisplayed();
	}
	
	public String loginTitleTest() {
		return driver.getTitle();
	}
	
	
	public HomePage loginPageData(String uname,String passw) {
		et_username.sendKeys(uname);
		et_password.sendKeys(passw);
		btn_submit.click();
		return new HomePage();
		
}
	public String lnvalidUsernameData(String uname,String passw) {
		et_username.sendKeys(uname);
		et_password.sendKeys(passw);
		btn_submit.click();
		String ActText=error_msg.getText();
		
		return ActText;
		
}
	public String lnvalidPasswordData(String uname,String passw) {
		et_username.sendKeys(uname);
		et_password.sendKeys(passw);
		btn_submit.click();
		String ActText=error_msg.getText();
		
		return ActText;
		
}
	
	public String blankUserPass(String uname,String passw) {
		et_username.sendKeys("");
		et_password.sendKeys("");
		btn_submit.click();
		String ActText=error_msg.getText();
		
		return ActText;
		
}

}